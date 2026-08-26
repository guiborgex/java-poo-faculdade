import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class TelaSemaforo extends JFrame {
    private final LogicaSemaforo logica = new LogicaSemaforo();
    private final PainelSemaforo painelSemaforo = new PainelSemaforo();
    private final JLabel labelEstado = new JLabel("", SwingConstants.CENTER);

    public TelaSemaforo() {
        setTitle("Semáforo Interativo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());

        labelEstado.setFont(new Font("Arial", Font.BOLD, 20));

        JButton botaoAvancar = new JButton("Avançar");
        botaoAvancar.addActionListener(e -> {
            logica.avancar();
            atualizarTela();
        });

        JPanel painelInferior = new JPanel(new BorderLayout());
        painelInferior.add(labelEstado, BorderLayout.CENTER);
        painelInferior.add(botaoAvancar, BorderLayout.SOUTH);

        add(painelSemaforo, BorderLayout.CENTER);
        add(painelInferior, BorderLayout.SOUTH);

        atualizarTela();
        pack();
        setLocationRelativeTo(null);
    }

    private void atualizarTela() {
        String estado = logica.estadoAtual();
        painelSemaforo.setEstadoAtual(estado);
        labelEstado.setText("Estado atual: " + estado);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaSemaforo tela = new TelaSemaforo();
            tela.setVisible(true);
        });
    }
}
