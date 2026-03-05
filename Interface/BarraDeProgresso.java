import javax.swing.*;
import java.awt.*;

public class BarraDeProgresso extends JFrame{
    //Cria a barra de progresso
    JProgressBar barra = new JProgressBar();

    public BarraDeProgresso() {
        barra.setBounds(40, 40, 50, 50);
        barra.setStringPainted(true);
        barra.setValue(0);
        barra.setMaximum(500);
        barra.setForeground(Color.GREEN);
        add(barra);
    }

    public JProgressBar getBarra() {
        return barra;
    }
}
