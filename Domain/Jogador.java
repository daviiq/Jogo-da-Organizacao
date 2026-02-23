public class Jogador {

    //Caracteristicas do Jogador
    private int level = 1;
    private int xpTotal = 0;
    private String nome;

    //Constructor:
    public Jogador(int level, int xpTotal, String nome) {
        this.level = level;
        this.xpTotal = xpTotal;
        this.nome = nome;
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
            System.out.println("LEVEL UP ! Nível atual é: " + level);
        }
    }

    //Cria o aumnto do limite para o Próximo Level
    public int xpParaProximoLevel() {
        return 500 + (level - 1 ) * 700;
    }

    public int getLevel() {return level;}
    public int getXpTotal() {return xpTotal;}

}
