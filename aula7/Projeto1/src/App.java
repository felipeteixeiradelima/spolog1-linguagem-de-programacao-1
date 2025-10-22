import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        final int tamanhoArray = 5;

        String[] nomes = new String[tamanhoArray];
        double[] notas = new double[tamanhoArray];
        boolean[] aprovados = new boolean[tamanhoArray];
        int qtdAprovados = 0;
        int qtdReprovados = 0;

        double media, soma = 0;

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.printf("Nome do aluno %d: ", i+1);
            nomes[i] = scanner.nextLine();
            System.out.printf("Nota de %s: ", nomes[i]);
            notas[i] = Double.parseDouble(scanner.nextLine());

            if (notas[i] >= 7) {
                aprovados[i] = true;
                qtdAprovados++;
            }

            soma += notas[i];
        }

        media = soma / tamanhoArray;
        qtdReprovados = tamanhoArray - qtdAprovados;

        System.out.println("\n--- Relatório ---");

        System.out.println("Média geral da turma: " + media);

        for (int i = 0; i < tamanhoArray; i++) {
            String nome = nomes[i];
            double nota = notas[i];
            boolean aprovado = aprovados[i];
            String textoAprovado = aprovado ? "Aprovado" : "Reprovado";

            System.out.printf("%s - Nota: %.2f - %s\n", nome, nota, textoAprovado);
        }

        System.out.printf("Quantidade de aprovados: %d\n", qtdAprovados);
        System.out.printf("Quantidade de reprovados: %d\n", qtdReprovados);

        scanner.close();
    }
}
