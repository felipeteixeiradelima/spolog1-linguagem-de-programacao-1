import java.util.Scanner;

public class Apoio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos nomes? ");
        int n = Integer.parseInt(sc.nextLine());

        String[] nomes = new String[n];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Nome %d: ", i);
            nomes[i] = sc.nextLine();
        }

        for (int i = 0; i < nomes.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(nomes[i]);
        }

        System.out.println();

        sc.close();
    }
}
