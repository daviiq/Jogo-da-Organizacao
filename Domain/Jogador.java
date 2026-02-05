public class Jogador {

    //Caracteristicas do Jogador
    private int Level = 1;
    private int xpTotal = 0;

    //Adiciona o XP:
    public void adicionarXp(int xp){
        this.xpTotal += xp;
        verificarLevelUp();
    }

    //Level UP com While para conseguir pular mais de um Nível
    public void verificarLevelUp() {
        while (xpTotal >= Level * 1000) {
            Level++;
            System.out.println("LEVEL UP ! Nível atual é: " + Level);
        }
    }

    //Cria o aumnto do limite para o Próximo Level
    public int xpParaProximoLevel() {
        return 500 + (leve - 1 ) * 700
    }

    public int getLevel() {return Level;}
    public int getXpTotal() {return xpTotal;}

}