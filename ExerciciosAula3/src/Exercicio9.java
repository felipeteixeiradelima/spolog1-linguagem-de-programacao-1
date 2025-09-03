import java.util.LinkedHashSet;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> vetor = new LinkedHashSet<>();
        int numero;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; ++i) {
            System.out.printf("Digite o %dº número: ", i+1);
            numero = scanner.nextInt();
            vetor.add(numero);
        }

        for (Integer valor : vetor) {
            System.out.println(valor);
        }

        scanner.close();
    }
}
