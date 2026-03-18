import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var cm = new VisualizadorDeMedia();
        var cs = new VisualizadorDeSomatorio();
        var cv = new VisualizadorDeMenorValor();

        boolean csAtivo = false;
        boolean cmAtivo = false;
        boolean cvAtivo = false;

        Scanner s = new Scanner(System.in);
        int valor = 0;
        while(true){
            System.out.println("\nEstado atual: Somatorio("+(csAtivo?"ON":"OFF")+"), Media("+(cmAtivo?"ON":"OFF")+"), MenorValor("+(cvAtivo?"ON":"OFF")+")");
            System.out.println("Opcoes:");
            System.out.println("-1 = ligar/desligar visualizador de somatorio");
            System.out.println("-2 = ligar/desligar visualizador de media");
            System.out.println("-3 = ligar/desligar visualizador de menor valor");
            System.out.println("Ou entre com um valor positivo maior que zero para compor os dados (0=fim):");
            
            valor = Integer.parseInt(s.nextLine());
            
            if (valor == 0){
                break;
            } else if (valor == -1) {
                csAtivo = !csAtivo;
                if(csAtivo) dados.addObserver(cs);
                else dados.removeObserver(cs);
            } else if (valor == -2) {
                cmAtivo = !cmAtivo;
                if(cmAtivo) dados.addObserver(cm);
                else dados.removeObserver(cm);
            } else if (valor == -3) {
                cvAtivo = !cvAtivo;
                if(cvAtivo) dados.addObserver(cv);
                else dados.removeObserver(cv);
            } else if (valor > 0) {
                dados.add(valor); // Isso automaticamente notifica os visualizadores ativos
            } else {
                System.out.println("Valor invalido");
            }
        }
        System.out.println("Fim");
    }
}
