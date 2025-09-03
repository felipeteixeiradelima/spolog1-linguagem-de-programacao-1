import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        int quantidade = 0;
        int numeroDesejado;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; ++i) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite o número a ser contado: ");
        numeroDesejado = scanner.nextInt();

        for (int valor : vetor) {
            if (valor == numeroDesejado) quantidade++;
        }

        System.out.printf("O número %d aparece %d veze(s)\n", numeroDesejado, quantidade);

        scanner.close();
    }
}
