import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CalculadoraXP {

    public int calcularXP(EnumSet<Habito> habitosDoDia) {
        return habitosDoDia
        .stream()
        .mapToInt(Habito::getXp())
        .sum();
    }
}