import java.util.*;

public class ExemploList {
    public static void main(String[] args) throws Exception {
        List<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("João");
        nomes.add("Carlos");
        nomes.add("Ana");

        System.out.println("Lista completa: " + nomes);

        System.out.println("Elemento na posição 1: " + nomes.get(1));

        nomes.remove("Carlos");
        System.out.println("Após remoção: " + nomes);

        Collections.sort(nomes);
        System.out.println("Ordenada: " + nomes);

        Collections.reverse(nomes);
        System.out.println("Invertida: " + nomes);
        
        Collections.shuffle(nomes);
        System.out.println("Embaralhada: " + nomes);
        
        System.out.println("Valor 'máximo': " + Collections.max(nomes));

        System.out.println("Valor 'mínimo': " + Collections.min(nomes));
    }
}
