import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        List<String> nomesList = new ArrayList<>();

        nomesList.add("Felipe");
        nomesList.add("Letícia");
        nomesList.add("Amanda");
        nomesList.add("Thiago");
        nomesList.add("Ana Maria");

        System.out.println("Lista original: " + nomesList);

        // Organizando em ordem alfabética
        Collections.sort(nomesList);
        System.out.println("Lista ordenada: " + nomesList);
    }
}
