public class Apoio1 {
    public static void main(String[] args) throws Exception {
        int[] numeros;

        numeros = new int[5];

        System.out.println("Tamanho: " + numeros.length);

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("numeros[%d] = %d\n", i, numeros[i]);
        }

        String[] nomes = new String[3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("nomes[%d] = %s\n", i, nomes[i]);
        }
    }
}
