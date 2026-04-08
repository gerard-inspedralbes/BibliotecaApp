package DAO;

import model.Llibre;
import model.LlibreNoDisponibleException;
import model.Usuari;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOBibliotecaBBDD implements DAOBiblioteca{

    Connection conn = DBConnection.getInstance().getConnection();

    @Override
    public ArrayList<Llibre> getLlibres() {
        ArrayList<Llibre> llibres = new ArrayList<>();

        String sql = "SELECT id, titol, autor, disponible FROM llibres";

        try {
            Connection conn = DBConnection.getInstance().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String titol = rs.getString("titol");
                String autor = rs.getString("autor");
                boolean disponible = rs.getBoolean("disponible");

                // Constructor amb ID (recomanat)
                Llibre llibre = new Llibre(id, titol, autor, disponible);

                llibres.add(llibre);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error obtenint llibres", e);
        }

        return llibres;
    }

    @Override
    public void prestarLlibre(Llibre l, int idUsr) throws LlibreNoDisponibleException {

    }

    @Override
    public ArrayList<Usuari> getUsuaris() {
        return null;
    }

    @Override
    public boolean retornarPrestec(int idUsr, int idLlib) {
        return false;
    }

    @Override
    public ArrayList<Llibre> getPrestecs(int idUsr) {
        return null;
    }
}
