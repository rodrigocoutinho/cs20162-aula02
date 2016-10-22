/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.aula02;

/**
 *
 * @author Shakaw
 */
public class Primo {

    /**
     * @param n : Entrada de um numero que se deseja saber se é primo
     * @return : Booleano, True para numeros primos e false caso não seja
     */
    public static boolean eh(final int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int i = 2;
        for (int cont = 2; cont <= (n - 1); cont++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
