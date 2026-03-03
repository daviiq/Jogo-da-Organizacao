import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JogoOrganizacao extends JFrame {

    public JogoOrganizacao() {
        super("Jogo da Organização");
        
        JFrame frame = new JFrame("Jogo da Organização");

        // 1. Nomes das colunas (String[])
        String[] colunas = {"Atividade", "Dia da Semana", "Realizado?"};
        DefaultTableModel modelo = new DefaultTableModel(colunas,0); //Cria uma tabela padrão;

        // 2. Criação da JTable
        JTable tabela = new JTable(modelo);

        //3. Criação das Colunas apartir de ComboBox para puxar as ENUMs
        /*O comboBox é uma caixa de seleção e permite selecionar várias opções a partir de uma lista
        Isso combina muito com o ENUM, pois ele já é uma Enumeração de coisas.*/

        //ComboBox para Hábitos
        JComboBox<Habito> comboHabito = new JComboBox<>(Habito.values()); //Só aceita objetos de Hábito e retorna apenas os valores do ENUM;
        tabela.getColumnModel() //Pega o controlador das colunas;
                .getColumn(0) //Pega o índice 0 da coluna
                .setCellEditor(new DefaultCellEditor(comboHabito)); //Ao editar esta coluna, usa-se o ComboBox como editor dela

        //ComboBOx para Dias da Semana
        JComboBox<DiaSemana> comboDia = new JComboBox<>(DiaSemana.values());
        tabela.getColumnModel()
                .getColumn(1)
                .setCellEditor(new DefaultCellEditor(comboDia));

        //Checkbox para marcar se foi realizado ou não
        tabela.getColumnModel()
                .getColumn(2)
                .setCellEditor(new DefaultCellEditor(new JCheckBox()));

        //Cria a tabela no centro
        add(new JScrollPane(tabela), BorderLayout.CENTER);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fecha quando clica no X
        setLocationRelativeTo(null); //Como não foi passado nenhum parametro, então centraliza
        setVisible(true);
    }
}