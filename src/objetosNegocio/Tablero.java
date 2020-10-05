package objetosNegocio;

import java.util.ArrayList;

public class Tablero {
    private ArrayList<Ficha> fichas;
    private Cania [] canias;

    public Tablero(ArrayList<Ficha> fichas, Cania[] canias) {
        this.fichas = fichas;
        this.canias = new Cania[5];
    }

    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
    }

    public Cania[] getCanias() {
        return canias;
    }

    public void setCanias(Cania[] canias) {
        this.canias = canias;
    }
    
    
}
