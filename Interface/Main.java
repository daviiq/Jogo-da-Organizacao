import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {

        JFrame janelaPrincipal = new JFrame("Menu Principal");
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setSize(800, 600);
        janelaPrincipal.setLayout(new FlowLayout());

        JButton jogoOrganizacao = new JButton("Jogo da Organização");
        JButton graficoFinaças = new JButton("Gráfico de Finanças");

        // ADICIONAR O BOTÃO NA JANELA
        janelaPrincipal.add(jogoOrganizacao);
        janelaPrincipal.add(graficoFinaças);

        jogoOrganizacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JogoOrganizacao janelaJogo = new JogoOrganizacao();
                janelaJogo.setVisible(true);

                janelaPrincipal.dispose(); // Fecha a janela principal
            }
        });
        janelaPrincipal.setVisible(true);
    }
}