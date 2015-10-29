package net.jockx.fluentpage;

import net.thucydides.core.pages.WebElementFacade;
import org.testng.Assert;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Assertion available from within PageObject chained calls
 * @param <T> actual subclass of {@link Page}
 */
@SuppressWarnings("unused")
public class Assertion<T extends Page<T>> {

    private final T page;

    Assertion(T pageObject) {
        this.page = pageObject;
    }

    /**
     * Asserts that a condition is true. If it isn't,
     * an AssertionError, with the given message, is thrown.
     *
     * @param condition the condition to evaluate
     * @param message   the assertion error message
     * @return calling {@link Page}
     */
    public T assertTrue(boolean condition, String message) {
        Assert.assertTrue(condition, message);
        return page;
    }

    /**
     * Asserts that a condition is true. If it isn't,
     * an AssertionError is thrown.
     *
     * @param condition the condition to evaluate
     * @return calling {@link Page}
     */
    public T assertTrue(boolean condition) {
        Assert.assertTrue(condition, null);
        return page;
    }

    /**
     * Asserts that a condition is false. If it isn't,
     * an AssertionError, with the given message, is thrown.
     *
     * @param condition the condition to evaluate
     * @param message   the assertion error message
     * @return calling {@link Page}
     */
    public T assertFalse(boolean condition, String message) {
        Assert.assertFalse(condition, message);
        return page;
    }

    /**
     * Asserts that a condition is false. If it isn't,
     * an AssertionError is thrown.
     *
     * @param condition the condition to evaluate
     * @return calling {@link Page}
     */
    public T assertFalse(boolean condition) {
        Assert.assertFalse(condition, null);
        return page;
    }

    /**
     * Fails a test with the given message and wrapping the original exception.
     *
     * @param message   the assertion error message
     * @param realCause the original exception
     * @return calling {@link Page}
     */
    public T fail(String message, Throwable realCause) {
        Assert.fail(message, realCause);
        return page;
    }

    /**
     * Fails a test with the given message.
     *
     * @param message the assertion error message
     * @return calling {@link Page}
     */
    public T fail(String message) {
        Assert.fail(message);
        return page;
    }

    /**
     * Fails a test with no message.
     *
     * @return calling {@link Page}
     */
    public T fail() {
        Assert.fail();
        return page;
    }

    /**
     * Asserts that two objects are equal. If they are not,
     * an AssertionError, with the given message, is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEquals(Object actual, Object expected, String message) {
        Assert.assertEquals(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two objects are equal. If they are not,
     * an AssertionError is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertEquals(Object actual, Object expected) {
        Assert.assertEquals(actual, expected);
        return page;
    }

    /**
     * Asserts that two Strings are equal. If they are not,
     * an AssertionError, with the given message, is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEquals(String actual, String expected, String message) {
        Assert.assertEquals(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two Strings are equal. If they are not,
     * an AssertionError is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertEquals(String actual, String expected) {
        Assert.assertEquals(actual, expected);
        return page;
    }

    /**
     * Asserts that two doubles are equal concerning a delta.  If they are not,
     * an AssertionError, with the given message, is thrown.  If the expected
     * value is infinity then the delta value is ignored.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param delta    the absolute tolerable difference between the actual and expected values
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEquals(double actual, double expected, double delta, String message) {
        Assert.assertEquals(actual, expected, delta, message);
        return page;
    }

    /**
     * Asserts that two doubles are equal concerning a delta. If they are not,
     * an AssertionError is thrown. If the expected value is infinity then the
     * delta value is ignored.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param delta    the absolute tolerable difference between the actual and expected values
     * @return calling {@link Page}
     */
    public T assertEquals(double actual, double expected, double delta) {
        Assert.assertEquals(actual, expected, delta);
        return page;
    }

    /**
     * Asserts that two floats are equal concerning a delta. If they are not,
     * an AssertionError, with the given message, is thrown.  If the expected
     * value is infinity then the delta value is ignored.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param delta    the absolute tolerable difference between the actual and expected values
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEquals(float actual, float expected, float delta, String message) {
        Assert.assertEquals(actual, expected, delta, message);
        return page;
    }

    /**
     * Asserts that two floats are equal concerning a delta. If they are not,
     * an AssertionError is thrown. If the expected
     * value is infinity then the delta value is ignored.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param delta    the absolute tolerable difference between the actual and expected values
     * @return calling {@link Page}
     */
    public T assertEquals(float actual, float expected, float delta) {
        Assert.assertEquals(actual, expected, delta);
        return page;
    }

