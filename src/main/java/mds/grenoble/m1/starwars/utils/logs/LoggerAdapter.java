package mds.grenoble.m1.starwars.utils.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerAdapter {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggerAdapter.class);

	public static Logger getLogger() {
		return LOGGER;
	}

}
