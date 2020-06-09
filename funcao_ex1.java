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
public class funcao_ex1 {

    private static int y,x;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite primeiro número:");
        x = leitor.nextInt();
        System.out.print("Digite segundo número:");
        y = leitor.nextInt();
        System.out.println(soma(x,y));
        
    }
    public static int soma(int x  , int y){
        int s = x * y;
        return s;
        
    }
    
}
