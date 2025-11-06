import java.util.HashSet;
import java.util.Set;

public class Exercicios5 {
    public static void main(String[] args) {
        Set<String> coresSet = new HashSet<>();

        coresSet.add("Azul");
        coresSet.add("Amarelo");
        coresSet.add("Vermelho");
        coresSet.add("Branco");
        coresSet.add("Preto");
        coresSet.add("Roxo");
        coresSet.add("Anil");
        coresSet.add("Verde");
        coresSet.add("Preto"); // valor duplicado
        coresSet.add("Cinza");
        coresSet.add("Rosa");
        coresSet.add("Laranja");
        coresSet.add("Bege");
        coresSet.add("Preto"); // valor duplicado

        System.out.println("Cores: " + coresSet);
        System.out.println("Total de cores cadastradas: " + coresSet.size());
    }
}
