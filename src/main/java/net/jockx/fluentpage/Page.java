package net.jockx.fluentpage;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.Pages;
import org.openqa.selenium.WebDriver;

/**
 * Page should be used as a base class for all your {@link PageObject} child classes
 * to allow using nested {@link Assertion} and {@link Logger}.
 */
@SuppressWarnings({"unchecked", "unused"})
public class Page<T extends Page<T>> extends PageObject {

	/**
	 * Initialization step is required before any {@link Page} can be obtained statically. It is also needed
	 * when the {@link WebDriver} instance used by tests is changed.
	 *
	 * @param webDriver {@link WebDriver} instance that all inherited PageObjects will use
	 */
	public static void initialize(WebDriver webDriver) {
		driver = webDriver;
		instance = new Page();
		instance.logger.info("Starting with {}", webDriver);
	}

	/**
	 * Executes overridden {@link #waitToLoad()} method and returns a reference to it's instance
	 * @param type name of class extending {@link Page} to wait for
	 * @return instance of class specified by {@code type} parameter
	 */
	public static <T extends Page> T waitForPage(Class<T> type) {
		return (T) Page.get(type).waitToLoad();
	}

	/**
	 * Executes overridden {@link #navigateTo()} method and returns a reference to it's instance
	 * @param type name of class extending {@link Page} to navigate to
	 * @return instance of class specified by {@code type} parameter
	 */
	public static <T extends Page> T navigateToPage(Class<T> type) {
		return (T) Page.get(type).navigateTo();
	}

	/**
	 * Gets a class instance without any additional actions
	 * @param type name of class extending {@link Page} to obtain
	 * @return instance of class specified by {@code type} parameter
	 */
	public static <T extends Page> T get(Class<T> type) {
		return instance.switchToPage(type);
	}

	/**
	 * @return instance of {@link Page} class
	 */
	public static Page get() {
		return instance;
	}


	private static Page instance;

	private static WebDriver driver;


	private final T page;

	/**
	 * A reference to {@link Assertion} to be used for calling chained assertions. Any method called
	 * using this reference will return back a reference to {@code 'this'}.
	 */
	public final Assertion<T> assertion;

	/**
	 * A reference to {@link Logger} to be used for calling chained logging statements. Any method called
	 * using this reference will return back a reference to {@code 'this'}.
	 */
	public final Logger<T> logger;

	public Page(){
		super(driver);
		if(driver == null){
			throw new IllegalStateException("No WebDriver found or initial setup is not complete. " +
					"Please call Page.initialize(driver) first.");
		}
		page = (T) this;
		logger = new Logger<>(page);
		assertion = new Assertion<>(page);
		setPages(new Pages(driver));
	}

	/**
	 * Represents a set of actions required to navigate to a given page, that can be called from
	 * standalone context. For example typing in an url or clicking several buttons in succession
	 */
	public T navigateTo() {
		return page.waitToLoad();
	}

	/**
	 * Should be contain a set of conditions that are required for the page to be considered loaded.
	 * For example - waiting a set amount of time or until some element is visible
	 */
	public T waitToLoad(){
		logger.debug("Waiting for " + this.getClass().toGenericString());
		return page;
	}

	/**
	 * @return current url retrieved from {@link WebDriver}
	 */
	public static String getCurrentUrl() {
		return Page.get().getDriver().getCurrentUrl();
	}
}
