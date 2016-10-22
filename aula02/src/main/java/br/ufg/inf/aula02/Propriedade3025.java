/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.aula02;

/**
 *
 * @author Rodrigo
 */
public class Propriedade3025 {

    /**
     * @param n : Numero submetido a regra
     * @return : Numero inteiro, resultante da soma da propriedade3025
     */
    public static int obter(int n) {
        int i = n / 100;
        int j = n % 100;
        return (i + j) ^ 2;
    }

}
