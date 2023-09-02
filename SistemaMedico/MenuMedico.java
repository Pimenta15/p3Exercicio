package SistemaMedico;

import java.util.Scanner;



public class MenuMedico {
    public static  Scanner in =  new Scanner(System.in);

    public static void main(String[] args) {
        int cadastro;
        System.out.println("Você deseja Cadastrar:\n 1.Médico\n 2.Paciente");
        cadastro = in.nextInt();
        in.nextLine();
        
        switch (cadastro) {
            case 1:
                Medico();
                break;
            case 2:
                Paciente();
                break;
        
            default:
            System.out.println("Opção invalida");
                break;
        }
    }

    public static void Medico() {
        String codigo,nome,sexo,especialidade, rua,numero,complemento,bairro,cidade,uf,cep;
        Endereco endereco;
        
        System.out.println("Digte o codigo do medico");
        codigo = in.nextLine();
        System.out.println("Digte o nome do medico");
        nome = in.nextLine();
        System.out.println("Digte o sexo do medico");
        sexo = in.nextLine();
    
        System.out.println("Digite a especialidade do medico");
        especialidade = in.nextLine();

        System.out.println("Digite a rua do endereço do medico");
        rua = in.nextLine();
        System.out.println("Digite o numero do endereço do medico");
        numero = in.nextLine();
        System.out.println("Digite o complemento do endereço do medico");
        complemento = in.nextLine();
        System.out.println("Digite o bairro do medico");
        bairro = in.nextLine();
        System.out.println("Digite a cidade do medico");
        cidade = in.nextLine();
        System.out.println("Digite a uf do medico");
        uf = in.nextLine();
        System.out.println("Digite o CEP do medico");
        cep = in.nextLine();

        endereco = new Endereco(rua,numero,complemento, bairro, cidade , uf ,cep);
        Medico m1 = new Medico(codigo, nome, sexo, especialidade, endereco);

        System.out.println(m1);
         int op = 1;

        while (op!= 0) {
                System.out.println("Deseja mudar alguma informação:");
                System.out.println("1.Codigo");
                System.out.println("2.Nome");
                System.out.println("3.Sexo");
                System.out.println("4.Especialidade");
                System.out.println("5.Endereço");
                System.out.println("0.Terminar cadastro");
                op = in.nextInt();
                in.nextLine();

                 switch (op) {
            case 1:
                System.out.println("Digte o codigo do medico");
                codigo = in.next();
                m1.setCodigo(codigo);
                break;
            case 2:
                System.out.println("Digte o nome do medico");
                nome = in.nextLine();
                m1.setNome(nome);
                break;
            case 4:
                System.out.println("Digte a especialidade do medico");
                especialidade = in.nextLine();
                m1.setEspecialidade(especialidade);
                break;
            case 3:
                System.out.println("Digte o sexo do medico");
                sexo = in.nextLine();
                m1.setSexo(sexo);
                break;
            case 5:
                System.out.println("Digite a rua do endereço do medico");
                rua = in.nextLine();
                System.out.println("Digite o numero do endereço do medico");
                numero = in.nextLine();
                System.out.println("Digite o complemento do endereço do medico");
                complemento = in.nextLine();
                System.out.println("Digite o bairro do medico");
                bairro = in.nextLine();
                System.out.println("Digite a cidade do medico");
                cidade = in.nextLine();
                System.out.println("Digite a uf do medico");
                uf = in.nextLine();
                System.out.println("Digite o CEP do medico");
                cep = in.nextLine();

                endereco = new Endereco(rua,numero,complemento, bairro, cidade , uf ,cep);
                m1.setEndereco(endereco);
                break;
                        
                default:
                    System.out.println("Opção inválida");
                break;
         }
     }
    System.out.println("Cadastro Realizado");
    System.out.println(m1);


    }

    public static void Paciente() {
        String codigo, nome , dataNascimento, sexo, planoSaude, alergia, tipoSanguineo;
       
        
        System.out.println("Digte o codigo do paciente");
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
        System.out.println("3.Data de nascimento");
        System.out.println("4.Sexo");
        System.out.println("5.Plano de Saude");
        System.out.println("6.Alergia");
        System.out.println("7.Tipo Sanguineo");
        System.out.println("0.Terminar cadastro");
        op = in.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digte o codigo");
                codigo = in.nextLine();
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
