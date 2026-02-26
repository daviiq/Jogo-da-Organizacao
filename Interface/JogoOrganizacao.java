import java.awt.*;
import javax.swing.*;

public class JogoOrganizacao extends JFrame {

    public JogoOrganizacao() {
        super("Jogo da Organização");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new FlowLayout());

        JLabel texto = new JLabel("Bem-vindo ao Jogo da Organização!");
        add(texto);
    }
}