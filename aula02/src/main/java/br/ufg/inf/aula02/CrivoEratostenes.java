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
public class CrivoEratostenes {
     /**
     * @param a :
     * @param n :
     */
    public static void obter(int a, int n) {
        int i = 2;
        while (i <= n / 2) {
            if (a == 0) {
                int c = i + i;
                while (c <= n) {
                    a = 1;
                    c = c + i;
                }
            }
            i = i + 1;
        }
    }
    
}
