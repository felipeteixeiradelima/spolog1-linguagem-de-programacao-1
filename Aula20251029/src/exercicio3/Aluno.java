package exercicio3;

public class Aluno {
    private String nome;
    private String matricula;
    private double media;

    //Construtores
    Aluno(){}

    Aluno(String nome) {
        this.nome = nome;
    }

    Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMedia(double media) throws MediaInvalidaException{
        if (media < 0 | media > 10) {
            throw new MediaInvalidaException("A média " + media + " não está no intervalo entre 0 e 10!");
        }
        this.media = media;
    }

    public String verificarSituacao() {
        if (media >= 6) return "Aprovado";
        if (media >= 4) return "Recuperação";
        return "Reprovado";
    }

    @Override
    public String toString() {
        return "Informações do aluno" +
               "\nNome: " + nome +
               "\nMatrícula: " + matricula +
               "\nMédia: " + media;

    }
}
