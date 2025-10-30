package JavaAvance4IIR;

import java.util.Map;
import java.util.TreeMap;

public class GestionTreeMap {
    public static void main(String[] args) {
        TreeMap<CodeProjet, String> treeMap = new TreeMap<>();
        treeMap.put(new CodeProjet("P001"), "Projet Alpha");
        treeMap.put(new CodeProjet("P002"), "Projet Beta");
        treeMap.put(new CodeProjet("P003"), "Projet Gamma");

        for (Map.Entry<CodeProjet, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
