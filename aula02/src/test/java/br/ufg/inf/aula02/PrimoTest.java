/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.aula02;

import org.junit.Test;

/**
 *
 * @author Shakaw
 */
public class PrimoTest {
    
    public PrimoTest() {
    }

    /**
     * Test of eh method, of class Primo.
     */
    @Test
    public void testEh() {
        Primo.eh(3);
    }
    
        /**
     * Test of eh method, of class Primo.
     */
    @Test
    public void testNaoEh() {
        Primo.eh(4);
    }
    
        /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numInvalido() {

        Primo.eh(0);
    }
}
