
public class NodoGenerico<T> {
    private T valor;
    private NodoGenerico sig;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public NodoGenerico getSig() {
        return sig;
    }

    public void setSig(NodoGenerico sig) {
        this.sig = sig;
    }
}
