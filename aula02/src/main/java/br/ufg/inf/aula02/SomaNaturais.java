/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.aula02;

/**
 *
 * @author Rodrigo
 */
public class SomaNaturais {
    
    /**
     * @param n : Numero para sequencia
     * @return : Numero inteiro, resultante da soma da sequencia
     */
    public static int obter(int n) {

        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + i;
            i = i + i;
        }
        return s;
    }


    
}