    /**
     * Asserts that two longs are equal. If they are not,
     * an AssertionError, with the given message, is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEquals(long actual, long expected, String message) {
        Assert.assertEquals(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two longs are equal. If they are not,
     * an AssertionError is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertEquals(long actual, long expected) {
        Assert.assertEquals(actual, expected);
        return page;
    }

    /**
     * Asserts that two booleans are equal. If they are not,
     * an AssertionError, with the given message, is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEquals(boolean actual, boolean expected, String message) {
        Assert.assertEquals(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two booleans are equal. If they are not,
     * an AssertionError is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertEquals(boolean actual, boolean expected) {
        Assert.assertEquals(actual, expected);
        return page;
    }

    /**
     * Asserts that two bytes are equal. If they are not,
     * an AssertionError, with the given message, is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEquals(byte actual, byte expected, String message) {
        Assert.assertEquals(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two bytes are equal. If they are not,
     * an AssertionError is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertEquals(byte actual, byte expected) {
        Assert.assertEquals(actual, expected);
        return page;
    }

    /**
     * Asserts that two chars are equal. If they are not,
     * an AssertionFailedError, with the given message, is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEquals(char actual, char expected, String message) {
        Assert.assertEquals(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two chars are equal. If they are not,
     * an AssertionError is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertEquals(char actual, char expected) {
        Assert.assertEquals(actual, expected);
        return page;
    }

    /**
     * Asserts that two shorts are equal. If they are not,
     * an AssertionFailedError, with the given message, is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEquals(short actual, short expected, String message) {
        Assert.assertEquals(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two shorts are equal. If they are not,
     * an AssertionError is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertEquals(short actual, short expected) {
        Assert.assertEquals(actual, expected);
        return page;
    }

    /**
     * Asserts that two ints are equal. If they are not,
     * an AssertionFailedError, with the given message, is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEquals(int actual, int expected, String message) {
        Assert.assertEquals(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two ints are equal. If they are not,
     * an AssertionError is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertEquals(int actual, int expected) {
        Assert.assertEquals(actual, expected);
        return page;
    }

    /**
     * Asserts that an object isn't null. If it is,
     * an AssertionError is thrown.
     *
     * @param object the assertion object
     * @return calling {@link Page}
     */
    public T assertNotNull(Object object) {
        Assert.assertNotNull(object);
        return page;
    }

    /**
     * Asserts that an object isn't null. If it is,
     * an AssertionFailedError, with the given message, is thrown.
     *
     * @param object  the assertion object
     * @param message the assertion error message
     * @return calling {@link Page}
     */
    public T assertNotNull(Object object, String message) {
        Assert.assertNotNull(object, message);
        return page;
    }

    /**
     * Asserts that an object is null. If it is not,
     * an AssertionError, with the given message, is thrown.
     *
     * @param object the assertion object
     * @return calling {@link Page}
     */
    public T assertNull(Object object) {
        Assert.assertNull(object);
        return page;
    }

    /**
     * Asserts that an object is null. If it is not,
     * an AssertionFailedError, with the given message, is thrown.
     *
     * @param object  the assertion object
     * @param message the assertion error message
     * @return calling {@link Page}
     */
    public T assertNull(Object object, String message) {
        Assert.assertNull(object, message);
        return page;
    }

