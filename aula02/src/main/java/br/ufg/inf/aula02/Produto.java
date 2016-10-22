/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.aula02;

/**
 *
 * @author Shakaw
 */
public class Produto {

    /**
     * @param a :
     * @param b :
     * @return : Resultado do produto
     */
    public static int obter(int a, int b) {

        int totalparcela = a;
        int parcela = b;
        if (b < a) {
            totalparcela = a;
            parcela = b;
        }
        int i = 1;
        int s = 0;
        while (i < totalparcela) {
            s = s + parcela;
            i = i + 1;

        }
        return s;

    }
}
