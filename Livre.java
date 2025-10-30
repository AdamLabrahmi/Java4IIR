package JavaAvance4IIR;

public class Livre {
    private String titre;
    private String auteur;
    private int annee;

    public Livre(String titre, String auteur, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;

    }

    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public int getAnnee() { return annee; }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", annee=" + annee +
                '}';
    }
}
