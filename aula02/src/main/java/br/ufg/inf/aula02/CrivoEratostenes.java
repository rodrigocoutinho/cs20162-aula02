/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.aula02;

/**
 *
 * @author Rodrigo
 */
public class CrivoEratostenes {

    /**
     * @param n : quantidade de numeros para saber se é primo
     * @param a : tamanho do vetor
     * @return : retorna a sequencia
     */
    public static boolean obter(int n, int[] a) {
        int i = 2, c = 0;

        if (n <= 1) {
            throw new IllegalArgumentException("Número inválido.");
        }

        while (i <= (n / 2)) {
            if (a[i] == 0) {
                c = i + i;
                while (c <= n) {
                    a[c] = 1;
                    c++;
                }
            }
            i++;
        }

        return (c == i);
    }

}
