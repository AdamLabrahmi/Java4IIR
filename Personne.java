package JavaAvance4IIR;

import java.util.TreeSet;

//public class Personne implements Comparable<Personne> {
//    private String nom;
//    private int age;
//
//    public Personne(String nom, int age) {
//        this.nom = nom;
//        this.age = age;
//    }
//
//    @Override
//    public int compareTo(Personne p) {
//        return this.nom.compareTo(p.nom);
//    }
//
//    @Override
//    public String toString() {
//        return nom + " (" + age + " ans)";
//    }
//
//    public static void main(String[] args) {
//        TreeSet<Personne> personnes = new TreeSet<>();
//        personnes.add(new Personne("Alice", 30));
//        personnes.add(new Personne("Bob", 25));
//        personnes.add(new Personne("Claire", 28));
//
//        for (Personne p : personnes) {
//            System.out.println(p);
//        }
//    }
//}



import java.util.TreeSet;
import java.util.Comparator;

public class Personne {
    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    @Override
    public String toString() {
        return nom + " (" + age + " ans)";
    }

    public static void main(String[] args) {
        Comparator<Personne> ageComparator = new Comparator<Personne>() {
            @Override
            public int compare(Personne p1, Personne p2) {
                return Integer.compare(p1.age, p2.age);
            }
        };

        TreeSet<Personne> personnes = new TreeSet<>(ageComparator);
        personnes.add(new Personne("Alice", 30));
        personnes.add(new Personne("Bob", 25));
        personnes.add(new Personne("Claire", 28));

        for (Personne p : personnes) {
            System.out.println(p);
        }
    }
}