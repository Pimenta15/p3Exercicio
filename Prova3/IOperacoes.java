package Prova3;
public abstract class IOperacoes {
    
    public static double media(Aluno aluno){
        int cont = 0;
        for (int i = 0; i < aluno.getPresenca().length ; i++) {
            if (aluno.getPresenca()[i]== false) {
                cont++;
                if (cont > 5) {
                    System.out.println("Reprovado por falta");
                    return -1;
                }
            }
        }
        for (int i = 0; i < aluno.getNotas().length; i++) {
            if (aluno.getNotas()[i] == null) {
                System.out.println("Aluno esta com nota pendente");
                return -1;
            }
        }
        double soma = 0;
        for (int i = 0; i < aluno.getNotas().length; i++) {
            soma += aluno.getNotas()[i];
        }
        soma = soma/3;

        if (soma >= 7 ) {
            System.out.println("Aprovado por media ");
        } else if (soma >= 5){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        return soma;
    }

    public void presenca(Aluno aluno){
        int cont = 0;
        int cont2 = 0;
        for (int i = 0; i < aluno.getPresenca().length; i++) {
            if (aluno.getPresenca()[i]) {
                cont++;
            }
            if (!aluno.getPresenca()[i]){
                cont2++;
            }
        }
        System.out.println("Presença: "+ cont);
        System.out.println("Faltas: "+ cont2);
    }
}
