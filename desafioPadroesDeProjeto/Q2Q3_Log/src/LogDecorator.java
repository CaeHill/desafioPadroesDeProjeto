public abstract class LogDecorator implements ILog {
    protected ILog wrappee;

    public LogDecorator(ILog wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void log(String m) {
        wrappee.log(m);
    }
}
