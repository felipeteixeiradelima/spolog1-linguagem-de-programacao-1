import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int vetor[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < vetor.length; ++i) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = scanner.nextInt();
        }

        for (int valor : vetor) {
            soma += valor;
        }

        System.out.printf("A soma dos valores dos vetores vale %d\n", soma);

        scanner.close();
    }
}
