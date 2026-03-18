public class LogColchetesDecorator extends LogDecorator {
    public LogColchetesDecorator(ILog wrappee) {
        super(wrappee);
    }

    @Override
    public void log(String m) {
        super.log("[" + m + "]");
    }
}
