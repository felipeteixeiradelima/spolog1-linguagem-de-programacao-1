public class Apoio5 {
    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 6.5, 9.0};

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas[" + i + "] = " + notas[i]);

            soma += notas[i];
        }

        System.out.println("Média: " + (soma / notas.length));

        System.out.println("For-each: ");

        for (double n : notas) {
            System.out.print(n + " ");
        }

        System.out.println();
    }
}
