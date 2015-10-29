package net.jockx.fluentpage;

import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

/**
 * Logger available from within PageObject chained calls
 * @param <T> actual subclass of {@link Page}
 */
@SuppressWarnings("unused")
public class Logger<T extends Page<T>> {

    private final T page;

    private final org.slf4j.Logger logger;

    Logger(T pageObject) {
        this.page = pageObject;
        this.logger = LoggerFactory.getLogger(page.getClass());
    }

    /**
     * Log a message at the TRACE level.
     *
     * @param msg the message string to be logged
     * @return calling {@link Page}
     */
    public T trace(String msg) {
        logger.trace(msg);
        return page;
    }

    /**
     * Log a message at the TRACE level according to the specified format
     * and argument.
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the TRACE level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     * @return calling {@link Page}
     */
    public T trace(String format, Object arg) {
        logger.trace(format, arg);
        return page;
    }

    /**
     * Log a message at the TRACE level according to the specified format
     * and arguments.
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the TRACE level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     * @return calling {@link Page}
     */
    public T trace(String format, Object arg1, Object arg2) {
        logger.trace(format, arg1, arg2);
        return page;
    }

    /**
     * Log a message at the TRACE level according to the specified format
     * and arguments.
     * <p>This form avoids superfluous string concatenation when the logger
     * is disabled for the TRACE level. However, this variant incurs the hidden
     * (and relatively small) cost of creating an <code>Object[]</code> before invoking the method,
     * even if this logger is disabled for TRACE. The variants taking {@link #trace(String, Object) one} and
     * {@link #trace(String, Object, Object) two} arguments exist solely in order to avoid this hidden cost.</p>
     *
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     * @return calling {@link Page}
     */
    public T trace(String format, Object... arguments) {
        logger.trace(format, arguments);
        return page;
    }

    /**
     * Log an exception (throwable) at the TRACE level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     * @return calling {@link Page}
     */
    public T trace(String msg, Throwable t) {
        logger.trace(msg, t);
        return page;
    }

    /**
     * Log a message with the specific Marker at the TRACE level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg    the message string to be logged
     * @return calling {@link Page}
     */
    public T trace(Marker marker, String msg) {
        logger.trace(marker, msg);
        return page;
    }

    /**
     * This method is similar to {@link #trace(String, Object)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg    the argument
     * @return calling {@link Page}
     */
    public T trace(Marker marker, String format, Object arg) {
        logger.trace(marker, format, arg);
        return page;
    }

    /**
     * This method is similar to {@link #trace(String, Object, Object)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     * @return calling {@link Page}
     */
    public T trace(Marker marker, String format, Object arg1, Object arg2) {
        logger.trace(marker, format, arg1, arg2);
        return page;
    }

    /**
     * This method is similar to {@link #trace(String, Object...)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker   the marker data specific to this log statement
     * @param format   the format string
     * @param argArray an array of arguments
     * @return calling {@link Page}
     */
    public T trace(Marker marker, String format, Object... argArray) {
        logger.trace(marker, format, argArray);
        return page;
    }

    /**
     * This method is similar to {@link #trace(String, Throwable)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param msg    the message accompanying the exception
     * @param t      the exception (throwable) to log
     * @return calling {@link Page}
     */
    public T trace(Marker marker, String msg, Throwable t) {
        logger.trace(marker, msg, t);
        return page;
    }


    /**
     * Log a message at the DEBUG level.
     *
     * @param msg the message string to be logged
     * @return calling {@link Page}
     */
    public T debug(String msg) {
        logger.debug(msg);
        return page;
    }

    /**
     * Log a message at the DEBUG level according to the specified format
     * and argument.
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the DEBUG level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     * @return calling {@link Page}
     */
    public T debug(String format, Object arg) {
        logger.debug(format, arg);
        return page;
    }

    /**
     * Log a message at the DEBUG level according to the specified format
     * and arguments.
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the DEBUG level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     * @return calling {@link Page}
     */
    public T debug(String format, Object arg1, Object arg2) {
        logger.debug(format, arg1, arg2);
        return page;
    }

    /**
     * Log a message at the DEBUG level according to the specified format
     * and arguments.
     * <p>This form avoids superfluous string concatenation when the logger
     * is disabled for the DEBUG level. However, this variant incurs the hidden
     * (and relatively small) cost of creating an <code>Object[]</code> before invoking the method,
     * even if this logger is disabled for DEBUG. The variants taking
     * {@link #debug(String, Object) one} and {@link #debug(String, Object, Object) two}
     * arguments exist solely in order to avoid this hidden cost.</p>
     *
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     * @return calling {@link Page}
     */
    public T debug(String format, Object... arguments) {
        logger.debug(format, arguments);
        return page;
    }

    /**
     * Log an exception (throwable) at the DEBUG level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     * @return calling {@link Page}
     */
    public T debug(String msg, Throwable t) {
        logger.debug(msg, t);
        return page;
    }

