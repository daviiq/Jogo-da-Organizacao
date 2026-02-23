import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HistoricoService {

    private List<HistoricoDia> historico = new ArrayList<>();
    private List<Jogador> historicoJogadores = new ArrayList<>();

    //adiciona o jogador ao histórico
    public void adcionarJogador(Jogador jogador) {
        Jogador jogador1 = new Jogador(0,0, jogador.getNome());
        historicoJogadores.add(jogador1);
    }


    //Salva o que foi feito no dia:
    public void salvarDia(int xpGanho) {
        HistoricoDia dia = new HistoricoDia(LocalDate.now(), xpGanho);
        historico.add(dia);
    }

    //Pega o histórico:
    public List<HistoricoDia> getHistorico() {
        return historico;
    }

    //Calcula o XP Total baseado no histórico:
    public int calcularXpTotal() {
        int total = 0;
        for (HistoricoDia dia : historico) {
            total += dia.getXpGanho();
        }
        return total;
    }
}
