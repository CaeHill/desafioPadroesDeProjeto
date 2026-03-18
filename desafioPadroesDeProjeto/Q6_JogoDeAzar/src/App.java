public class App {
    public static void main(String[] args) {
        InterfaceDado d6 = new Dado(6);
        ListaDadosRolados d20 = new ListaDadosRolados(new Dado(20));

        System.out.println("--- D6 Normal ---");
        d6.rolar();
        System.out.println("D6 Valor: " + d6.getValor());

        System.out.println("\n--- Lançando D20 com Histórico ---");
        d20.rolar();
        d20.rolar();
        d20.rolar();
        d20.rolar();

        System.out.println("D20 ultimo: " + d20.getValor());
        System.out.println("D20 jogados: " + d20.getHistorico());
    }
}
