import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {

        /* Molde para cria a página

        Tela inicial
        JFrame janelaPrincipal = new JFrame();
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Tamanho da tela
        janelaPrincipal.setSize(500,600);

        //Adicionando botões:
        JButton botaoSwing = new JButton("Botão Swing");
        janelaPrincipal.add(botaoSwing);

        //Adicionando Listener para capturar os eventos do botão Swing
        botaoSwing.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão Swing pressionado");
            }
        });
        janelaPrincipal.setVisible(true);}*/


        //Tela inicial
        JFrame janelaPrincipal = new JFrame("Bem Vindo ao Jogo da Evolução");
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Tamanho da tela
        janelaPrincipal.setSize(1920,1080);

        //Layout da tela:
        janelaPrincipal.setLayout(new FlowLayout());

        janelaPrincipal.add(new JButton("Jogo Organização"));
        janelaPrincipal.add(new JButton("Gráfico das finanças"));
        janelaPrincipal.add(new JButton("Futuras implementações..."));

        janelaPrincipal.setVisible(true);
    }
}
