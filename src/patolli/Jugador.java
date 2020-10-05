/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patolli;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author javl2
 */
public class Jugador {
    int height,width,status,apuesta;
    Sector sector;
    String nombre;
    Color color;
	Ficha[] fichas;
        public Jugador(){
            status = -1;
        }
        public Jugador(String nombre){
            status = -1;
            this.nombre = nombre;
        }
	public Jugador(String nombre, int height,int width, int nFichas, int apuesta, Color color, Sector sector) {
		this.nombre = nombre;
                status=-1;
                fichas = new Ficha[nFichas];
		this.apuesta=apuesta;
		for(int i=0;i<4;i++) {
			fichas[i]=new Ficha(height,width);
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
            this.fichas[i] = new Ficha(35,35);
        }
    }

    public int getApuesta() {
        return apuesta;
    }

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
        
}
