import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int vetor[] = new int[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; ++i) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = scanner.nextInt();
        }

        for (int i = vetor.length - 1; i >= 0; --i) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }
}
