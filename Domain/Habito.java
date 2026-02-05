public enum Habito {

    ACADEMIA(150),
    ESTUDAR(300),
    ORAR(500),
    JOGAR(50),
    LIMPAR_CASA(200),
    HABITOS_RUINS(-300),
    ESTUDO_INCORRETO(-200);

    //Cria o XP para cada habito
    private int xp;
    Habito(int xp) {this.xp = xp;}

    //Pega o XP
    public int getXp() {return this.xp;}
}