package Exercicio1;

public class Livro {
    private static int qtdLivros = 0;

    private int id;
    private String titulo;
    private String autor;
    private double preco;

    Livro(String titulo) {
        setId();
        this.titulo = titulo;
    }

    Livro(String titulo, String autor) {
        setId();
        this.titulo = titulo;
        this.autor = autor;
    }

    Livro(String titulo, double preco) throws PrecoNegativoException {
        setId();
        this.titulo = titulo;
        this.setPreco(preco);
    }

    Livro(String titulo, String autor, double preco) throws PrecoNegativoException {
        setId();
        this.titulo = titulo;
        this.autor = autor;
        this.setPreco(preco);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    private void setId() {
        int id = ++qtdLivros;
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(double preco) throws PrecoNegativoException {
        // Tratamento de preço negativo
        if (preco < 0) {
            throw new PrecoNegativoException("O preço do livro não pode ser negativo!");
        }

        this.preco = preco;
    }
}
