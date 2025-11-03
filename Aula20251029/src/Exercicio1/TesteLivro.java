package Exercicio1;

public class TesteLivro {
    public static void main(String[] args) {
        Livro[] livros = {
            new Livro("Percy Jackson - O mar de monstros", "Rick Riordan"),
            new Livro("Orgulho e Preconceito","Jane Austen")
        };

        double[] precos = {45.90, -92.49};

        // Configurando preço válido para livros[0]
        try {
            livros[0].setPreco(precos[0]);
        } catch (PrecoNegativoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Configurando preço inválido para livros[1]
        try {
            livros[1].setPreco(precos[1]);
        } catch (PrecoNegativoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        for (Livro livro : livros) {
            System.out.printf("""
                    =======================================================

                            Informações do livro %d:
                    
                            Título: %s
                            Autor: %s
                            Preço: R$%.2f

                    =======================================================
                    """, livro.getId(), livro.getTitulo(), livro.getAutor(), livro.getPreco());

        }
    }
}
