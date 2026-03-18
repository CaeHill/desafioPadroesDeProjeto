import java.util.List;

public class VisualizadorDeSomatorio implements Observer {

    @Override
    public void update(FonteDeDados subject) {
        List<Integer> valores = subject.getValores();
        Integer soma = valores.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Somatorio: " + soma + ", quantidade de elementos analisados: " + valores.size());
    }
}
