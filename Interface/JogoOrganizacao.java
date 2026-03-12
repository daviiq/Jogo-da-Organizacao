import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JogoOrganizacao extends JFrame {
    private Jogador jogador;
    private BarraDeProgresso barraXP;


    public JogoOrganizacao() {
        super("Jogo da Organização");

        //Instâncias
        jogador = new Jogador(1,0,"Jogador");
        setLayout(new BorderLayout());
        JFrame frame = new JFrame("Jogo da Organização");

        // 1. Nomes das colunas (String[])
        String[] colunas = {"Atividade", "Dia da Semana", "Realizado?"};
        DefaultTableModel modelo = new DefaultTableModel(colunas,7); //Cria uma tabela padrão;

        // 2. Criação da JTable
        JTable tabela = new JTable(modelo);

        /*
         * Sistema de recompensa por hábitos:
         * Sempre que o usuário marcar um hábito como realizado,
         * o sistema identifica qual hábito foi selecionado,
         * obtém o XP correspondente do ENUM Habito
         * e adiciona esse valor ao jogador, atualizando a barra de progresso.
         */

        //Pega o evento da tabela sempre que algum valor for alterado
        modelo.addTableModelListener(e -> {

            //Pega a coluna e linha que foi alterada
            int coluna = e.getColumn();
            int linha = e.getFirstRow();

            //Se a coluna alterada for a 2, pega o valor atual da célula alterada
            if (coluna == 2 ) {
                Object valor = modelo.getValueAt(linha,coluna);

                //Se o valor Boolean for true, então o usuário fez
                if (valor instanceof Boolean && (Boolean) valor) {

                    //Usando o ComboBox, para buscar o hábito na coluna de Atividade
                    Habito habitoSelecionado = (Habito) modelo.getValueAt(linha,0);

                    //Se ele for diferente de null
                    if (habitoSelecionado != null) {
                        int xp = habitoSelecionado.getXp();

                        jogador.adicionarXp(xp);

                        barraXP.atualizarBarra(
                                jogador.getXpTotal(),
                                jogador.xpParaProximoLevel()
                        );
                    }
                }
            }
        });

        // ======================
        // BARRA DE XP
        // ======================

        barraXP = new BarraDeProgresso();
        barraXP.atualizarBarra(
                jogador.getXpTotal(),
                jogador.xpParaProximoLevel()
        );


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

        //Cria a barra de progesso na parte debaixo da página:
        add(barraXP,BorderLayout.SOUTH);

        //Especificações da página
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fecha quando clica no X
        setLocationRelativeTo(null); //Como não foi passado nenhum parametro, então centraliza
        setVisible(true);
    }
}