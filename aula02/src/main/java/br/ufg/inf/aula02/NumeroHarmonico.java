/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.aula02;

/**
 *
 * @author Shakaw
 */
public class NumeroHarmonico {
    
    /**
     * @param n :
     * @return Resultado numero harmonico
     */
    public static int obter(int n) {
        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + 1 / i;
            i = i + 1;
        }
        return s;
    }
    
}
