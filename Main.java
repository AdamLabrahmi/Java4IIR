package JavaAvance4IIR;

public class Main {
    public static void main(String[] args){
        GestionBibliotheque gb = new GestionBibliotheque();
        gb.ajouterLivre(new Livre("L'Étranger", "Albert Camus", 1942));
        gb.ajouterLivre(new Livre("1984", "George Orwell", 1949));
        gb.afficherLivres();
    }
}
