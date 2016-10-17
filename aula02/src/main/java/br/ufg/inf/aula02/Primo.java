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
public class Primo {
    
     /**
     * @param n : Entrada de um numero que se deseja saber se é primo
     * @return : Booleano, True para numeros primos e false caso não seja
     */
    public static boolean eh(int n) {
        int i = 2;
        while (i <= (n - 1)) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
