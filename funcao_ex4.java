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
public class funcao_ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        simbo();
    }
     public static void  simbo(){
       Scanner leitor = new Scanner(System.in);
       int a,b,res;
       String fun;
         System.out.println("Digite 2 Valores e a função aritimética( +, -, / , * ).");
         
          System.out.print("1N:");
          a = leitor.nextInt();
          System.out.print("Função:");
          fun = leitor.next();
          System.out.print("2N:");
          b = leitor.nextInt();
          if(fun == "+"){
             res = a + b;
          }else if(fun == "-"){
              res = a - b;
          }else if(fun =="*"){
            res = a * b;
          }else if(fun =="/"){
            res = a / b;
          }else{
              System.out.println("Simbolo errado");
          }
     }
       
       
       
     
    
}
