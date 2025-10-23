package Projeto3;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int objetivo = random.nextInt(100) + 1;
        int escolha;
        int tentativas = 0;

        System.out.println("Advinhe o inteiro que estou pensando (entre 1 e 100)!");

        do {
            System.out.print("\nDigite seu palpite (1 a 100): ");
            escolha = Integer.parseInt(scanner.next());

            if (escolha < objetivo) {
                System.out.printf("O número que estou pensando é maior que %d!\n", escolha);
            } else if (escolha > objetivo) {
                System.out.printf("O número que estou pensando é menor que %d!\n", escolha);
            }

            tentativas++;
        } while (escolha != objetivo);

        System.out.println("\nParabéns, você acertou!");
        System.out.printf("Eu estava pensando no número %d!\n", objetivo);
        System.out.printf("Total de tentativas: %d\n", tentativas);
        scanner.close();
    }
}
