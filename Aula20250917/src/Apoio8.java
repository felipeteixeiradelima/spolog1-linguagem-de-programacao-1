public class Apoio8 {
    public static void main(String[] args) {
        int[][] triangulo = new int[3][];

        triangulo[0] = new int[1];

        triangulo[1] = new int[2];

        triangulo[2] = new int[3];

        int v = 1;

        for (int i = 0; i < triangulo.length; i++) {
            for (int j = 0; j < triangulo[i].length; j++) {
                triangulo[i][j] = v++;
            }
       }

       for (int i = 0; i < triangulo.length; i++) {
            for (int j = 0; j < triangulo[i].length; j++) {
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
