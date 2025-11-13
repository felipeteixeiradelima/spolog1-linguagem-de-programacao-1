package projetojdbc;

import java.sql.*;
import java.util.Scanner;

public class Conexao {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:escola.db"; // Caminho do banco

        try (Connection conexao = DriverManager.getConnection(url);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("✅ Conexão estabelecida com sucesso!");

            // Entrada de dados
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a idade do aluno: ");
            int idade = scanner.nextInt();

            // Cria a tabela se não existir
            String sqlCreate = "CREATE TABLE IF NOT EXISTS alunos (" +
                               "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                               "nome TEXT NOT NULL, " +
                               "idade INTEGER)";
            Statement criar = conexao.createStatement();
            criar.execute(sqlCreate);
            criar.close();

            // Inserção de dados
            String sqlInsert = "INSERT INTO alunos (nome, idade) VALUES (?, ?)";
            PreparedStatement inserir = conexao.prepareStatement(sqlInsert);
            inserir.setString(1, nome);
            inserir.setInt(2, idade);

            // O banco é atualizado neste exato momento
            inserir.executeUpdate();
            System.out.println("💾 Registro inserido e salvo no banco!");

            // Consulta dos dados
            String sqlSelect = "SELECT * FROM alunos";
            Statement consulta = conexao.createStatement();
            ResultSet resultado = consulta.executeQuery(sqlSelect);

            System.out.println("\n📋 Alunos cadastrados:");
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nomeAluno = resultado.getString("nome");
                int idadeAluno = resultado.getInt("idade");
                System.out.println(id + " - " + nomeAluno + " (" + idadeAluno + " anos)");
            }

            inserir.close();
            consulta.close();

        } catch (SQLException e) {
            System.out.println("❌ Erro ao acessar o banco: " + e.getMessage());
        }
    }
}
