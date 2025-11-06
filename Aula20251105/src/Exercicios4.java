import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicios4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inteirosList = new ArrayList<>();
        int maiorValor, menorValor, tamanhoLista = 5;

        for (int i = 0; i < tamanhoLista; i++) {
            Integer numero;
            System.out.printf("Digite o %dº inteiro: ", i+1);
            numero = Integer.parseInt(scanner.next());

            inteirosList.add(numero);
        }

        System.out.println("\nLista digitada: " + inteirosList);

        menorValor = Collections.min(inteirosList);
        maiorValor = Collections.max(inteirosList);

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);

        scanner.close();
    }
}
