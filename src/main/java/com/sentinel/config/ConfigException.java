package com.sentinel.config;

/**
 * An exception raised if the configuration cannot be loaded.
 * 
 * @author Andrew Trimble
 */
public class ConfigException extends Exception {

    /**
     * Creates a new instance of <code>ConfigException</code> without detail
     * message.
     */
    public ConfigException() {
    }

    /**
     * Constructs an instance of <code>ConfigException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ConfigException(String msg) {
        super(msg);
    }

    /**
     * Constructs an instance of <code>ConfigException</code> with the specified
     * detail message and cause.
     *
     * @param msg the detail message.
     * @param cause the underlying exception
     */
    public ConfigException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
