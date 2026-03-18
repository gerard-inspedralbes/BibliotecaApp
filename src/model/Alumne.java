package model;

public class Alumne extends Usuari{
    private static final int MAX_PRESTECS = 2;
    public Alumne(String nom) {
        super(nom);
    }

    @Override
    protected int getMaxPrestecs() {
        return MAX_PRESTECS;
    }

    @Override
    public String toString() {
        return "Alumne{"+super.toString()+"}";
    }


}
