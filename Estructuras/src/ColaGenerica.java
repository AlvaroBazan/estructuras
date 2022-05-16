
public class ColaGenerica <T>{
    private NodoGenerico<T> cabeza = null;
    private NodoGenerico<T> cola = null;

    private void meter (T valor){
        NodoGenerico<T> nodo = new NodoGenerico<T>();
        nodo.setValor(valor);
        nodo.setSig(cola);
        cola = nodo;

        if (cabeza == null){
            cabeza = nodo;
        }
    }
    public T mirar(){
        return cabeza.getValor();
    }
    public T eliminar() {
        NodoGenerico<T> temp = cola;
        if (cabeza == null) {
            return null;
        } else if (cola == cabeza) { // cola con un solo elemento
            cola = null;
            cabeza = null;
            return temp.getValor();

        } else {//cola con dos o mas elementos
            while (temp.getSig() != cabeza) {
                temp = temp.getSig();
            }
            cabeza = temp;
            temp = temp.getSig();
            cabeza.setSig(null);
            return temp.getValor();
        }
    }
}
