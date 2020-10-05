package draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import objetosNegocio.Camino;
import objetosNegocio.Jugador;

public class DibujarFicha {
    private int horizontal, vertical, current, height, width, x, y;
    
    public DibujarFicha(int height, int width) {
        current = -1;
        horizontal = -1;
        vertical = -1;
        x = -1;
        y = -1;
        this.height = height;
        this.width = width;
    }

    public void draw(Graphics2D g, int i, int j, Jugador jugador) {

        if (current == -1) {
            int temp1 = 80 + (height / 2), temp2 = 50 + (width / 2);
            horizontal = i;
            vertical = j;
            x = temp1 + 5 + (i * width);
            y = temp2 + 5 + (j * height);
            g.setColor(jugador.getColor());
            g.fillOval(x, y, width - 10, height - 10);
            g.setStroke(new BasicStroke(2));
            g.setColor(Color.BLACK);
            g.drawOval(x, y, width - 10, height - 10);
        } else {
            int temp1 = 80, temp2 = 50;
            horizontal = Camino.ax[0][current];
            vertical = Camino.ay[0][current];
            x = temp1 + 5 + (horizontal * width);
            y = temp2 + 5 + (vertical * height);
            g.setColor(jugador.getColor());
        }
        g.fillOval(x, y, width - 10, height - 10);
        g.setStroke(new BasicStroke(2));
        g.setColor(Color.BLACK);
        g.drawOval(x, y, width - 10, height - 10);
    }
}
