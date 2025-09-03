import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int vetor[] = new int[15];
        int somaPares = 0, somaImpares = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; ++i) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = scanner.nextInt();
        }

        for (int valor : vetor) {
            if (valor % 2 == 0) {
                somaPares++;
            } else {
                somaImpares++;
            }
        }

        System.out.printf("Quantidade de pares: %d\n", somaPares);
        System.out.printf("Quantidade de ímpares: %d\n", somaImpares);

        scanner.close();
    }
}
