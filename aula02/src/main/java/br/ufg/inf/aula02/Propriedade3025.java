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
