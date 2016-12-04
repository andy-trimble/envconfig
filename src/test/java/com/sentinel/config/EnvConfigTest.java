/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sentinel.config;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author atrimble
 */
public class EnvConfigTest {
    @Test
    public void loadsNominally() throws ConfigException {
        EnvConfig.load(GoodConfig.class);

        assertEquals("Test String", GoodConfig.TEST_STRING);
        assertEquals("Default String", GoodConfig.DEFAULT_STRING);
        assertEquals(3, GoodConfig.TEST_INT);
        assertEquals(1, GoodConfig.DEFAULT_INT);
        assertEquals(3, GoodConfig.TEST_SHORT);
        assertEquals(1, GoodConfig.DEFAULT_SHORT);
        assertEquals(3, GoodConfig.TEST_LONG);
        assertEquals(1, GoodConfig.DEFAULT_LONG);
        assertEquals(3.0f, GoodConfig.TEST_FLOAT, 0.001);
        assertEquals(1.0f, GoodConfig.DEFAULT_FLOAT, 0.001);
        assertEquals(3.0, GoodConfig.TEST_DOUBLE, 0.001);
        assertEquals(1.0, GoodConfig.DEFAULT_DOUBLE, 0.001);
    }

    @Test(expected = ConfigException.class) 
    public void testBadInt() throws ConfigException {
        EnvConfig.load(BadInt.class);

        assertEquals("Test String", BadInt.TEST_STRING);
    }
    
    @Test(expected = ConfigException.class) 
    public void testBadDefaultInt() throws ConfigException {
        EnvConfig.load(BadDefaultInt.class);

        assertEquals("Test String", BadDefaultInt.TEST_STRING);
    }
}
