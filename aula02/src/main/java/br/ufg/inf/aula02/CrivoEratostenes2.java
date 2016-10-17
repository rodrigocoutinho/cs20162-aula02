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
public class CrivoEratostenes2 {
    
    /**
     * @param a :
     * @param b :
     * @return Resultado
     */
    public static int obter(int a, int b) {
        while (b != 0) {
            int m = a % b;
            a = b;
            b = m;
        }
        return a;
    }
    
}
