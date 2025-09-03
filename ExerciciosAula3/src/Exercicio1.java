import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; ++i) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = scanner.nextInt();
        }
        for (int valor : vetor) {
            System.out.println(valor);
        }
        scanner.close();
    }
}
