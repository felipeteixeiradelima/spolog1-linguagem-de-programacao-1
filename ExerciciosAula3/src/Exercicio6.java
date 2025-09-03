import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        double vetor[] = new double[5];
        double soma = 0, media;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; ++i) {
            System.out.printf("Digite a %dª nota: ", i+1);
            vetor[i] = scanner.nextDouble();
        }

        for (double valor : vetor) {
            soma += valor;
        }

        media = soma / vetor.length;

        System.out.printf("Média das notas: %f\n", media);

        for (int i = 0; i < vetor.length; ++i) {
            if (vetor[i] > media) {
                System.out.printf("Aluno Nº %d acima da média com nota %f\n", i, vetor[i]);
            }
        }

        scanner.close();
    }
}
