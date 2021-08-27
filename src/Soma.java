/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cmdhn
 */import java.util.Scanner;
    public class Soma {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Este programa calculará a soma de num1 e num2, depois multiplicará  por num3");
        int num1;
        int num2;
        int num3;
        
        System.out.println("Digite o primeiro número:");
            Scanner leitor = new Scanner(System.in);
          num1 = leitor.nextInt();
              System.out.println("Agora, digite o segundo número:");
            num2 = leitor.nextInt();
                System.out.println("Agora, digite o terceiro número:");
               num3 = leitor.nextInt(); 
         
                     System.out.println((num1 + num2)+ num2 * num3);
  
    }
    
}
