public abstract class DecoratorDado implements InterfaceDado {
    protected InterfaceDado dado;

    public DecoratorDado(InterfaceDado dado) {
        this.dado = dado;
    }

    @Override
    public void rolar() {
        dado.rolar();
    }

    @Override
    public int getValor() {
        return dado.getValor();
    }
}
