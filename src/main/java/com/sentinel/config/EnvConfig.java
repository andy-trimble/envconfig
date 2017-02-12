package com.sentinel.config;

import java.lang.reflect.Field;

/**
 * Environment variable based configuration.
 * 
 * @author Andrew Trimble
 */
public class EnvConfig {

    /**
     * Load the configuration from the environment.
     * 
     * @param clazz the class with the annotated configuration parameters
     * @throws ConfigException in case there was an issue loading the configuration
     */
    public static void load(Class<?> clazz) throws ConfigException {
        String error = "";

        for (Field f : clazz.getFields()) {
            Config c = f.getAnnotation(Config.class);
            String name = c.name();
            String defaultValue = c.defaultValue();

            String val = System.getenv().get(name);
            if (val != null) {
                try {
                    EnvConfig.setValue(f, val);
                    continue;
                } catch (IllegalArgumentException | IllegalAccessException ex) {
                    error = error + "\nCannot set field " + f.getName() + " = " + val + ". Is it public and static?";
                }
            }

            try {
                EnvConfig.setValue(f, defaultValue);
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                error = error + "\nCannot set field " + f.getName() + " = " + val + ". Is it public and static?";
            }
        }

        if (!error.equals("")) {
            throw new ConfigException(error);
        }
    }

    private static void setValue(Field f, String val) throws IllegalArgumentException, IllegalAccessException {
        Class<?> type = f.getType();
        if (type == int.class) {
            f.setInt(f, Integer.parseInt(val));
        } else if (type == long.class) {
            f.setLong(f, Long.parseLong(val));
        } else if (type == short.class) {
            f.setShort(f, Short.parseShort(val));
        } else if (type == float.class) {
            f.setFloat(f, Float.parseFloat(val));
        } else if (type == double.class) {
            f.setDouble(f, Double.parseDouble(val));
        } else if (type == String.class) {
            f.set(f, val);
        }
    }
}
