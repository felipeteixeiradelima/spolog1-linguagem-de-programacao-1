package Projeto2;

public class Produto {
    private static int contador = 0;
    private int id;
    private String nome;
    private double preco;

    Produto(String nome, double preco) {
        contador++;
        this.id = contador;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
