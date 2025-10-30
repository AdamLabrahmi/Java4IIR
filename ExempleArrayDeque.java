package JavaAvance4IIR;

import java.util.ArrayDeque;

public class ExempleArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<>();
        adq.addFirst("Premier");
        adq.addLast("Dernier");

        System.out.println(adq.pollFirst()); // Premier
        System.out.println(adq.pollLast()); // Dernier
    }
}