    /**
     * Log a message with the specific Marker at the DEBUG level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg    the message string to be logged
     * @return calling {@link Page}
     */
    public T debug(Marker marker, String msg) {
        logger.debug(marker, msg);
        return page;
    }

    /**
     * This method is similar to {@link #debug(String, Object)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg    the argument
     * @return calling {@link Page}
     */
    public T debug(Marker marker, String format, Object arg) {
        logger.debug(marker, format, arg);
        return page;
    }

    /**
     * This method is similar to {@link #debug(String, Object, Object)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     * @return calling {@link Page}
     */
    public T debug(Marker marker, String format, Object arg1, Object arg2) {
        logger.debug(marker, format, arg1, arg2);
        return page;
    }

    /**
     * This method is similar to {@link #debug(String, Object...)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker    the marker data specific to this log statement
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     * @return calling {@link Page}
     */
    public T debug(Marker marker, String format, Object... arguments) {
        logger.debug(marker, format, arguments);
        return page;
    }

    /**
     * This method is similar to {@link #debug(String, Throwable)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param msg    the message accompanying the exception
     * @param t      the exception (throwable) to log
     * @return calling {@link Page}
     */
    public T debug(Marker marker, String msg, Throwable t) {
        logger.debug(marker, msg, t);
        return page;
    }

    /**
     * Log a message at the INFO level.
     *
     * @param msg the message string to be logged
     * @return calling {@link Page}
     */
    public T info(String msg) {
        logger.info(msg);
        return page;
    }

    /**
     * Log a message at the INFO level according to the specified format
     * and argument.
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the INFO level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     * @return calling {@link Page}
     */
    public T info(String format, Object arg) {
        logger.info(format, arg);
        return page;
    }


    /**
     * Log a message at the INFO level according to the specified format
     * and arguments.
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the INFO level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     * @return calling {@link Page}
     */
    public T info(String format, Object arg1, Object arg2) {
        logger.info(format, arg1, arg2);
        return page;
    }

    /**
     * Log a message at the INFO level according to the specified format
     * and arguments.
     * <p>This form avoids superfluous string concatenation when the logger
     * is disabled for the INFO level. However, this variant incurs the hidden
     * (and relatively small) cost of creating an <code>Object[]</code> before invoking the method,
     * even if this logger is disabled for INFO. The variants taking
     * {@link #info(String, Object) one} and {@link #info(String, Object, Object) two}
     * arguments exist solely in order to avoid this hidden cost.</p>
     *
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     * @return calling {@link Page}
     */
    public T info(String format, Object... arguments) {
        logger.info(format, arguments);
        return page;
    }

    /**
     * Log an exception (throwable) at the INFO level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     * @return calling {@link Page}
     */
    public T info(String msg, Throwable t) {
        logger.info(msg, t);
        return page;
    }

    /**
     * Log a message with the specific Marker at the INFO level.
     *
     * @param marker The marker specific to this log statement
     * @param msg    the message string to be logged
     * @return calling {@link Page}
     */
    public T info(Marker marker, String msg) {
        logger.info(marker, msg);
        return page;
    }

    /**
     * This method is similar to {@link #info(String, Object)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg    the argument
     * @return calling {@link Page}
     */
    public T info(Marker marker, String format, Object arg) {
        logger.info(marker, format, arg);
        return page;
    }

    /**
     * This method is similar to {@link #info(String, Object, Object)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     * @return calling {@link Page}
     */
    public T info(Marker marker, String format, Object arg1, Object arg2) {
        logger.info(marker, format, arg1, arg2);
        return page;
    }

    /**
     * This method is similar to {@link #info(String, Object...)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker    the marker data specific to this log statement
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     * @return calling {@link Page}
     */
    public T info(Marker marker, String format, Object... arguments) {
        logger.info(marker, format, arguments);
        return page;
    }

    /**
     * This method is similar to {@link #info(String, Throwable)} method
     * except that the marker data is also taken into consideration.
     *
     * @param marker the marker data for this log statement
     * @param msg    the message accompanying the exception
     * @param t      the exception (throwable) to log
     * @return calling {@link Page}
     */
    public T info(Marker marker, String msg, Throwable t) {
        logger.info(marker, msg, t);
        return page;
    }

    /**
     * Log a message at the WARN level.
     *
     * @param msg the message string to be logged
     * @return calling {@link Page}
     */
    public T warn(String msg) {
        logger.warn(msg);
        return page;
    }

    /**
     * Log a message at the WARN level according to the specified format
     * and argument.
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the WARN level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     * @return calling {@link Page}
     */
    public T warn(String format, Object arg) {
        logger.warn(format, arg);
        return page;
    }

    /**
     * Log a message at the WARN level according to the specified format
     * and arguments.
     * <p>This form avoids superfluous string concatenation when the logger
     * is disabled for the WARN level. However, this variant incurs the hidden
     * (and relatively small) cost of creating an <code>Object[]</code> before invoking the method,
     * even if this logger is disabled for WARN. The variants taking
     * {@link #warn(String, Object) one} and {@link #warn(String, Object, Object) two}
     * arguments exist solely in order to avoid this hidden cost.</p>
     *
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     * @return calling {@link Page}
     */
    public T warn(String format, Object... arguments) {
        logger.warn(format, arguments);
        return page;
    }

