public class MiPila {
    private Nodo cabeza= null;

    public void meter(String valor){
        Nodo nodo=new Nodo();
        nodo.setValor(valor);
        nodo.setNext(cabeza);
        cabeza=nodo;

    }
    public String mirar(){
        return cabeza.getValor();
    }
    public String eliminar(){
        Nodo temp=cabeza;
        cabeza=cabeza.getNext();
        return temp.getValor();

}
    public int tamaño(){
    int contador =0;
    Nodo temp =cabeza;
    while (temp != null){
        temp=temp.getNext();
        contador++;
    }
    return contador;
    }

    public  String toString(){
        String cadena ="[";
        Nodo temp = cabeza;
        while (temp!=null){
            cadena+=temp.getValor()+" ";
            temp=temp.getNext();
            if(temp!=null){
                cadena+=", ";
            }
        }
        cadena+="]";
        return cadena;
    }
    public boolean estaVacio(){
        return (cabeza==null);
    }
    public int encontrar(String cadena){
        Nodo temp=cabeza;
        int contador=0;
        while(temp!=null){
            String valorTemp= temp.getValor();
            if(valorTemp.compareTo(cadena)==0){
                return this.tamaño()-contador;
            }
            contador++;
            temp=temp.getNext();
        }
        return -1;
    }
}
