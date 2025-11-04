package exercicio3;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Felipe", "SP3155048");

        System.out.println("Inserindo uma média inválida...");

        try {
            aluno.setMedia(-2);
        } catch (MediaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            aluno.setMedia(9);
        } catch (MediaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println();
        System.out.println(aluno);
    }
}
