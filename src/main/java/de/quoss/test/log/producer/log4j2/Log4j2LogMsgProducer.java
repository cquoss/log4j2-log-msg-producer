package de.quoss.test.log.producer.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2LogMsgProducer {

    private static final Logger LOGGER = LogManager.getLogger();

    private static final String LOG_MSG_FMT = "Log4j2 Logger {} message";

    private Log4j2LogMsgProducer() {}

    public static void run() {
        LOGGER.trace(LOG_MSG_FMT, "Trace");
        LOGGER.debug(LOG_MSG_FMT, "Debug");
        LOGGER.info(LOG_MSG_FMT, "Info");
        LOGGER.warn(LOG_MSG_FMT, "Warn");
        LOGGER.error(LOG_MSG_FMT, "Error");
        LOGGER.fatal(LOG_MSG_FMT, "Fatal");
    }

}