    /**
     * Log a message at the WARN level according to the specified format
     * and arguments.
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the WARN level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     * @return calling {@link Page}
     */
    public T warn(String format, Object arg1, Object arg2) {
        logger.warn(format, arg1, arg2);
        return page;
    }

    /**
     * Log an exception (throwable) at the WARN level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     * @return calling {@link Page}
     */
    public T warn(String msg, Throwable t) {
        logger.warn(msg, t);
        return page;
    }


    /**
     * Log a message with the specific Marker at the WARN level.
     *
     * @param marker The marker specific to this log statement
     * @param msg    the message string to be logged
     * @return calling {@link Page}
     */
    public T warn(Marker marker, String msg) {
        logger.warn(marker, msg);
        return page;
    }

    /**
     * This method is similar to {@link #warn(String, Object)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg    the argument
     * @return calling {@link Page}
     */
    public T warn(Marker marker, String format, Object arg) {
        logger.warn(marker, format, arg);
        return page;
    }

    /**
     * This method is similar to {@link #warn(String, Object, Object)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     * @return calling {@link Page}*
     */
    public T warn(Marker marker, String format, Object arg1, Object arg2) {
        logger.warn(marker, format, arg1, arg2);
        return page;
    }


    /**
     * This method is similar to {@link #warn(String, Object...)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker    the marker data specific to this log statement
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     * @return calling {@link Page}
     */
    public T warn(Marker marker, String format, Object... arguments) {
        logger.warn(marker, format, arguments);
        return page;
    }

    /**
     * This method is similar to {@link #warn(String, Throwable)} method
     * except that the marker data is also taken into consideration.
     *
     * @param marker the marker data for this log statement
     * @param msg    the message accompanying the exception
     * @param t      the exception (throwable) to log
     * @return calling {@link Page}
     */
    public T warn(Marker marker, String msg, Throwable t) {
        logger.warn(marker, msg, t);
        return page;
    }

    /**
     * Log a message at the ERROR level.
     *
     * @param msg the message string to be logged
     * @return calling {@link Page}
     */
    public T error(String msg) {
        logger.error(msg);
        return page;
    }

    /**
     * Log a message at the ERROR level according to the specified format
     * and argument.
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the ERROR level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     * @return calling {@link Page}
     */
    public T error(String format, Object arg) {
        logger.error(format, arg);
        return page;
    }

    /**
     * Log a message at the ERROR level according to the specified format
     * and arguments.
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the ERROR level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     * @return calling {@link Page}
     */
    public T error(String format, Object arg1, Object arg2) {
        logger.error(format, arg1, arg2);
        return page;
    }


    /**
     * Log a message at the ERROR level according to the specified format
     * and arguments.
     * <p>This form avoids superfluous string concatenation when the logger
     * is disabled for the ERROR level. However, this variant incurs the hidden
     * (and relatively small) cost of creating an <code>Object[]</code> before invoking the method,
     * even if this logger is disabled for ERROR. The variants taking
     * {@link #error(String, Object) one} and {@link #error(String, Object, Object) two}
     * arguments exist solely in order to avoid this hidden cost.</p>
     *
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     * @return calling {@link Page}
     */
    public T error(String format, Object... arguments) {
        logger.error(format, arguments);
        return page;
    }

    /**
     * Log an exception (throwable) at the ERROR level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     * @return calling {@link Page}
     */
    public T error(String msg, Throwable t) {
        logger.error(msg, t);
        return page;
    }

    /**
     * Log a message with the specific Marker at the ERROR level.
     *
     * @param marker The marker specific to this log statement
     * @param msg    the message string to be logged
     * @return calling {@link Page}
     */
    public T error(Marker marker, String msg) {
        logger.error(marker, msg);
        return page;
    }

    /**
     * This method is similar to {@link #error(String, Object)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg    the argument
     * @return calling {@link Page}
     */
    public T error(Marker marker, String format, Object arg) {
        logger.error(marker, format, arg);
        return page;
    }

    /**
     * This method is similar to {@link #error(String, Object, Object)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     * @return calling {@link Page}
     */
    public T error(Marker marker, String format, Object arg1, Object arg2) {
        logger.error(marker, format, arg1, arg2);
        return page;
    }

    /**
     * This method is similar to {@link #error(String, Object...)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker    the marker data specific to this log statement
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     * @return calling {@link Page}
     */
    public T error(Marker marker, String format, Object... arguments) {
        logger.error(marker, format, arguments);
        return page;
    }

    /**
     * This method is similar to {@link #error(String, Throwable)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param msg    the message accompanying the exception
     * @param t      the exception (throwable) to log
     * @return calling {@link Page}
     */
    public T error(Marker marker, String msg, Throwable t) {
        logger.error(marker, msg, t);
        return page;
    }
}
