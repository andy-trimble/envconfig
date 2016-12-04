/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sentinel.config;

/**
 *
 * @author atrimble
 */
public class GoodConfig {
    @Config(name = "ENVCONFIG_TEST_STRING")
    public static String TEST_STRING;
    
    @Config(name = "ENVCONFIG_DEFAULT_STRING", defaultValue = "Default String")
    public static String DEFAULT_STRING;
    
    @Config(name = "ENVCONFIG_TEST_INT")
    public static int TEST_INT;
    
    @Config(name = "ENVCONFIG_DEFAULT_INT", defaultValue = "1")
    public static int DEFAULT_INT;
    
    @Config(name = "ENVCONFIG_TEST_SHORT")
    public static short TEST_SHORT;
    
    @Config(name = "ENVCONFIG_DEFAULT_SHORT", defaultValue = "1")
    public static short DEFAULT_SHORT;
    
    @Config(name = "ENVCONFIG_TEST_LONG")
    public static long TEST_LONG;
    
    @Config(name = "ENVCONFIG_DEFAULT_LONG", defaultValue = "1")
    public static long DEFAULT_LONG;
    
    @Config(name = "ENVCONFIG_TEST_FLOAT")
    public static float TEST_FLOAT;
    
    @Config(name = "ENVCONFIG_DEFAULT_FLOAT", defaultValue = "1.0")
    public static float DEFAULT_FLOAT;
    
    @Config(name = "ENVCONFIG_TEST_DOUBLE")
    public static float TEST_DOUBLE;
    
    @Config(name = "ENVCONFIG_DEFAULT_DOUBLE", defaultValue = "1.0")
    public static float DEFAULT_DOUBLE;
}
