import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PainelSemaforo extends JPanel {
    private String estadoAtual = "VERMELHO";

    public PainelSemaforo() {
        setPreferredSize(new Dimension(220, 430));
        setBackground(new Color(35, 35, 35));
    }

    public void setEstadoAtual(String estadoAtual) {
        this.estadoAtual = estadoAtual;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        desenharLuz(g, 60, 35, "VERMELHO", Color.RED);
        desenharLuz(g, 60, 155, "AMARELO", Color.YELLOW);
        desenharLuz(g, 60, 275, "VERDE", Color.GREEN);
    }

    private void desenharLuz(Graphics g, int x, int y, String estado, Color corAcesa) {
        if (estado.equals(estadoAtual)) {
            g.setColor(corAcesa);
        } else {
            g.setColor(Color.GRAY);
        }

        g.fillOval(x, y, 100, 100);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, 100, 100);
    }
}
