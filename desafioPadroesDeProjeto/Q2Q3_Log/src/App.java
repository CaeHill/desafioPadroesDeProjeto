public class App {
    public static void main(String[] args) throws Exception {
        // Base unificada
        LogSimples logBase = LogSimples.getInstance();

        // Log puro (sem decoradores)
        logBase.log("Mensagem de alerta 1 (via App puramente)");

        System.out.println("-- Iniciando Servico Auxiliar --");
        ServicoAuxiliar.executar();

        // Embalando com Nivel 1
        ILog logNivel1 = new LogNivelDecorator(logBase, "NIVEL 1");
        logNivel1.log("Mensagem de alarme 23");

        // Embalando com Nivel 2 + Colchetes + Maiúsculas
        ILog logCritico = new LogNivelDecorator(
                new LogColchetesDecorator(
                        new LogMaiusculasDecorator(logBase)),
                "NIVEL 2");
        logCritico.log("Mensagem de panico!!");

        System.out.println("\n-- Imprimindo todos os logs registrados no Singleton --");
        for (String m : logBase) {
            System.out.println(m);
        }
    }
}
