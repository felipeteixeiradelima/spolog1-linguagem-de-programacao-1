import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int vetorA[] = new int[5];
        int vetorB[] = new int[5];
        int vetorC[] = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; ++i) {
            System.out.printf("Digite o %dº número para o vetor A: ", i+1);
            vetorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorB.length; ++i) {
            System.out.printf("Digite o %dº número para o vetor B: ", i+1);
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorC.length; ++i) {
            if (i%2 == 0) {
                vetorC[i] = vetorA[i/2];
            } else {
                vetorC[i] = vetorB[i/2];
            }
        }

        for (int valor : vetorC) {
            System.out.println(valor);
        }

        scanner.close();
    }
}
