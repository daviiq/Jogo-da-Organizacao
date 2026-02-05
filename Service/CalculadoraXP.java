import java.util.EnumSet;

public class CalculadoraXP {

    public int calcularXP(EnumSet<Habito> habitosDoDia) {
        return habitosDoDia
                .stream() //Cria fluxo de hábitos
                .mapToInt(Habito::getXp) // Aqui está dizendo que para cada hábito, irá pegar o seu XP
                .sum(); // Soma

    }
}