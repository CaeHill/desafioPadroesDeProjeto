public class LogMaiusculasDecorator extends LogDecorator {
    public LogMaiusculasDecorator(ILog wrappee) {
        super(wrappee);
    }

    @Override
    public void log(String m) {
        super.log(m.toUpperCase());
    }
}
