/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

    /**
     * @param a :
     * @param b :
     * @return : Resultado do produto
     */
    public static int produto(int a, int b) {

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
