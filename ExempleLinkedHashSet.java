package JavaAvance4IIR;

import java.util.LinkedHashSet;

public class ExempleLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> noms = new LinkedHashSet<>();
        noms.add("Ali");
        noms.add("Sara");
        noms.add("Ali"); // Ignoré

        for (String nom : noms) {
            System.out.println(nom);
        }
    }
}
