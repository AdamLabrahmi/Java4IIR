package JavaAvance4IIR;
import java.util.HashMap;

public class GestionProjet {
    private HashMap<Employe, Projet> mapEmployeProjet = new HashMap<>();

    public void associer(Employe e, Projet p) {
        mapEmployeProjet.put(e, p);
    }

    public void afficherAssociations() {
        for (java.util.Map.Entry<Employe, Projet> entry : mapEmployeProjet.entrySet()) {
            System.out.println(entry.getKey() + " travaille sur " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        GestionProjet gp = new GestionProjet();
        Employe e1 = new Employe("Ahmed", 1);
        Employe e2 = new Employe("Fatima", 2);
        Projet p1 = new Projet("Projet A");
        Projet p2 = new Projet("Projet B");

        gp.associer(e1, p1);
        gp.associer(e2, p2);
        gp.afficherAssociations();
    }
}