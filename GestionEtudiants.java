package JavaAvance4IIR;
import java.util.HashSet;
class GestionEtudiants {
    private HashSet<Etudiant> etudiants = new HashSet<>();

    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    public void afficherEtudiants() {
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        GestionEtudiants ge = new GestionEtudiants();
        ge.ajouterEtudiant(new Etudiant("Ali", 101));
        ge.ajouterEtudiant(new Etudiant("Sara", 102));
        ge.ajouterEtudiant(new Etudiant("Ali", 101)); // Duplicate
        ge.afficherEtudiants();
    }
}
