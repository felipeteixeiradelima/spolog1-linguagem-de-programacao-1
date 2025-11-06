import java.util.HashSet;
import java.util.Set;

public class Exercicios2 {
    public static void main(String[] args) {
        Set<String> nomesCidadesSet = new HashSet<>();

        nomesCidadesSet.add("São Paulo");
        nomesCidadesSet.add("Timóteo");
        nomesCidadesSet.add("Ipatinga");
        nomesCidadesSet.add("Nova Lima");
        nomesCidadesSet.add("São Paulo"); // nome duplicado

        System.out.println("Cidades sem duplicatas: " + nomesCidadesSet);
    }
}
