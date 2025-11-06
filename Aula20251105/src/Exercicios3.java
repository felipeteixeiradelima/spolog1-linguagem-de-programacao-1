import java.util.HashMap;
import java.util.Map;

public class Exercicios3 {
    public static void main(String[] args) {
        Map<String, Double> alunosNotasMap = new HashMap<>();

        alunosNotasMap.put("Felipe", 9.0);
        alunosNotasMap.put("Amanda", 10.0);
        alunosNotasMap.put("Letícia", 8.5);

        System.out.println("Notas e nomes dos alunos: " + alunosNotasMap);

    }
}
