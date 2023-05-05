package Model.Classes;

import lombok.Data;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
@Data
public class ClassLogger {
    Logger logger;
    FileHandler fileHandler;
    SimpleFormatter simpleFormatter;
    public ClassLogger() {
        this.logger = Logger.getLogger(ClassLogger.class.getName());
        logger.setLevel(Level.INFO);
        try {
            this.fileHandler = new FileHandler("LoggerInfo.txt");
            logger.addHandler(fileHandler);
            this.simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Exception: Ошибка логирования!", e);
        }
    }
}
