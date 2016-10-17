/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.aula02;

import static br.ufg.inf.aula02.SomaNaturais.produto;


/**
 *
 * @author Rodrigo
 */
public class Potencia {
    
    /**
     * @param x : Base
     * @param y : expoente
     * @return Inteiro : Resultado da potencia
     */
    public static int obter(int x, int y) {
        int potencia = 1;
        int i = 1;

        while (i <= y) {
            potencia = produto(potencia, x);
            i = i + 1;
        }
        return potencia;
    }
    
}
