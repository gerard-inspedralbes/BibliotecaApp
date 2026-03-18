package model;

public abstract class Usuari implements Comparable<Usuari> {
    private static int contadorUsuaris = 0;
    private int id;
    private String nom;

    public Usuari(String nom) {
        contadorUsuaris++;
        this.id = contadorUsuaris;
        this.nom = nom;
    }

    protected abstract int getMaxPrestecs();

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", nom='" + nom + '\'' ;
    }

    @Override
    public int compareTo(Usuari usuari) {
        return this.nom.compareTo(usuari.nom);
    }


}
