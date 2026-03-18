import java.util.ArrayList;
import java.util.List;

public class ListaDadosRolados extends DecoratorDado {
    private List<Integer> historico;

    public ListaDadosRolados(InterfaceDado dado) {
        super(dado);
        this.historico = new ArrayList<>();
    }

    @Override
    public void rolar() {
        super.rolar();
        historico.add(super.getValor());
    }

    public List<Integer> getHistorico() {
        return historico;
    }
}
