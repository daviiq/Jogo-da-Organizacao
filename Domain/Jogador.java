import javax.swing.*;

public class Jogador {

    //Caracteristicas do Jogador
    private int level = 1;
    private int xpTotal = 0;
    private String nome;
    private int id;

    //Constructor:
    public Jogador(int level, int xpTotal, String nome, int id) {
        this.level = level;
        this.xpTotal = xpTotal;
        this.nome = nome;
        this.id = id;
    }

    //Pega o nome do jogador:
    public String getNome() {
        return nome;
    }

    //Adiciona o XP:
    public void adicionarXp(int xp){
        this.xpTotal += xp;
        verificarLevelUp();
    }

    //Level UP com While para conseguir pular mais de um Nível
    public void verificarLevelUp() {
        while (xpTotal >= level * 1000) {
            level++;

            JOptionPane.showMessageDialog(
                    null,
                    "Level UP! Nível atual: " + level, "Parabéns",
                    JOptionPane.INFORMATION_MESSAGE
            );
            System.out.println("LEVEL UP ! Nível atual é: " + level);
        }
    }

    //Cria o aumento do limite para o Próximo Level
    public int xpParaProximoLevel() {
        return 1000 + (level - 1 ) * 700;
    }

    public int getLevel() {return level;}
    public int getXpTotal() {return xpTotal;}
}
