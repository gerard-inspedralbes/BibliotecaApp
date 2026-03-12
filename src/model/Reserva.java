package model;

public class Reserva {
    private Usuari usuari;
    private Llibre llibre;

    public Reserva(Usuari usuari, Llibre llibre) {
        this.usuari = usuari;
        this.llibre = llibre;
    }

    public Usuari getUsuari() {
        return usuari;
    }

    public Llibre getLlibre() {
        return llibre;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "usuari=" + usuari +
                ", llibre=" + llibre +
                '}';
    }
}
