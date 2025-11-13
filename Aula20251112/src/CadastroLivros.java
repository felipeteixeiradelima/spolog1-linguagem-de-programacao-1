import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CadastroLivros {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:biblioteca.db";
        String stmt;

        try (Connection conexao = DriverManager.getConnection(url);
             Scanner scanner = new Scanner(System.in);) {

            System.out.println("Conexão estabelecida com sucesso!");

            // Cria a tabela caso não exista
            stmt = "CREATE TABLE IF NOT EXISTS livros (" +
                   "    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                   "    titulo TEXT NOT NULL," +
                   "    autor TEXT NOT NULL," +
                   "    ano INTEGER NOT NULL" +
                   ");";
            Statement criaTabelaStatement = conexao.createStatement();
            criaTabelaStatement.execute(stmt);
            criaTabelaStatement.close();

            // Insere um novo livro digitado pelo usuário
            System.out.println("\nVamos inserir um livro!");
            System.out.print("Digite o título do livro: ");
            String titulo = scanner.nextLine();

            System.out.print("Digite o(a) autor(a) do livro: ");
            String autor = scanner.nextLine();

            System.out.print("Digite o ano do livro: ");
            int ano = Integer.parseInt(scanner.next());

            stmt = "INSERT INTO livros (titulo, autor, ano) VALUES (?, ?, ?)";
            PreparedStatement inserirLivrosPreparedStatement = conexao.prepareStatement(stmt);
            inserirLivrosPreparedStatement.setString(1, titulo);
            inserirLivrosPreparedStatement.setString(2, autor);
            inserirLivrosPreparedStatement.setInt(3, ano);

            inserirLivrosPreparedStatement.executeUpdate();
            inserirLivrosPreparedStatement.close();

            System.out.println("Livro inserido com sucesso!");

            // Consulta todos os livros cadastrados
            stmt = "SELECT * FROM LIVROS";
            Statement consultaLivrosStatement = conexao.createStatement();
            ResultSet rs = consultaLivrosStatement.executeQuery(stmt);

            System.out.println("\n=================== LIVROS CADASTRADOS ====================");
            while (rs.next()) {
                int id = rs.getInt("id");
                titulo = rs.getString("titulo");
                autor = rs.getString("autor");
                ano = rs.getInt("ano");

                System.out.printf("||\n|======================= LIVRO %03d =======================\n||\n", id);
                System.out.println("|| titulo: " + titulo);
                System.out.println("|| autor(a): " + autor);
                System.out.println("|| ano: " + ano);
            }
            System.out.println("||\n===========================================================");


        } catch (SQLException e) {
            System.out.println("Erro no banco de dados: " + e.getMessage());
        }
    }
}
