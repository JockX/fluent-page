package net.jockx.fluentpage;

import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

/**
 * Logger available from within PageObject chained call
 * Created by JockX on 2015-07-11.
 */
@SuppressWarnings("unused")
public class Logger <T extends Page<T>> {
	
	private final T page;
	
	private final org.slf4j.Logger logger;
	
	Logger(T pageObject) {
		this.page = pageObject;
		this.logger = LoggerFactory.getLogger(page.getClass());
	}

	public T trace(String msg){
		logger.trace(msg);
		return page;
	}

	public T trace(String format, Object arg){
		logger.trace(format, arg);
		return page;
	}
	
	public T trace(String format, Object arg1, Object arg2){
		logger.trace(format, arg1, arg2);
		return page;
	}
	
	public T trace(String format, Object... arguments){
		logger.trace(format, arguments);
		return page;
	}
	
	public T trace(String msg, Throwable t){
		logger.trace(msg, t);
		return page;
	}
	
	public T trace(Marker marker, String msg){
		logger.trace(marker, msg);
		return page;
	}

	public T trace(Marker marker, String format, Object arg){
		logger.trace(marker, format, arg);
		return page;
	}
	
	public T trace(Marker marker, String format, Object arg1, Object arg2){
		logger.trace(marker, format, arg1, arg2);
		return page;
	}

	public T trace(Marker marker, String format, Object... argArray){
		logger.trace(marker, format, argArray);
		return page;
	}

	public T trace(Marker marker, String msg, Throwable t){
		logger.trace(marker, msg, t);
		return page;
	}

	public T debug(String msg){
		logger.debug(msg);
		return page;
	}

	public T debug(String format, Object arg){
		logger.debug(format, arg);
		return page;
	}

	public T debug(String format, Object arg1, Object arg2){
		logger.debug(format, arg1, arg2);
		return page;
	}

	public T debug(String format, Object... arguments){
		logger.debug(format, arguments);
		return page;
	}

	public T debug(String msg, Throwable t){
		logger.debug(msg, t);
		return page;
	}

	public T debug(Marker marker, String msg){
		logger.debug(marker, msg);
		return page;
	}

	public T debug(Marker marker, String format, Object arg){
		logger.debug(marker, format, arg);
		return page;
	}

	public T debug(Marker marker, String format, Object arg1, Object arg2){
		logger.debug(marker, format, arg1, arg2);
		return page;
	}

	public T debug(Marker marker, String format, Object... arguments){
		logger.debug(marker, format, arguments);
		return page;
	}

	public T debug(Marker marker, String msg, Throwable t){
		logger.debug(marker, msg, t);
		return page;
	}

	public T info(String msg){
		logger.info(msg);
		return page;
	}

	public T info(String format, Object arg){
		logger.info(format, arg);
		return page;
	}

	public T info(String format, Object arg1, Object arg2){
		logger.info(format, arg1, arg2);
		return page;
	}

	public T info(String format, Object... arguments){
		logger.info(format, arguments);
		return page;
	}

	public T info(String msg, Throwable t){
		logger.info(msg, t);
		return page;
	}

	public T info(Marker marker, String msg){
		logger.info(marker, msg);
		return page;
	}

	public T info(Marker marker, String format, Object arg){
		logger.info(marker, format, arg);
		return page;
	}

	public T info(Marker marker, String format, Object arg1, Object arg2){
		logger.info(marker, format, arg1, arg2);
		return page;
	}
	
	public T info(Marker marker, String format, Object... arguments){
		logger.info(marker, format, arguments);
		return page;
	}

	public T info(Marker marker, String msg, Throwable t){
		logger.info(marker, msg, t);
		return page;
	}

	public T warn(String msg){
		logger.warn(msg);
		return page;
	}

	public T warn(String format, Object arg){
		logger.warn(format, arg);
		return page;
	}

	public T warn(String format, Object... arguments){
		logger.warn(format, arguments);
		return page;
	}

	public T warn(String format, Object arg1, Object arg2){
		logger.warn(format, arg1, arg2);
		return page;
	}

	public T warn(String msg, Throwable t){
		logger.warn(msg, t);
		return page;
	}

	public T warn(Marker marker, String msg){
		logger.warn(marker, msg);
		return page;
	}

	public T warn(Marker marker, String format, Object arg){
		logger.warn(marker, format, arg);
		return page;
	}

	public T warn(Marker marker, String format, Object arg1, Object arg2){
		logger.warn(marker, format, arg1, arg2);
		return page;
	}

	public T warn(Marker marker, String format, Object... arguments){
		logger.warn(marker, format, arguments);
		return page;
	}

	public T warn(Marker marker, String msg, Throwable t){
		logger.warn(marker, msg, t);
		return page;
	}

	public T error(String msg){
		logger.error(msg);
		return page;
	}

	public T error(String format, Object arg){
		logger.error(format, arg);
		return page;
	}

	public T error(String format, Object arg1, Object arg2){
		logger.error(format, arg1, arg2);
		return page;
	}

	public T error(String format, Object... arguments){
		logger.error(format, arguments);
		return page;
	}

	public T error(String msg, Throwable t){
		logger.error(msg, t);
		return page;
	}

	public T error(Marker marker, String msg){
		logger.error(marker, msg);
		return page;
	}

	public T error(Marker marker, String format, Object arg){
		logger.error(marker, format, arg);
		return page;
	}

	public T error(Marker marker, String format, Object arg1, Object arg2){
		logger.error(marker, format, arg1, arg2);
		return page;
	}

	public T error(Marker marker, String format, Object... arguments){
		logger.error(marker, format, arguments);
		return page;
	}
	
	public T error(Marker marker, String msg, Throwable t){
		logger.error(marker, msg, t);
		return page;
	}
}
