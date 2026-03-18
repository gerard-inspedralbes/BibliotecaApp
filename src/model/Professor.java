package model;

public class Professor extends Usuari{
    private static final int MAX_PRESTECS = 5;

    public Professor(String nom) {
        super(nom);
    }

    @Override
    protected int getMaxPrestecs() {
        return MAX_PRESTECS;
    }
    @Override
    public String toString() {
        return "Professor{"+super.toString()+"}";
    }
}
