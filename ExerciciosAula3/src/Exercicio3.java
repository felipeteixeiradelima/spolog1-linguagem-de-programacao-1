import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int vetor[] = new int[8];
        int maior = vetor[0], menor = vetor[0];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; ++i) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = scanner.nextInt();
        }

        for (int valor : vetor) {
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                maior = valor;
            }
        }

        System.out.printf("O maior valor é %d\n", maior);
        System.out.printf("O menor valor é %d\n", menor);

        scanner.close();
    }
}
