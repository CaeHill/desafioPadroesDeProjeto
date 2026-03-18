public class App {
    public static void main(String[] args) throws Exception {
        LogSimples log = LogSimples.getInstance();
        log.log("Mensagem de alerta 1 (via App)");
        
        System.out.println("-- Iniciando Servico Auxiliar --");
        ServicoAuxiliar.executar();
        
        log.log("Mensagem de alarme 23 (via App)");
        log.log("Mensagem de PANICO!! (via App)");

        System.out.println("\n-- Imprimindo todos os logs registrados --");
        for(String m:log){
            System.out.println(m);
        }
    }
}
