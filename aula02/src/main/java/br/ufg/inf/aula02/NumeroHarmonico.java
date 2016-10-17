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
public class NumeroHarmonico {
    
    /**
     * @param n :
     * @return Resultado numero harmonico
     */
    public static int obter(int n) {
        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + 1 / i;
            i = i + 1;
        }
        return s;
    }
    
}
