public enum Habito {

    ACADEMIA(150),
    ESTUDAR(300),
    ORAR(500),
    JOGAR(50),
    LIMPAR_CASA(200),
    HABITOS_RUINS(-300),
    ESTUDO_INCORRETO(-200);

    private final int xp;

    habito(int xp ) {this.xp = xp;}

    public int getXp() {return xp;}
}