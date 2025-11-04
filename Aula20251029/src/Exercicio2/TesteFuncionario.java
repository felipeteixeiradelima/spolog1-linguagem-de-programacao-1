package exercicio2;

public class TesteFuncionario {
    public static void main(String[] args) throws NomeVazioException, SalarioInferiorAoMinimoException {
        Funcionario funcionarioValido = new Funcionario();

        System.out.println("Preenchendo dados do 1º funcionário...");
        funcionarioValido.setNome("Felipe");
        funcionarioValido.setSalario(1412);
        funcionarioValido.setCargo("Estagiário");

        System.out.println(funcionarioValido);

        Funcionario funcionarioInvalido = new Funcionario();

        System.out.println("\nPreenchendo dados do 2º funcionário...");
        try {
            funcionarioInvalido.setNome("");
        } catch (NomeVazioException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            funcionarioInvalido.setSalario(1400);
        } catch (SalarioInferiorAoMinimoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        funcionarioInvalido.setCargo("Jovem Aprendiz");
    }
}
