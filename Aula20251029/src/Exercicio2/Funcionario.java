package exercicio2;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    // Getters
    public String getNome() {
        return nome;
    }
    
    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    // Setters
    public void setNome(String nome) throws NomeVazioException{
        if (nome == null) {
            throw new NomeVazioException("O nome do funcionário não pode ser nulo!");
        }
        else if (nome.length() == 0) {
            throw new NomeVazioException("O nome do funcionário não pode ser vazio!");
        }
        this.nome = nome;
    }

    public void setSalario(double salario) throws SalarioInferiorAoMinimoException {
        double salarioMinimo = SalarioMinimo.getSalarioMinimo();

        if (salario < salarioMinimo) {
            String salarioMinimoString = Double.toString(salarioMinimo);
            String salarioString = Double.toString(salario);
            throw new SalarioInferiorAoMinimoException("O salário de R$" + salarioString + " não pode ser menor que o salário mínimo (R$" + salarioMinimoString + ")!");
        }
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Informações do funcionário" +
               "\nNome: " + nome +
               "\nSalário: " + salario +
               "\nCargo: " + cargo;
    }
}
