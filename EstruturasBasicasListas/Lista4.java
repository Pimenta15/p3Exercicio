package EstruturasBasicasListas;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lista4 {
    
        public static void question1() {
              Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int numero = in.nextInt();


        switch (numero) {
            case 0:
                System.out.println("O número é igual é nulo");
                break;
       
            default:
                if (numero>0) {
                    System.out.println("Positivo");
                } else {
                     System.out.println("Negativo");
                }
                break;
        }

        }
        public static void question2() {
            Scanner in = new Scanner(System.in);
       
            System.out.println("Digite sua idade ");
            int idade = in.nextInt();
           
            if (idade>18) {
                        System.out.println("Maior de idade");
                    } else {
                         System.out.println("Menor de idade");
                    }
    
        }
        public static void question3() {
            Scanner in = new Scanner(System.in);
       
            System.out.println("Digite um número inteiro");
            int numero1 = in.nextInt();
            System.out.println("Digite outro número inteiro");
             int numero2 = in.nextInt();
           
             if (numero1 > numero2) {
                        System.out.println("O maior número é: "+ numero1);
                    } else if (numero1 < numero2) {
                          System.out.println("O maior número é: "+ numero2);;
                    } else {
                        System.out.println("São iguias");
                    }
    

        }
        public static void question4() {
            Scanner in = new Scanner(System.in);
       
        System.out.println("Digite um numero inteiro");
        int numero = in.nextInt();


        if (numero%2 == 0) {
            System.out.println(" Número: PAR");
        }else{
            System.out.println(" Número: IMPAR");
        }

        }
        public static void question5() {
            Scanner in = new Scanner(System.in);
       
            System.out.println("Digite a primeira nota");
            double nota1 = in.nextInt();
            System.out.println("Digite a segunda nota");
            double nota2 = in.nextInt();
            System.out.println("Digite a terceira nota");
            double nota3 = in.nextInt();
           
            double media = (nota1+nota2+nota3)/3;
             
             if (media > 7) {
                        System.out.println("Aluno aprovado com media : "+ media );
             }else{
                System.out.println("Aluno reprovado");
             }
    
        }
        public static void question6() {
            Scanner in = new Scanner(System.in);
       
            System.out.println("Digite um nome");
            String nome1 = in.nextLine();
            System.out.println("Digite outro nome");
            String nome2 = in.nextLine();
             
             if (nome1.length() > nome2.length()) {
                        System.out.println("O primeiro nome possui mais caracteres" );
             }else{
               System.out.println("O segundo nome possui mais caracteres" );
             }
    
        }
        public static void question7() {
            Scanner in = new Scanner(System.in);
       
            System.out.println("Digite uma Letra");
            char caractere = in.next().toLowerCase().charAt(0);
            switch (caractere) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("O caractere é vogal");
                    break;
                default:
                    System.out.println("O caractere é consoante");
                    break;
            }
    
        }
        public static void question8() {
             Scanner in = new Scanner(System.in);
       
        int[] sequence = new int[3];




        for (int i = 0; i < sequence.length; i++) {
            System.out.println("Digite o número "+ (i+1));
            sequence[i] = in.nextInt();
        }
       
        Arrays.sort(sequence);
       
        for (int num : sequence) {
            System.out.println(num);
        }

        }
        public static void question9() {
            Scanner in = new Scanner(System.in);
       
        System.out.println("Digite sua altura em metros");
        double altura = in.nextDouble();
        System.out.println("Digite seu peso");
        double peso = in.nextDouble();


        double imc = peso/(altura*altura);


            System.out.println("Seu IMC é de: " + imc);
           
            if(imc < 18.5 ){
                System.out.println("Você esta abaixo do peso ideal");
            }else if (imc > 25){
                System.out.println("Você esta acima do peso ideal");
            }else{
                System.out.println("Você esta no peso ideal");
            }

        }
        public static void question10() {
            Scanner in = new Scanner(System.in);
       
            System.out.println("Digite o número do mês");
            int numMes = in.nextInt();
    
    
            String nomeMes = nomeMes(numMes);
    
    
            System.out.println("O mês que você digitou foi: " + nomeMes);
           
        }
    
    
        public static String nomeMes(int mes) {
            switch (mes) {
                case 1:
                    return "Janeiro";
                case 2:
                    return "Fevereiro";
                case 3:
                    return "Março";
                case 4:
                    return "Abril";
                case 5:
                    return "Maio";
                case 6:
                    return "Junho";
                case 7:
                    return "Julho";
                case 8:
                    return "Agosto";
                case 9:
                    return "Setembro";
                case 10:
                    return "Outubro";
                case 11:
                    return "Novembro";
                case 12:
                    return "Dezembro";
                default:
                    return "Inválido";
            }
    
        }
        public static void question11() {
            Scanner in = new Scanner(System.in);
       
        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = in.nextDouble();
       
        double aumento;
       
        if (salario > 1500.00) {
            aumento = salario * 0.10;
        } else {
            aumento = salario * 0.15;
        }
       
        double novoSalario = salario + aumento;
       
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + novoSalario);
        }
        public static void question12() {
            Scanner in = new Scanner(System.in);
       
        System.out.print("Digite um número inteiro: ");
        int numero = in.nextInt();
       
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número " + numero + " é divisível por 3 e por 5.");
        } else {
            System.out.println("O número " + numero + " não é divisível por 3 e por 5 ao mesmo tempo.");
        }

        }
        public static void question13() {
            Scanner in = new Scanner(System.in);


            System.out.print("Digite o dia da semana por extenso: ");
            String diaSemana = in.nextLine().toLowerCase();
           
            if (diaSemana.equals("segunda-feira") || diaSemana.equals("terça-feira") ||
                diaSemana.equals("quarta-feira") || diaSemana.equals("quinta-feira") ||
                diaSemana.equals("sexta-feira")) {
    
    
                System.out.println("É um dia útil.");
               
            } else if (diaSemana.equals("sábado") || diaSemana.equals("domingo")) {
    
    
                System.out.println("É um fim de semana.");
    
    
            } else {
    
    
                System.out.println("Dia da semana inválido.");
               
            }
    
        }
        public static void question14() {
            Scanner in = new Scanner(System.in);


        System.out.print("Digite um número inteiro de 1 a 5: ");
        int numero = in.nextInt();


        String mensagem;


        switch (numero) {
            case 5:
                mensagem = "Muito bom";
                break;
            case 4:
                mensagem = "Bom";
                break;
            case 3:
                mensagem = "Regular";
                break;
            case 2:
                mensagem = "Insuficiente";
                break;
            case 1:
                mensagem = "Muito insuficiente";
                break;
            default:
                mensagem = "Número inválido";
                break;
        }


        System.out.println("Resultado: " + mensagem);

        }
        public static void question15() {
            Scanner in = new Scanner(System.in);


            System.out.print("Digite um número entre 1 e 7: ");
            int numero = in.nextInt();
    
    
            String diaSemana;
    
    
            switch (numero) {
                case 1:
                    diaSemana = "Domingo";
                    break;
                case 2:
                    diaSemana = "Segunda-feira";
                    break;
                case 3:
                    diaSemana = "Terça-feira";
                    break;
                case 4:
                    diaSemana = "Quarta-feira";
                    break;
                case 5:
                    diaSemana = "Quinta-feira";
                    break;
                case 6:
                    diaSemana = "Sexta-feira";
                    break;
                case 7:
                    diaSemana = "Sábado";
                    break;
                default:
                    diaSemana = "Número inválido";
                    break;
            }
    
    
            System.out.println("Dia da semana correspondente: " + diaSemana);
    

        }
        public static void question16() {
            Scanner in = new Scanner(System.in);


            try {
                System.out.print("Digite um número decimal: ");
                double numeroDecimal = in.nextDouble();
    
    
                int numeroArredondado = (int) Math.round(numeroDecimal);
    
    
                System.out.println("Número arredondado: " + numeroArredondado);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número decimal válido.");
            }
    
        }
        public static void question17() {
            Scanner in = new Scanner(System.in);


            System.out.print("Digite a idade: ");
            int idade = in.nextInt();
    
    
            if (idade >= 0 && idade <= 1) {
                System.out.println("Você é um bebê.");
            } else if (idade > 1 && idade <= 12) {
                System.out.println("Você é uma criança.");
            } else if (idade >= 13 && idade <= 18) {
                System.out.println("Você é um adolescente.");
            } else if (idade > 18) {
                System.out.println("Você é um adulto.");
            } else {
                System.out.println("Idade inválida.");
            }
    
        }
        
        public static void question18() {
            Scanner in = new Scanner(System.in);


        System.out.print("Digite seu estado civil: ");
        String estadoCivil = in.nextLine().toLowerCase();


        switch (estadoCivil) {
            case "solteiro":
                System.out.println("Você é solteiro.");
                break;
            case "casado":
                System.out.println("Você é casado.");
                break;
            case "divorciado":
                System.out.println("Você é divorciado.");
                break;
            case "viúvo":
                System.out.println("Você é viúvo.");
                break;
            default:
                System.out.println("Estado civil inválido.");
                break;
        }

        }
        public static void question19() {
            Scanner in = new Scanner(System.in);


            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = in.nextInt();
    
    
            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = in.nextInt();
    
    
            System.out.println("Escolha:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
           
            int escolha = in.nextInt();
    
    
            double resultado = 0;
    
    
            switch (escolha) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = (double) numero1 / numero2;
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    return;
            }
    
    
            System.out.println("Resultado: " + resultado);
    
        }
        public static void question20() {
            Scanner in = new Scanner(System.in);


            System.out.print("Digite o nome: ");
            String nome = in.nextLine();
   
   
            boolean check = false;
            int idade = 0;
            try{
            
               System.out.println("Digite a idade ");
               idade = in.nextInt();  
   
   
           }catch (NumberFormatException e) {
               check = true;
               System.out.println("Idade inválida. Digite um valor inteiro.");
   
   
           }
           if(check == false){
              
           System.out.println("Nome: " + nome);
           System.out.println("Idade: " + idade);
   
   
           }
   
        }
        public static void question21() {
             Scanner in = new Scanner(System.in);

        try {
            System.out.print("Digite um valor em metros: ");
            double metros = in.nextDouble();


            double centimetros = metros * 100;
            double milimetros = metros * 1000;
            double quilometros = metros / 1000;


            System.out.println("Valor em centímetros: " + centimetros + " cm");
            System.out.println("Valor em milímetros: " + milimetros + " mm");
            System.out.println("Valor em quilômetros: " + quilometros + " km");


        } catch (InputMismatchException e) {


            System.out.println("Valor inválido. Digite um número válido.");
        }

        }
        
}
