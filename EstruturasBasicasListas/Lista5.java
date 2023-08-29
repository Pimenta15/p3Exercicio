package EstruturasBasicasListas;

import java.util.Scanner;

public class Lista5 {
    

        public static void question1() {
           Scanner in = new Scanner(System.in);
           double[] notas = new double[5];


           for (int i = 0; i < notas.length; i++) {
           System.out.println("Digite a nota do aluno"+ (i+1));
           notas[i] = in.nextDouble();
           }
           for (int i = 0; i < notas.length; i++) {
           if (notas[i] >= 7) {
               System.out.println("aluno "+ (i+1)+ "aprovado");
           }            
           }
   
        }
        public static void question2() {
            Scanner in = new Scanner(System.in);
            System.out.println("Dgite um numeor gigante");
            String giga = in.next();
    
    
            char[] chad = new char[giga.length()];
            int soma =0 ;
            for (int i = 0; i < chad.length; i++) {
                chad[i] = giga.charAt(i);
                soma = soma + chad[i]-('0');
            }
            System.out.println(soma);
    
        }
        public static void question3() {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite um numero inteiro");
            int num = in.nextInt();
    
    
            for (int i = 0; i < num  ; i++) {
                if (num%(i+1)==0) {
                    System.out.println((i+1)+" é divisor de "+ num);
                }
            }
    
        }
        public static void question4() {
           Scanner in = new Scanner(System.in);
           double totalAltura = 0;


           for (int i = 1; i <= 5; i++) {
               System.out.print("Digite a altura da pessoa " + i + " em metros: ");
               double altura = in.nextDouble();
               totalAltura += altura;
           }
   
   
           double mediaAltura = totalAltura / 5;
           System.out.println("A média de altura são " + mediaAltura + " metros");
   
        }
        public static void question5() {
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
    
        }
        public static void question6() {
          Scanner in = new Scanner(System.in);
          System.out.print("Digite um número inteiro: ");
          int numero = in.nextInt();
  
  
          int soma = 0;
          while (numero > 0) {
              int digito = numero % 10;
             
              if (digito % 2 == 0) {    
                  soma += digito;
              }
              numero /= 10;
          }
  
  
          System.out.println("A soma dos dígitos pares é: " + soma);
  
  
  
           
        }
        public static void question7() {
           Scanner in = new Scanner(System.in);
           System.out.print("Digite um número inteiro: ");
           int numero = in.nextInt();
   
   
           int invertido = 0;
           while (numero > 0) {
               int digito = numero % 10;
               invertido = invertido * 10 + digito;
               numero /= 10;
           }
   
   
           System.out.println("O número invertido é: " + invertido);
       
   
        }
        public static void question8() {
          
          int numero = 1;
          int soma = 0;
         
          while (numero <= 100) {
              soma += numero;
              numero++;
          }
         
          System.out.println("A soma dos números de 1 a 100 é: " + soma);
        
        }
        public static void question9() {
           
           int numero = 1;
           int produto = 1;
          
           while (numero <= 5) {
               produto *= numero;
               numero++;  
           }
          
           System.out.println("O produto dos números de 1 a 5 é: " + produto);
   
        }
        public static void question10() {
          
          int numero = 9;
          int multiplicador = 1;
         
          System.out.println("Tabuada do 9:");
         
          while (multiplicador <= 10) {
              int resultado = numero * multiplicador;
              System.out.println(numero + " x " + multiplicador + " = " + resultado);
              multiplicador++;
          }
  
           
        }
        public static void question11() {
           Scanner in = new Scanner(System.in);
           int maior = Integer.MIN_VALUE;
           int menor = Integer.MAX_VALUE;
          
           System.out.println("Digite uma sequência de números inteiros. \nDigite 0 para encerrar.");
          
           int numero = in.nextInt();
          
           while (numero != 0) {
               if (numero > maior) {
                   maior = numero;
               }
              
               if (numero < menor) {
                   menor = numero;
               }
              
               numero = in.nextInt();
           }
          
           if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
               System.out.println("Nenhum número válido foi digitado.");
           } else {
               System.out.println("Maior valor digitado: " + maior);
               System.out.println("Menor valor digitado: " + menor);
           }
   
   
   
           
        }
        public static void question12() {
          Scanner in = new Scanner(System.in);
         
       
          int soma = 0;
          int contador = 0;
         
          System.out.println("Digite uma sequência de números inteiros. Digite -1 para encerrar.");
         
          int numero = in.nextInt();
         
          while (numero != -1) {
              soma += numero;
              contador++;
             
              numero = in.nextInt();
          }
         
          if (contador == 0) {
              System.out.println("Nenhum número válido foi digitado.");
          } else {
              double media = (double) soma / contador;
              System.out.println("A média dos números digitados é: " + media);
          }
  
          
        }
        public static void question13() {
            Scanner in = new Scanner(System.in);
            
       
            System.out.print("Digite um número inteiro: ");
            int numero = in.nextInt();
           
            int soma = 0;
           
            while (numero != 0) {
                int digito = numero % 10;
                soma += Math.pow(digito, 3);
                numero /= 10;
            }
           
            System.out.println("A soma dos dígitos elevados ao cubo é: " + soma);
           
     
    
           
        }
        public static void question14() {
           
           int numero = 1;
       
           while (numero <= 100) {
               if (numero % 2 != 0) {
                   System.out.println(numero);
               }
               numero++;
           }
   
           
        }
        public static void question15() {
           
            int numero = 1;
            while (numero <= 50) {
                if (numero % 3 == 0) {
                    System.out.println(numero);
                }
                numero++;
            }
    
           
        }
        public static void question16() {
           Scanner in = new Scanner(System.in);
           int contador = 0;
           int totalAlunos = 5;
          
           System.out.println("Digite as notas dos alunos:");
          
           while (contador < totalAlunos) {
               System.out.print("Nota do aluno " + (contador + 1) + ": ");
               double nota = in.nextDouble();
              
               if (nota >= 7) {
                   contador++;
               }
           }
          
           System.out.println("Total de alunos aprovados: " + contador);
          
   
           
        }
        public static void question17() {
           Scanner in = new Scanner(System.in);
           int numerosPares = 0;
           boolean encontrouImpar = false;
          
           System.out.println("Digite uma sequência de números inteiros. Digite 0 para encerrar.");
          
           int numero = in.nextInt();
          
           while (numero != 0 && !encontrouImpar) {
               if (numero % 2 == 0) {
                   numerosPares++;
               } else {
                   encontrouImpar = true;
               }
              
               numero = in.nextInt();
           }
          
           System.out.println("Quantidade de números pares antes do primeiro ímpar: " + numerosPares);
          
   
           
        }
        public static void question18() {
            Scanner in = new Scanner(System.in);
            int numerosPares = 0;
            int numerosImpares = 0;
           
            System.out.println("Digite uma sequência de números inteiros. Digite 0 para encerrar.");
           
            int numero = in.nextInt();
           
            while (numero != 0) {
                if (numero % 2 == 0) {
                    numerosPares++;
                } else {
                    numerosImpares++;
                }
               
                numero = in.nextInt();
            }
           
            System.out.println("Quantidade de números pares digitados: " + numerosPares);
            System.out.println("Quantidade de números ímpares digitados: " + numerosImpares);
    
           
        }
        public static void question19() {
            Scanner in = new Scanner(System.in);
            int divisiveisPor2 = 0;
            int divisiveisPor3 = 0;
            int divisiveisPor5 = 0;
           
            System.out.println("Digite uma sequência de números inteiros. Digite 0 para encerrar.");
           
            int numero = in.nextInt();
           
            while (numero != 0) {
                if (numero % 2 == 0) {
                    divisiveisPor2++;
                }
                if (numero % 3 == 0) {
                    divisiveisPor3++;
                }
                if (numero % 5 == 0) {
                    divisiveisPor5++;
                }
               
                numero = in.nextInt();
            }
           
            System.out.println("Quantidade de números divisíveis por 2: " + divisiveisPor2);
            System.out.println("Quantidade de números divisíveis por 3: " + divisiveisPor3);
            System.out.println("Quantidade de números divisíveis por 5: " + divisiveisPor5);
    
           
        }
        public static void question20() {
           Scanner in = new Scanner(System.in);
           int soma = 0;
        int contador = 0;
       
        System.out.println("Digite uma sequência de números inteiros. Digite 0 para encerrar.");
       
        int numero = in.nextInt();
       
        while (numero != 0) {
            if (numero % 3 == 0) {
                soma += numero;
                contador++;
            }
           
            numero = in.nextInt();
        }
       
        if (contador == 0) {
            System.out.println("Nenhum número divisível por 3 foi digitado.");
        } else {
            double media = (double) soma / contador;
            System.out.println("A média dos números divisíveis por 3 é: " + media);
        }
       

           
        }
        public static void question21() {
           Scanner in = new Scanner(System.in);
           int numerosMaisDeTresDigitos = 0;
       
           System.out.println("Digite uma sequência de números inteiros. Digite 0 para encerrar.");
          
           int numero = in.nextInt();
          
           while (numero != 0) {
               if (Math.abs(numero) >= 1000) {
                   numerosMaisDeTresDigitos++;
               }
              
               numero = in.nextInt();
           }
          
           System.out.println("Quantidade de números com mais de três dígitos: " + numerosMaisDeTresDigitos);
   
           
        }
        public static void question22() {
           Scanner in = new Scanner(System.in);
           int soma = 0;
           int contador = 0;
          
           System.out.println("Digite uma sequência de números inteiros. Digite 0 para encerrar.");
          
           int numero = in.nextInt();
          
           while (numero != 0) {
               if (numero >= 50 && numero <= 100) {
                   soma += numero;
                   contador++;
               }
              
               numero = in.nextInt();
           }
          
           if (contador == 0) {
               System.out.println("Nenhum número entre 50 e 100 foi digitado.");
           } else {
               double media = (double) soma / contador;
               System.out.println("A média dos números entre 50 e 100 é: " + media);
           }
   
        }
        public static void question23() {
           Scanner in = new Scanner(System.in);
           int menorPositivoImpar = Integer.MAX_VALUE;
       
           System.out.println("Digite uma sequência de números inteiros. Digite 0 para encerrar.");
          
           int numero = in.nextInt();
          
           while (numero != 0) {
               if (numero > 0 && numero % 2 != 0 && numero < menorPositivoImpar) {
                   menorPositivoImpar = numero;
               }
              
               numero = in.nextInt();
           }
          
           if (menorPositivoImpar == Integer.MAX_VALUE) {
               System.out.println("Nenhum valor positivo e ímpar foi digitado.");
           } else {
               System.out.println("Menor valor positivo e ímpar digitado: " + menorPositivoImpar);
           }
   

        }
        public static void question24() {
            Scanner in = new Scanner(System.in);
            int numerosPares = 0;
            int numerosImpares = 0;
            int primeiroNumero = -1;
            int ultimoNumero = 0;
           
            System.out.println("Digite uma sequência de números inteiros. Digite 0 para encerrar.");
           
            int numero = in.nextInt();
           
            while (numero != 0) {
                if (primeiroNumero == -1) {
                    primeiroNumero = numero;
                }
                ultimoNumero = numero;
               
                if (numero % 2 == 0) {
                    numerosPares++;
                } else {
                    numerosImpares++;
                }
               
                numero = in.nextInt();
            }
           
            if (primeiroNumero == -1) {
                System.out.println("Nenhum número foi digitado.");
            } else {
                System.out.println("Quantidade de números pares entre " + primeiroNumero + " e " + ultimoNumero + ": " + numerosPares);
                System.out.println("Quantidade de números ímpares entre " + primeiroNumero + " e " + ultimoNumero + ": " + numerosImpares);
            }
    
        }
       
}
