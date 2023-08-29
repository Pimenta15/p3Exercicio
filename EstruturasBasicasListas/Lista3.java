package EstruturasBasicasListas;

import java.util.Scanner;

/**
 * Lista3
 */
public class Lista3 {

    public static void question1() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Qual seu nome?");
        String name = in.next();


        System.out.println("Bem vindo " + name);

    }
    public static void question2() {
        

        Scanner in = new Scanner(System.in);
       
        System.out.println("digite sua idade");
        String idade = in.next();
       
        int idadeN = Integer.parseInt(idade) ;


        System.out.println("Sua idade inteiro é : " + idadeN);

    }
    public static void question3() {

         Scanner in = new Scanner(System.in);
       
        System.out.println("Digite um inteiro");
        int inteiro = in.nextInt();
        float flutuante = inteiro;
        System.out.println(flutuante);

    }
    public static void question4() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite um inteiro");
        int inteiro1 = in.nextInt();
        System.out.println("Digite outro inteiro");
        int inteiro2 = in.nextInt();
       
        System.out.println("A soma de "+ inteiro1 +" + "+ inteiro2 +" = "+ (inteiro1+inteiro2));

    }
    public static void question5() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite um decimal");
        float decimal = in.nextFloat();
       
        System.out.println("O quadrado de "+ decimal +" é "+ Math.pow(decimal, 2));

    }
    public static void question6() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite o ano de seu nascimeto");
        int ano = in.nextInt();
       
        System.out.println("Você tem "+ (2023 - ano)+" anos");
    }
    public static void question7() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite o seu primeiro nome");
        String nome = in.next();
        System.out.println("Digite seu sobrenome");
        String sobrenome = in.next();


        String completo = (nome +" "+ sobrenome);
        System.out.println("Seu nome completo é "+ completo);
    }
    public static void question8() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite uma sequência de números separados por espaço:");
        String sequence = in.next();
       
        String[] numbers = sequence.split(" ");
        int quant = numbers.length;
       
        System.out.println("Total de números digitados: " + quant);

    }
    public static void question9() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite um animal");
        String animal = in.next();
       
        System.out.println("O animal que você digitou: " + animal);
    }
    public static void question10() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite seu nome e sobrenome");
        String nomeCompelto = in.nextLine();
       
        String[] nomes = nomeCompelto.split(" ");
       
        System.out.println("Bem vindo "+ nomes[nomes.length-1]+ " "+ nomes[0]);

    }
    public static void question11() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite uma String");
        String string = in.nextLine();
       
        String[] caracteres = string.split("");


        int quantidade = caracteres.length;
       
        System.out.println("Numero de caracteres da string = "+ quantidade);

    }
    public static void question12() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite um numero inteiro");
        int numero = in.nextInt();


        if (numero%2 == 0) {
            System.out.println(" Número: PAR");
        }else{
            System.out.println(" Número: IMPAR");
        }

    }
    public static void question13() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite um numero inteiro");
        int numero = in.nextInt();


        if (numero > 0) {
            System.out.println(" Número: POSITIVO");
        }else {
            System.out.println(" Número: NEGATIVO");
        }

    }
    public static void question14() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite um numero inteiro");
        int numero1 = in.nextInt();
        System.out.println("Digite outro numero inteiro");
        int numero2 = in.nextInt();


        if (numero1 > numero2) {
            System.out.println(" Número maior: " + numero1);
        }else {
            System.out.println(" Número maior: " + numero2);
        }

    }
    public static void question15() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite sua altura em metros");
        double altura = in.nextDouble();
        System.out.println("Digite seu peso");
        double peso = in.nextDouble();


            System.out.println("Seu IMC é de: " + peso/(altura*altura));

    }
    public static void question16() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite seu nome");
        String name = in.nextLine();


        if(name.length()>5){
            System.out.println("O seu nome tem mais de 5 caracteres");
        }else{
             System.out.println("O seu nome não tem mais de 5 caracteres");
        }

    }
    public static void question17() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite seu estado civil");
        String estado = in.nextLine();


        System.out.println("Você é"+ estado);
    }
    public static void question18() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite a base do retangulo");
        double base = in.nextDouble();
        System.out.println("Digite a altura do retangulo");
        double altura = in.nextDouble();


        System.out.println("A area do retangulo é"+ base*altura);
    }
    public static void question19() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite sua cidade");
        String cidade = in.nextLine();


        if (cidade.toLowerCase().startsWith("s")) {
            System.out.println("O nome da cidade começa com a letra 'S'.");
        } else {
            System.out.println("O nome da cidade não começa com a letra 'S'.");
        }

    }
    public static void question20() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite um numero decimal");
        double num1 = in.nextDouble();
        System.out.println("Digite um numero decimal");
        double num2 = in.nextDouble();


        System.out.println("O resto da divisão entre eles é de: " + num1%num2);

    }
    public static void question21() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite um numero em decimal");
        double num1 = in.nextDouble();
        int inteiro = (int) num1;
        System.out.println("O número digitado em inteiro é: " + inteiro);
    }
    public static void question22() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite um numero inteiro");
        String num1 = in.next();
       
        int inteiro = Integer.parseInt(num1)+10;
       
        String resultadoString = Integer.toString(inteiro);


        System.out.println("O número digitado em inteiro é: " + resultadoString);
    }
    public static void question23() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite uma data no formato dd/mm/aaaa:");
        String data = in.nextLine();
       
        String[] partesData = data.split("/");
       
        int dia = Integer.parseInt(partesData[0]);
        int mes = Integer.parseInt(partesData[1]);
        int ano = Integer.parseInt(partesData[2]);
                       
        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);
    }
    public static void question24() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite o nome da cidade:");
        String cidade = in.nextLine();
       
        System.out.println("Digite o nome do estado:");
        String estado = in.nextLine();


        System.out.println("Você mora em " + cidade + ", " + estado + ".");

    }
    public static void question25() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite o ano de seu nascimento:");
        int ano = in.nextInt();
       
        System.out.println("Bem-vindo ao nosso programa, nascido em " + ano + "!");

    }
    public static void question26() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite um número inteiro:");
        int numero = in.nextInt();
       
        System.out.println("Digite uma string:");
        String texto = in.nextLine();  
        texto = in.nextLine();
       
        String concatenado = numero + " " + texto;
        System.out.println(concatenado);

    }
    public static void question27() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite o nome do produto:");
        String nomeProduto = in.nextLine();  
       
        System.out.println("Digite o preço do produto:");
        double preco = in.nextDouble();
   
        System.out.println(nomeProduto + ": R$ " + preco);

    }
    public static void question28() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite um número inteiro:");
        int numero = in.nextInt();


        String mensagem = "O dobro de " + numero + " é " + numero*2 + ".";
   
        System.out.println(mensagem);

    }
    public static void question29() {
        Scanner in = new Scanner(System.in);
           
        System.out.println("Digite seu endereço de e-mail:");
        String email = in.nextLine();
   
        String mensagem = "Obrigado! Seu e-mail " + email + " foi recebido.";
        System.out.println(mensagem);

    }
    public static void question30() {
        Scanner in = new Scanner(System.in);
           
        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = in.nextInt();
   
        System.out.println("Digite o segundo número inteiro:");
        int numero2 = in.nextInt();
       
        int quociente = 0;
        int soma = numero1 + numero2;
        int diferenca = numero1 - numero2;
        int produto = numero1 * numero2;
        if(numero2 != 0){
             quociente = numero1 / numero2;
        }
       
        System.out.println("Soma: " + soma);
        System.out.println("Diferença: " + diferenca);
        System.out.println("Produto: " + produto);
       if(numero2 != 0){
        System.out.println("Quociente (divisão inteira): " + quociente);
        }else{
            System.out.println("Não é possivel dividir por 0");
        }

    }
    public static void question31() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite a base do triangulo");
        double base = in.nextDouble();
        System.out.println("Digite a altura do triangulo");
        double altura = in.nextDouble();


        double area =  (base*altura)/2;


        System.out.println("A area do retangulo é"+ area);
    }
    public static void question32() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite o raio do circulo");
        double raio = in.nextDouble();
       
        double perimetro =  2 * raio * Math.PI;


        System.out.println("O perimetro do circulo é"+ perimetro);
    }
    public static void question33() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite a base do retangulo");
        double base = in.nextDouble();


        System.out.println("Digite a altura do retangulo");
        double altura = in.nextDouble();


       double perimetro =  2*altura+ 2*base;


        System.out.println("O perimetro do retangulo é"+ perimetro);
    }
    public static void question34() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite o primeiro número decimal:");
        double numero1 = in.nextDouble();
       
        System.out.println("Digite o segundo número decimal:");
        double numero2 = in.nextDouble();
       
        System.out.println("Digite o terceiro número decimal:");
        double numero3 = in.nextDouble();
       
        double media = (numero1 + numero2 + numero3) / 3;
       
        System.out.println("A média aritmética dos números é: " + media);

    }
    public static void question35() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite a sua idade:");
        int idadeAnos = in.nextInt();
       
        int meses = idadeAnos * 12;
        int dias = idadeAnos * 365;
       
        System.out.println("Você viveu aproximadamente " + meses + " meses e " + dias + " dias.");

    }
    public static void question36() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite o valor em reais:");
        double valorEmReais = in.nextDouble();
       
        System.out.println("Digite a cotação do dólar:");
        double cotacaoDolar = in.nextDouble();
       
        double valorEmDolares = valorEmReais / cotacaoDolar;
       
        System.out.println("O valor em dólares é: $" + valorEmDolares);
       

    }
    public static void question37() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite um número decimal:");
        double numeroDecimal = in.nextDouble();
       
        System.out.println("Número arredondado: " +Math.round(numeroDecimal));
       

    }
    public static void question38() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite o primeiro número inteiro:");
        int n1 = in.nextInt();
       
        System.out.println("Digite o segundo número inteiro:");
        int n2 = in.nextInt();
       
        System.out.println("Digite o terceiro número inteiro:");
        int n3 = in.nextInt();
       
        int resultado = (n1 + n2) * n3;
       
        System.out.println("Resultado da operação: " + resultado);
       

    }
    public static void question39() {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = in.nextDouble();
       
        double fahrenheit = (celsius * 9/5) + 32;
       
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
       
    }


    }

