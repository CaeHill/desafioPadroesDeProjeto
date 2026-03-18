public class LogNivelDecorator extends LogDecorator {
    private String nivel;

    public LogNivelDecorator(ILog wrappee, String nivel) {
        super(wrappee);
        this.nivel = nivel;
    }

    @Override
    public void log(String m) {
        super.log(nivel + " " + m);
    }
}
