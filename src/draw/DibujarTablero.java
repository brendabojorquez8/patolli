package draw;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JFrame;
import objetosNegocio.Tablero;

public class DibujarTablero extends Canvas {

    private int tamanno;
    private final int casillasPorAspa;
    private final int tamannoCasillas = 35;
    private final int inicio = 15;
    ArrayList<Graphics> casillas;

    public DibujarTablero(int casillas) {
        this.tamanno = casillas * 4 + 4;
        this.casillasPorAspa = casillas + 2;
        this.casillas = new ArrayList<>();
    }

    @Override
    public void paint(Graphics g) {
        generarCasillas(g);
    }

    public void dibujar() {
        JFrame frame = new JFrame("Patolli");
        Canvas canvas = new DibujarTablero(40);
        canvas.setSize(800, 800);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void generarCasillas(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        dibujarAspaIzquierda(g2d, inicio, casillasPorAspa / 2 * tamannoCasillas);
        dibujarAspaSuperior(g2d, casillasPorAspa / 2 * tamannoCasillas - tamannoCasillas + inicio, tamannoCasillas);
        dibujarAspaDerecha(g2d, casillasPorAspa / 2 * tamannoCasillas + 35 + inicio, casillasPorAspa / 2 * tamannoCasillas);
        dibujarAspaInferior(g2d, casillasPorAspa / 2 * tamannoCasillas - tamannoCasillas + inicio, casillasPorAspa / 2 * tamannoCasillas + 70);
        dibujarCentro(g2d, casillasPorAspa / 2 * tamannoCasillas - 35 + inicio, casillasPorAspa / 2 * tamannoCasillas);

    }

    public void dibujarCentro(Graphics2D g2d, int x, int y) {
        for (int i = 0; i < 2; i++) {
            int x2 = x;
            for (int j = 0; j < 2; j++) {
                g2d.drawRect(x2, y, tamannoCasillas, tamannoCasillas);
                casillas.add(g2d);
                x2 += tamannoCasillas;
            }
            y += tamannoCasillas;
        }
    }

    public void dibujarAspaIzquierda(Graphics2D g2d, int x, int y) {
        for (int i = 0; i < 2; i++) {
            int x2 = x;
            for (int j = 1; j < casillasPorAspa / 2; j++) {
                g2d.drawRect(x2, y, tamannoCasillas, tamannoCasillas);
                casillas.add(g2d);
                x2 += tamannoCasillas;
            }
            y += tamannoCasillas;

        }
    }

    public void dibujarAspaSuperior(Graphics2D g2d, int x, int y) {
        for (int i = 0; i < 2; i++) {
            int y2 = y;
            for (int j = 1; j < casillasPorAspa / 2; j++) {
                g2d.drawRect(x, y2, tamannoCasillas, tamannoCasillas);
                casillas.add(g2d);
                y2 += tamannoCasillas;
            }
            x += tamannoCasillas;

        }
    }

    public void dibujarAspaDerecha(Graphics2D g2d, int x, int y) {
        for (int i = 0; i < 2; i++) {
            int x2 = x;
            for (int j = 1; j < casillasPorAspa / 2; j++) {
                g2d.drawRect(x2, y, tamannoCasillas, tamannoCasillas);
                casillas.add(g2d);
                x2 += tamannoCasillas;
            }
            y += tamannoCasillas;

        }
    }

    public void dibujarAspaInferior(Graphics2D g2d, int x, int y) {
        for (int i = 0; i < 2; i++) {
            int y2 = y;
            for (int j = 1; j < casillasPorAspa / 2; j++) {
                g2d.drawRect(x, y2, tamannoCasillas, tamannoCasillas);
                casillas.add(g2d);
                y2 += tamannoCasillas;
            }
            x += tamannoCasillas;

        }
    }
}
