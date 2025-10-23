package Projeto2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        double total = 0;

        Produto[] produtos = {
            new Produto("X-Burguer", 12),
            new Produto("X-Salada", 15),
            new Produto("Refrigerante", 6)
        };

        do {
            Produto produtoEscolhido = null;

            System.out.println("--- Cardápio ---");

            for (Produto produto : produtos) {
                System.out.printf("%d - %s (R$%.2f)\n", produto.getId(), produto.getNome(), produto.getPreco());
            }

            System.out.println("0 - Finalizar");
            System.out.print("Escolha: ");
            escolha = Integer.parseInt(scanner.next());

            switch (escolha) {
                case 0:
                    System.out.println("Fechando cardápio!");
                    break;
                case 1:
                    produtoEscolhido = produtos[0];
                    System.out.println(produtoEscolhido.getNome() + " adicionado!");
                    break;
                case 2:
                    produtoEscolhido = produtos[1];
                    System.out.println(produtoEscolhido.getNome() + " adicionado!");
                    break;
                case 3:
                    produtoEscolhido = produtos[2];
                    System.out.println(produtoEscolhido.getNome() + " adicionado!");
                    break;

                default:
                    System.out.println("Item inválido!");
                    break;
            }

            System.out.println();

            if (produtoEscolhido != null) {
                total += produtoEscolhido.getPreco();
            }
        } while (escolha != 0);

        System.out.printf("Total: R$%.2f\n", total);
        scanner.close();
    }
}
