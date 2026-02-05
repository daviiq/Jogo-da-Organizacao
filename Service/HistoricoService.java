import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HistoricoService {

    private List<HistoricoDia> historico = new ArrayList<>();

    public void salvarDia(int xpGanho) {
        HistoricoDia dia = new HistoricoDia(LocalDate.now(), xpGanho);
        historico.add(dia);
    }

    public List<HistoricoDia> getHistorico() {
        return historico;
    }

    public int calcularXpTotal() {
        int total = 0;
        for (HistoricoDia dia : historico) {
            total += dia.getXpGanho();
        }
        return total;
    }
}