    /**
     * Asserts that two objects refer to the same object. If they do not,
     * an AssertionFailedError, with the given message, is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertSame(Object actual, Object expected, String message) {
        Assert.assertSame(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two objects refer to the same object. If they do not,
     * an AssertionError is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertSame(Object actual, Object expected) {
        Assert.assertSame(actual, expected);
        return page;
    }

    /**
     * Asserts that two objects do not refer to the same objects. If they do,
     * an AssertionError, with the given message, is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertNotSame(Object actual, Object expected, String message) {
        Assert.assertNotSame(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two objects do not refer to the same object. If they do,
     * an AssertionError is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertNotSame(Object actual, Object expected) {
        Assert.assertNotSame(actual, expected);
        return page;
    }

    /**
     * Asserts that two collections contain the same elements in the same order. If they do not,
     * an AssertionError is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertEquals(Collection<?> actual, Collection<?> expected) {
        Assert.assertEquals(actual, expected);
        return page;
    }

    /**
     * Asserts that two collections contain the same elements in the same order. If they do not,
     * an AssertionError, with the given message, is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEquals(Collection<?> actual, Collection<?> expected, String message) {
        Assert.assertEquals(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two iterators return the same elements in the same order. If they do not,
     * an AssertionError is thrown.
     * Please note that this assert iterates over the elements and modifies the state of the iterators.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertEquals(Iterator<?> actual, Iterator<?> expected) {
        Assert.assertEquals(actual, expected);
        return page;
    }

    /**
     * Asserts that two iterators return the same elements in the same order. If they do not,
     * an AssertionError, with the given message, is thrown.
     * Please note that this assert iterates over the elements and modifies the state of the iterators.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEquals(Iterator<?> actual, Iterator<?> expected, String message) {
        Assert.assertEquals(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two iterables return iterators with the same elements in the same order. If they do not,
     * an AssertionError is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertEquals(Iterable<?> actual, Iterable<?> expected) {
        Assert.assertEquals(actual, expected);
        return page;
    }

    /**
     * Asserts that two iterables return iterators with the same elements in the same order. If they do not,
     * an AssertionError, with the given message, is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEquals(Iterable<?> actual, Iterable<?> expected, String message) {
        Assert.assertEquals(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two arrays contain the same elements in the same order. If they do not,
     * an AssertionError, with the given message, is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEquals(Object[] actual, Object[] expected, String message) {
        Assert.assertEquals(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two arrays contain the same elements in no particular order. If they do not,
     * an AssertionError, with the given message, is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEqualsNoOrder(Object[] actual, Object[] expected, String message) {
        Assert.assertEqualsNoOrder(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two arrays contain the same elements in the same order. If they do not,
     * an AssertionError is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertEquals(Object[] actual, Object[] expected) {
        Assert.assertEquals(actual, expected);
        return page;
    }

    /**
     * Asserts that two arrays contain the same elements in no particular order. If they do not,
     * an AssertionError is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertEqualsNoOrder(Object[] actual, Object[] expected) {
        Assert.assertEqualsNoOrder(actual, expected);
        return page;
    }

    /**
     * Asserts that two arrays contain the same elements in the same order. If they do not,
     * an AssertionError is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertEquals(final byte[] actual, final byte[] expected) {
        Assert.assertEquals(actual, expected);
        return page;
    }

    /**
     * Asserts that two arrays contain the same elements in the same order. If they do not,
     * an AssertionError, with the given message, is thrown.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEquals(final byte[] actual, final byte[] expected, final String message) {
        Assert.assertEquals(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two sets are equal.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertEquals(Set<?> actual, Set<?> expected) {
        Assert.assertEquals(actual, expected);
        return page;
    }

    /**
     * Asserts that two sets are equal.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertEquals(Set<?> actual, Set<?> expected, String message) {
        Assert.assertEquals(actual, expected, message);
        return page;
    }

    /**
     * Asserts that two maps are equal.
     *
     * @param actual   the actual value
     * @param expected the expected value
     * @return calling {@link Page}
     */
    public T assertEquals(Map<?, ?> actual, Map<?, ?> expected) {
        Assert.assertEquals(actual, expected);
        return page;

    }

    /**
     * Assert not equals
     *
     * @param actual1 the first value
     * @param actual2 the second value
     * @param message the assertion error message
     * @return calling {@link Page}
     */
    public T assertNotEquals(Object actual1, Object actual2, String message) {
        Assert.assertNotEquals(actual1, actual2, message);
        return page;
    }

    /**
     * Assert not equals
     *
     * @param actual1 the first value
     * @param actual2 the second value
     * @return calling {@link Page}
     */
    public T assertNotEquals(Object actual1, Object actual2) {
        Assert.assertNotEquals(actual1, actual2);
        return page;
    }


    /**
     * Asserts that two floats are not equal concerning a delta.  If they are,
     * an AssertionError, with the given message, is thrown
     *
     * @param actual1 the first value
     * @param actual2 the second value
     * @param delta   the absolute tolerable difference between the actual and expected values
     * @param message the assertion error message
     * @return calling {@link Page}
     */
    public T assertNotEquals(float actual1, float actual2, float delta, String message) {
        Assert.assertNotEquals(actual1, actual2, delta, message);
        return page;
    }

    /**
     * Asserts that two floats are not equal concerning a delta.  If they are,
     * an AssertionError, with the given message, is thrown
     *
     * @param actual1 the first value
     * @param actual2 the second value
     * @param delta   the absolute tolerable difference between the actual and expected values
     * @return calling {@link Page}
     */
    public T assertNotEquals(float actual1, float actual2, float delta) {
        Assert.assertNotEquals(actual1, actual2, delta);
        return page;
    }

    /**
     * Asserts that two doubles are not equal concerning a delta.  If they are,
     * an AssertionError, with the given message, is thrown
     *
     * @param actual1 the first value
     * @param actual2 the second value
     * @param delta   the absolute tolerable difference between the actual and expected values
     * @param message the assertion error message
     * @return calling {@link Page}
     */
    public T assertNotEquals(double actual1, double actual2, double delta, String message) {
        Assert.assertNotEquals(actual1, actual2, delta, message);
        return page;
    }

