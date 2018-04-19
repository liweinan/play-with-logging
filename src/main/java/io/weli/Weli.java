package io.weli;

import java.io.FileInputStream;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Weli {
    private static Logger logger = Logger.getGlobal();

    public static void main(String[] args) throws Exception {
        LogManager.getLogManager().readConfiguration(
                new FileInputStream("/Users/weli/projs/play-with-logging/src/main/resources/logging.properties"));

        logger.fine("Hello fine world!");
        logger.info("Hello info world!");
        logger.severe("Hello severe world!");

        Logger myLogger = Logger.getLogger(Weli.class.toString());
        myLogger.info("Hello, world!");

        Logger anotherLogger = Logger.getLogger(String.class.toString());
        anotherLogger.info("Hello, Mars!");

        FileHandler helloFileHandler = new FileHandler("/tmp/foo.txt");
        anotherLogger.addHandler(helloFileHandler);
        anotherLogger.info("Message from the Earth!!!");
        anotherLogger.fine("!FINE FINE FINE!");

    }
}
