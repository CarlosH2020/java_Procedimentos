/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao;

/**
 *
 * @author Root
 */
public class funcao_ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(nota(3,4,5,6));
    }
    
    public static int  nota(int n1, int n2, int n3, int n4){
        
       int media = (n1+n2+n3+n4)/4;
        
        if(media >= 7){
            System.out.println("Aprovado");
            
        }else{
            System.out.println("Reprovado");
        }
        
        return media;
        
       
    }
}