    /**
     * Asserts that two doubles are not equal concerning a delta.  If they are,
     * an AssertionError, with the given message, is thrown
     *
     * @param actual1 the first value
     * @param actual2 the second value
     * @param delta   the absolute tolerable difference between the actual and expected values
     * @return calling {@link Page}
     */
    public T assertNotEquals(double actual1, double actual2, double delta) {
        Assert.assertNotEquals(actual1, actual2, delta);
        return page;
    }

    // Selenium specials

    /**
     * Asserts that one String is contained in another
     *
     * @param text     String to search in
     * @param fragment String to search for
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertContains(String text, String fragment, String message) {
        if (!text.contains(fragment)) {
            Assert.fail(message + ": expected [" + text + "] to contain [" + fragment + "]");
        }
        return page;
    }

    /**
     * Asserts that one String is not contained in another
     *
     * @param text     String to search in
     * @param fragment String to search for
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertNotContains(String text, String fragment, String message) {
        if (text.contains(fragment)) {
            Assert.fail(message + ": expected [" + text + "] not to contain [" + fragment + "]");
        }
        return page;
    }

    /**
     * Asserts that one String starts with another
     *
     * @param text     String to search through
     * @param fragment String to search for
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertTextStartsWith(String text, String fragment, String message) {
        if (!text.startsWith(fragment)) {
            Assert.fail(message + ": expected [" + text + "] to start with [" + fragment + "]");
        }
        return page;
    }

    /**
     * Asserts that one String ends with another
     *
     * @param text     String to search through
     * @param fragment String to search for
     * @param message  the assertion error message
     * @return calling {@link Page}
     */
    public T assertTextEndsWith(String text, String fragment, String message) {
        if (!text.endsWith(fragment)) {
            Assert.fail(message + ": expected [" + text + "] to end with [" + fragment + "]");
        }
        return page;
    }

    /**
     * Asserts that a collection contains an object
     *
     * @param collection Collection of elements
     * @param object     actual object expected to be present in collection
     * @param message    the assertion error message
     * @return calling {@link Page}
     */
    public T assertContains(Collection collection, Object object, String message) {
        Assert.assertTrue(collection.contains(object), message);
        return page;
    }

    /**
     * Asserts that a collection does not contains an object
     *
     * @param collection Collection of elements
     * @param object     actual object expected to be present in collection
     * @param message    the assertion error message
     * @return calling {@link Page}
     */
    public T assertNotContains(Collection collection, Object object, String message) {
        Assert.assertFalse(collection.contains(object), message);
        return page;
    }

    /**
     * Asserts that WebElementFacade is visible on the page
     *
     * @param element element to verify
     * @param message the assertion error message
     * @return calling {@link Page}
     */
    public T assertVisible(WebElementFacade element, String message) {
        Assert.assertTrue(element.isVisible(), message);
        return page;
    }

    /**
     * Asserts that WebElementFacade is not visible on the page
     *
     * @param element element to verify
     * @param message the assertion error message
     * @return calling {@link Page}
     */
    public T assertNotVisible(WebElementFacade element, String message) {
        Assert.assertFalse(element.isVisible(), message);
        return page;
    }

    /**
     * Asserts that WebElementFacade is enabled on the page
     *
     * @param element element to verify
     * @param message the assertion error message
     * @return calling {@link Page}
     */
    public T assertEnabled(WebElementFacade element, String message) {
        Assert.assertTrue(element.isEnabled(), message);
        return page;
    }

    /**
     * Asserts that WebElementFacade is not enabled on the page
     *
     * @param element element to verify
     * @param message the assertion error message
     * @return calling {@link Page}
     */
    public T assertNotEnabled(WebElementFacade element, String message) {
        Assert.assertFalse(element.isEnabled(), message);
        return page;
    }

    /**
     * Asserts that WebElementFacade is present on the page
     *
     * @param element element to verify
     * @param message the assertion error message
     * @return calling {@link Page}
     */
    public T assertPresent(WebElementFacade element, String message) {
        Assert.assertTrue(element.isPresent(), message);
        return page;
    }

    /**
     * Asserts that WebElementFacade is not present on the page
     *
     * @param element element to verify
     * @param message the assertion error message
     * @return calling {@link Page}
     */
    public T assertNotPresent(WebElementFacade element, String message) {
        Assert.assertFalse(element.isPresent(), message);
        return page;
    }
}
