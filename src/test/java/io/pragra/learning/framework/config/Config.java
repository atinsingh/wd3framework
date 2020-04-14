package io.pragra.learning.framework.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Config {
    private Properties properties;
    private static Config instance;
    private static Logger logger = LogManager.getLogger(Config.class);

    private Config(){
        try{
            Path path = Paths.get("src","test","resources","framework.properties");
            logger.info("Reading file  {} to load properties ", path.toString());
            InputStream stream = new FileInputStream(path.toFile());
            logger.trace("File file  {} found ready to load now ", path.toString());
            properties = new Properties();  //creating object
            properties.load(stream);     // loading property

        }catch (FileNotFoundException e) {
            logger.error("Properties File file NOT Found can't load property - MSG {} ", e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            logger.error("Something went wrong in reading file - MSG {} ", e.getMessage());
            e.printStackTrace();
        }
    }

    public static Object getProperty(String key){
        logger.debug("Looking for property for key {} ", key);
        if(instance ==null){
            instance = new Config();
        }
        if(instance.properties.getProperty(key)==null){
            logger.warn("No property found for key  {} , kindly verify properties file");
        }
        return instance.properties.getProperty(key);
    }
}
