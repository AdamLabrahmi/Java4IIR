package JavaAvance4IIR;

class Employe {
    private String nom;
    private int id;

    public Employe(String nom, int id) {
        this.nom = nom;
        this.id = id;
    }

    public String getNom() { return nom; }

    @Override
    public String toString() {
        return "Employe{" + "nom='" + nom + '\'' + ", id=" + id + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && nom.equals(employe.nom);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nom, id);
    }
}
