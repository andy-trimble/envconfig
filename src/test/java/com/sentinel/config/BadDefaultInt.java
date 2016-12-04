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
public class BadDefaultInt {
    @Config(name = "ENVCONFIG_BAD_DEFAULT_INT", defaultValue = "andy")
    public static int BAD_INT;

    @Config(name = "ENVCONFIG_TEST_STRING")
    public static String TEST_STRING;
}
