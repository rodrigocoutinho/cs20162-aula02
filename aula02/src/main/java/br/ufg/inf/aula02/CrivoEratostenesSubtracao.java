/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.aula02;

/**
 *
 * @author Shakaw
 */
public class CrivoEratostenesSubtracao {
    
    /**
     * @param a :
     * @param b :
     * @return Resultado
     */
    public static int obter(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    
}
