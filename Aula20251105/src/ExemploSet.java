import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        Set<String> linguagens = new HashSet<>();

        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C#");
        linguagens.add("Java");

        System.out.println("Conjunto: " + linguagens);

        linguagens.remove("Python");
        System.out.println("Após remoção: " + linguagens);

        System.out.println("Contém 'Java'? " + linguagens.contains("Java"));
    }
}