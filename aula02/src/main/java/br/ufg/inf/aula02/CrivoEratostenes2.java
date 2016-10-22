/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.aula02;

/**
 *
 * @author Shakaw
 */
public class CrivoEratostenes2 {
    
    /**
     * @param a :
     * @param b :
     * @return Resultado
     */
    public static int obter(int a, int b) {
        while (b != 0) {
            int m = a % b;
            a = b;
            b = m;
        }
        return a;
    }
    
}
