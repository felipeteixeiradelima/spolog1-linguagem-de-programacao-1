package Projeto4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuarioAdmin = new Usuario("admin", "1234");
        int tentativas = 0;
        final int LIMITE_TENTATIVAS = 3;
        boolean sucessoLogin = false;

        do {
            Usuario usuarioTentativa = new Usuario();

            System.out.printf("\nTentativas de login restantes: %d\n", LIMITE_TENTATIVAS - tentativas);

            System.out.print("username: ");
            usuarioTentativa.setUsername(scanner.nextLine());
            System.out.print("senha: ");
            usuarioTentativa.setSenha(scanner.nextLine());
            
            if (usuarioTentativa.equals(usuarioAdmin))
                sucessoLogin = true;

            tentativas++;
        } while (!sucessoLogin & tentativas < LIMITE_TENTATIVAS);

        if (sucessoLogin) {
            System.out.println("Você fez login com sucesso!");
        } else {
            System.out.println("Tentativas excedidas! Acesso negado!");
        }

        scanner.close();
    }
}
