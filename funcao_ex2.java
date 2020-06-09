/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao;

import java.util.Scanner;

/**
 *
 * @author Root
 */
public class funcao_ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int inteiro = soma(1,10);
        System.out.println(inteiro);
        
        
    }
    public static int soma(int x, int y){
        int inteiros = 0;
       
        for(x = 0 ; x < 0; x++){
        if(x%2 == 0 && y%2 ==0){
            inteiros = x+y;
        }
        }
           
        
        
        return inteiros;
        
    }
    
}
