package DAO;

import model.Llibre;
import model.Usuari;

import java.util.ArrayList;

public interface DAOBiblioteca {
    ArrayList<Llibre> getLlibres();
    void prestarLlibre(Llibre l, int idUsr);
    ArrayList<Usuari> getUsuaris();
    boolean retornarPrestec(int idUrs, int idLlib);
    ArrayList<Llibre> getPrestecs(int idUsr);
}
