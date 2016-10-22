/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.aula02;

/**
 *
 * @author Rodrigo
 */
public class Potencia {

    /**
     * @param x : Base
     * @param y : expoente
     * @return Inteiro : Resultado da potencia
     */
    public static int obter(int x, int y) {
        int potencia = 1;
        int i = 1;

        while (i <= y) {
            potencia = Produto.obter(potencia, x);
            i = i + 1;
        }
        return potencia;
    }

}
