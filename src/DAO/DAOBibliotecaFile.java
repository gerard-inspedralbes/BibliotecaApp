package DAO;

import model.Llibre;
import model.Usuari;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DAOBibliotecaFile implements DAOBiblioteca{
    File f_llibres = new File("llibres.txt");
    @Override
    public ArrayList<Llibre> getLlibres() {
        ArrayList<Llibre> llibres = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(f_llibres))) {
            String line;
            while ((line = br.readLine()) != null) {
                llibres.add(Llibre.fromCSV(line));
            }
        } catch (IOException e) {
            return llibres;
        }
        return llibres;
    }

    @Override
    public void prestarLlibre(Llibre l, int idUsr) {

    }

    @Override
    public ArrayList<Usuari> getUsuaris() {
        return null;
    }

    @Override
    public boolean retornarPrestec(int idUrs, int idLlib) {
        return false;
    }

    @Override
    public ArrayList<Llibre> getPrestecs(int idUsr) {
        return null;
    }
}
