package com.demo.test;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Bohdan.Havrylyshyn on 13.08.2017.
 */
public class PropertyLoader {
    private static final String PROP_FILE = "/general.properties";

    public static String loadProperty(String name) {
        Properties props = new Properties();
        try {
            props.load(PropertyLoader.class.getResourceAsStream(PROP_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String value = null;

        if (name != null) {
            value = props.getProperty(name);
        }
        return value;
    }
}
