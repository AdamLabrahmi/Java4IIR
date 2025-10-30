package JavaAvance4IIR;
import java.util.LinkedList;

class GestionTaches {
    private LinkedList<Tache> taches = new LinkedList<>();

    public void ajouterTache(Tache tache) {
        taches.add(tache);
    }

    public void terminerPremiereTache() {
        if (!taches.isEmpty()) {
            taches.getFirst().terminer();
        }
    }

    public void afficherTaches() {
        for (Tache t : taches) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        GestionTaches gt = new GestionTaches();
        gt.ajouterTache(new Tache("Faire les devoirs"));
        gt.ajouterTache(new Tache("Préparer la présentation"));
        gt.terminerPremiereTache();
        gt.afficherTaches();
    }
}