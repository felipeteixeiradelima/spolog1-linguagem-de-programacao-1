public class Apoio4 {
    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 9.2, 6.8};

        double soma = 0;

        for (double n : notas) {
            soma += n;
        }

        double media = soma / notas.length;

        System.out.println("Média: " + media);
    }
}
