import java.time.LocalDate;

public class HistoricoDia {

    private LocalDate data;
    private int xpGanho;

    public HistoricoDia(LocalDate data, int xpGanho) {
        this.data = data;
        this.xpGanho = xpGanho;
    }

    public LocalDate getData() {
        return data;
    }

    public int getXpGanho() {
        return xpGanho;
    }

    @Override
    public String toString() {
        return data + " → XP: " + xpGanho;
    }
}
