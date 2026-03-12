import javax.swing.*;
import java.awt.*;

public class BarraDeProgresso extends JPanel{
    //Cria a barra de progresso
    JProgressBar barra = new JProgressBar();

    public BarraDeProgresso() {
        setLayout(new BorderLayout());

        barra.setStringPainted(true);
        barra.setValue(0);
        barra.setMaximum(1000);
        barra.setForeground(Color.GREEN);
        add(barra, BorderLayout.CENTER);
    }

    //Atualiza a barra a partir do XP
    public void atualizarBarra(int xpAtual, int xpMax) {
        barra.setMaximum(xpMax);
        barra.setValue(xpAtual);
        barra.setString(xpAtual + " / " + xpMax + " XP");
    }
    public JProgressBar getBarra() {
        return barra;
    }
}
