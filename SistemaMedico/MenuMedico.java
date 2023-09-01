package SistemaMedico;

import java.util.Scanner;



public class MenuMedico {
    public static void main(String[] args) {
        String codigo, nome , dataNascimento, sexo, planoSaude, alergia, tipoSanguineo;
        Scanner in =  new Scanner(System.in);
        
        System.out.println("Digte o codigo");
        codigo = in.nextLine();
        System.out.println("Digte o nome do paciente");
       
        nome = in.nextLine();
        System.out.println("Digte a data de nascimento");
       
        dataNascimento = in.nextLine(); 
        System.out.println("Digte o sexo do paciente");
       
        sexo = in.nextLine();
        System.out.println("Digte o plano de saude do paciente");
       
        planoSaude = in.nextLine();
        System.out.println("Digte o alergia do paciente");
      
        alergia = in.nextLine();
        System.out.println("Digte o tipo sanguineo do paciente");
      
        tipoSanguineo = in. nextLine();
        

        Paciente p1 = new Paciente(codigo,nome,dataNascimento,sexo,planoSaude,alergia,tipoSanguineo);

        System.out.println(p1);
         int op = 1;

while (op!= 0) {
        System.out.println("Deseja mudar algum dado?");
        System.out.println("1.Codigo");
        System.out.println("2.Nome");
        System.out.println("3.Daat de nascimento");
        System.out.println("4.Sexo");
        System.out.println("5.Plano de Saude");
        System.out.println("6.Alergia");
        System.out.println("7.Tipo Sanguineo");
        System.out.println("0.Terminar cadastro");
        op = in.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digte o codigo");
                codigo = in.next();
                p1.setCodigo(codigo);
                break;
            case 2:
                System.out.println("Digte o nome do paciente");
                nome = in.nextLine();
                p1.setNome(nome);
                break;
            case 3:
                System.out.println("Digte a data de nascimento");
                dataNascimento = in.nextLine();
                p1.setDataNascimento(dataNascimento);
                break;
            case 4:
                System.out.println("Digte o sexo do paciente");
                sexo = in.nextLine();
                p1.setSexo(sexo);
                break;
            case 5:
                System.out.println("Digte o plano de saude do paciente");
                planoSaude = in.nextLine();
                p1.setPlanoSaude(planoSaude);
                break;
            case 6:
                System.out.println("Digte o alergia do paciente");
                alergia = in.nextLine();
                p1.setAlergia(alergia);
                break;
            case 7:
                System.out.println("Digte o tipo sanguineo do paciente");
                tipoSanguineo = in. nextLine();
                p1.setTipoSanguineo(tipoSanguineo);
                break;
           
            default:
            System.out.println("Opção inválida");
                break;
         }
     }
    System.out.println("Cadastro Realizado");
    System.out.println(p1);
       
    }
}
