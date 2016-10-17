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
