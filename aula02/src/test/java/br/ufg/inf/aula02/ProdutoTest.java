/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.aula02;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shakaw
 */
public class ProdutoTest {
    
    /**
     * Test of obter method, of class Produto.
     */
    @Test
    public void testObter() {
        Produto.obter(4,2);
        Produto.obter(2,4);
        assertEquals(6,Produto.obter(4,2),0);
        assertEquals(10,Produto.obter(6,2),0);
        assertEquals(4,Produto.obter(2,4),0);
        
    }
    
}
