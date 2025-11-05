import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        Map<Integer, String> alunos = new HashMap<>();

        alunos.put(1, "Maria");
        alunos.put(2, "João");
        alunos.put(3, "Ana");

        System.out.println("Mapa completo: " + alunos);

        System.out.println("Aluno com chave 2: " + alunos.get(2));

        alunos.remove(3);
        System.out.println("Após remoção: " + alunos);

        System.out.println("Chaves: " + alunos.keySet());

        System.out.println("Valores: " + alunos.values());
    }
}
