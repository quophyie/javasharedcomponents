package com.quantal.javashared.logger;

import io.logz.sender.SenderStatusReporter;
import org.slf4j.Logger;

public class LogzioStatusReporter  implements SenderStatusReporter {
    private Logger logger;

    public LogzioStatusReporter(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void error(String msg) {
        logger.error(msg);
    }

    @Override
    public void error(String msg, Throwable throwable) {
        logger.error(msg, throwable);
    }

    @Override
    public void warning(String msg) {
        logger.warn(msg);
    }

    @Override
    public void warning(String msg, Throwable throwable) {
        logger.warn(msg,throwable);
    }

    @Override
    public void info(String msg) {
        logger.info(msg);
    }

    @Override
    public void info(String msg, Throwable throwable) {
        logger.info(msg,throwable);
    }
}
