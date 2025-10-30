package JavaAvance4IIR;

public class TacheMain {
    public static void main(String[] args) {
        GestionTaches gt = new GestionTaches();
        gt.ajouterTache(new Tache("Faire les devoirs"));
        gt.ajouterTache(new Tache("Préparer la présentation"));
        gt.terminerPremiereTache();
        gt.afficherTaches();
    }
}
