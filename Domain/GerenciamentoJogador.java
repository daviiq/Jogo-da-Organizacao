public class GerenciamentoJogador extends Jogador {

    public GerenciamentoJogador(int level, int xpTotal, String nome, int id) {
        super(level, xpTotal, nome,id);
    }

    //adiciona o jogador ao histórico
    public void adcionarJogador(Jogador jogador) {
        Jogador jogador1 = new Jogador(0,0, jogador.getNome(),1);
    }
}
