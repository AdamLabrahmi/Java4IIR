package JavaAvance4IIR;

import java.util.LinkedHashMap;

public class ExempleLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Un");
        map.put(2, "Deux");
        map.put(3, "Trois");

        for (java.util.Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}