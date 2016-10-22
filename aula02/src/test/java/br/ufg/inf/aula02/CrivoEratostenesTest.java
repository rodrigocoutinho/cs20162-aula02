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
public class CrivoEratostenesTest {
    
    int[] a = new int[10];
    

    /**
     * Test of obter method, of class CrivoEratostenes.
     */
    @Test 
    public void testObter() {
        CrivoEratostenes.obter(4, a);
        CrivoEratostenes.obter(6, a);
    }
    
    /**
     * Test of obter method, of class CrivoEratostenes.
     */
    @Test 
    public void testObter2() {
        CrivoEratostenes.obter(8, a);
        CrivoEratostenes.obter(7, a);
    }
    
}
