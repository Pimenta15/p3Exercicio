package Atividade14.Questao1;

import java.util.Scanner;

/**
 * q1
 */
public class q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op = 0;
        

        do{
        op = 0;
        try {
        System.out.println("Nome: ");
        String name = in.next();
        System.out.println("Numero: ");
        int num = in.nextInt();

        System.out.println("Letra: "+ name.charAt(num));
        
        } catch (Exception e) {
            op =1;
            System.out.println("Posição inválida.");
            in.nextLine();
                     
        }
    
       
    }while (op == 1);
    
    System.out.println("fim");
    }
    
}