import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Historico{

    //Cria a Lista dos hábitos com os dias da semana
    private Map<LocalDate, Enum<Habito>> dias = new HashMap<>();

    public void registrarDia(LocalDate data, EnumSet<Habito> habitos) {
        dias.put(data, habitos);
    }

    public EnumSet<Habito> getHabitosDoDia(LocalDate data){
        return dias.getOrDefault(data, EnumSet,noneOf(Habito.class));
    }
}