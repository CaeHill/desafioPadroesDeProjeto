import java.util.List;
import java.util.OptionalInt;

public class VisualizadorDeMenorValor implements Observer {

    @Override
    public void update(FonteDeDados subject) {
        List<Integer> valores = subject.getValores();
        OptionalInt menor = valores.stream()
            .mapToInt(Integer::intValue)
            .min();
        
        if (menor.isPresent()) {
            System.out.println("Menor valor: " + menor.getAsInt() + ", quantidade de elementos analisados: " + valores.size());
        } else {
            System.out.println("Menor valor: (sem elementos)");
        }
    }
}
