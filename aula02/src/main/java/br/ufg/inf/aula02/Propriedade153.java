/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.aula02;

/**
 *
 * @author Shakaw
 */
public class Propriedade153 {
    
    /**
     * @param n : Numero submetido a regra
     * @return : Numero inteiro, resultante da soma da propriedade153
     */
    public static int obter(int n) {
        int i = n / 100;
        int j = (n - 100 * i) / 100;
        int k = n % 10;
        return (i ^ 3 + j ^ 3 + k ^ 3);
    }
    
}
