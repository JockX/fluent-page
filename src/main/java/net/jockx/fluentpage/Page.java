package net.jockx.fluentpage;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.Pages;
import org.openqa.selenium.WebDriver;

/**
 * Created by JockX on 2015-06-10.
 *
 */
@SuppressWarnings({"unchecked", "unused"})
public class Page<T extends Page<T>> extends PageObject {

	public static void initialize(WebDriver webDriver) {
		driver = webDriver;
		instance = new Page();
		instance.logger.info("Starting with {}", webDriver);
	}

	public static <T extends Page> T waitForPage(Class<T> type) {
		return (T) Page.get(type).waitToLoad();
	}

	public static <T extends Page> T navigateToPage(Class<T> type) {
		return (T) Page.get(type).navigateTo();
	}

	public static <T extends Page> T get(Class<T> type) {
		return instance.switchToPage(type);
	}

	public static Page get() {
		return instance;
	}


	private static Page instance;

	private static WebDriver driver;


	private final T page;

	public final Assertion<T> assertion;

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

	public String getCurrentUrl() {
		return getDriver().getCurrentUrl();
	}

	public String getTitle(){
		return getDriver().getTitle();
	}
}
