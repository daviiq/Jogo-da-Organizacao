import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class JogoOrganizacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HistoricoService historico;

        //Definição da Janela do Jogo:
        JFrame janelaJogo = new JFrame("Bem Vindo ao Jogo da Evolução");
        janelaJogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Tamanho da tela
        janelaJogo.setSize(1920, 1080);

        //Layout da tela:
        janelaJogo.setLayout(new FlowLayout());

        //Deixa ela visivel:
        janelaJogo.setVisible(true);

        System.out.println("digite o seu nome: ");
        String resposta = scanner.nextLine();
    }
}
