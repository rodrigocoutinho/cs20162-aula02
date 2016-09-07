/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;


/**
 *
 * @author Rodrigo
 */
public class exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        System.out.println("Devido não haver solicitações de uso das funções"
                + "criadas, segue abaixo os codigos");
       
    }
    
    public static int somaNaturais (int n) {
        int i = 2;
        int s = 1;
        
        while (i <= n){
            s = s + i;
            i = i + i;
        }
        return s;
    }
    
    public static int produto(int a, int b) {
        
        int totalparcela = a;
        int parcela = b;
        if (b < a){
        totalparcela = a;
        parcela = b;
        }
        int i = 1;
        int s = 0;
        while (i < totalparcela){
            s = s + parcela;
            i = i + 1;
            
        }
        return s;
    
}
    
    public static int potencia (int x, int y){
        int potencia = 1;
        int i = 1;
        
        while (i <= y){
            potencia = produto(potencia, x);
            i = i + 1;
        }
       return potencia;
    }
    
    public static int propriedade3025 (int n){
        int i = n / 100;
        int j = n % 100;
        return (i + j)^2;
    }
    
    public static int propriedade153 (int n){
        int i = n / 100;
        int j = (n - 100*i)/ 100;
        int k = n % 10;
        return (i^3 + j^3 + k^3);
    }
    
    public static boolean primo (int n){
        int i = 2;
        while (i <= (n-1)){
            if (n % i == 0){
                return false;
            }
        }                
        return true;
    }
    
    public static void crivoEratostenes ( int a, int n){
        int i = 2;
        while (i <= n/2){
            if (a == 0){
                int c = i + i;
                while (c <= n){
                    a = 1;
                    c = c + i;
                }
            }
            i = i + 1;
        }
    }
    
    public static int crivoEratostenes2 (int a, int b){
        while (b != 0){
            int m = a % b;
            a = b;
            b = m;
        }
        return a;
    }
    
    public static int crivoEratostenesSubtracoes ( int a, int b){
        while (a != b){
            if ( a > b){
                a = a - b;                
            } else {
                b = b - a;
            }
        }
        return a;
    }
    
    public static int numeroHarmonico (int n){
        int i = 2;
        int s = 1;
        
        while (i <= n){
            s = s + 1/i;
            i = i + 1;
        }
        return s;
    }
}
