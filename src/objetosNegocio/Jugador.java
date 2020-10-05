package objetosNegocio;

import java.awt.Color;

public class Jugador {

    private int height, width, status, monedas;
    private Sectores sector;
    private String nombre;
    private Color color;
    private Ficha[] fichas;

    public Jugador() {
        status = -1;
    }

    public Jugador(String nombre) {
        status = -1;
        this.nombre = nombre;
    }

    public Jugador(String nombre, int nFichas, int apuesta, Color color, Sectores sector) {
        this.nombre = nombre;
        status = -1;
        fichas = new Ficha[nFichas];
        this.monedas = apuesta;
        for (int i = 0; i < 4; i++) {
            fichas[i] = new Ficha(color);
        }
        this.color = color;
        this.sector = sector;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Ficha[] getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = new Ficha[fichas];
        for (int i = 0; i < this.fichas.length; i++) {
            this.fichas[i] = new Ficha(color);
        }
    }

    public int getApuesta() {
        return monedas;
    }

    public void setApuesta(int apuesta) {
        this.monedas = apuesta;
    }

    public Sectores getSector() {
        return sector;
    }

    public void setSector(Sectores sector) {
        this.sector = sector;
    }

}
