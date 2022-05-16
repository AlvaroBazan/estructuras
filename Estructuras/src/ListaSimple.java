
public class  ListaSimple<T> implements ListaGenerica <T> {

    NodoGenerico<T> inicio=null;
    //longitud va a ser mi contador
    int longitud=0;

    @Override
    public void agregar (T valor) {
        NodoGenerico<T> temp = new NodoGenerico();
        temp.setValor(valor);
        temp.setSig(inicio);
        inicio=temp;
        longitud++;
    }


    public void agregar(T valor, int indice) {
        if (indice<=longitud){//El indice debe ser menor o igual a la longitud
            }if (indice==longitud){//si es exactamente igual , entoces es igual a agregar sin params.
                this.agregar(valor);
            }else{//Este es el caso en el que insertamos elementos.
                NodoGenerico<T> temp2= new NodoGenerico<T>();//este es el puntero de anclaje
                temp2.setValor(valor);
                NodoGenerico<T> temp= new NodoGenerico<T>();//Este es el puntero de recorrido

                for (int i = 0; i < longitud-1-indice; i++) {
                    temp=temp.getSig();

                }
                temp2.setSig(temp.getSig());//Asignamos el puntero del nodo nuevo al siguiente de temp.
                temp.setSig(temp2);
                longitud++;
            }
    }


     public T mirar() {
         if (this.esVacia()) {
             return null;
         }else{
             NodoGenerico<T> temp = inicio;
             while(temp.getSig() != null){
                 temp = temp.getSig();
             }
             return temp.getValor();
         }
     }

     public T mirar (int indice) {
         NodoGenerico<T> temp = new NodoGenerico<T>();

         if (indice > longitud - 1) {
             return null;
         } else {//Si el indice esta en rango y no esta vacia
             for (int i = 0; i < longitud - 1 - indice; i++) {
                 temp = temp.getSig();
             }
            return temp.getValor();
         }

     }

     public T eliminar() {
        return this.eliminar(0);
     }
     public T eliminar(int indice) {

         if(indice<0 || indice>= longitud){// caso en el que indice es mayor o igual que longitud
             return null;
             //indice + saltos = longitud -1
             //saltos= longitud - indice - 1

        }else{//caso Genérico
             //saber los saltos
             NodoGenerico<T> temp2;
             if(indice==longitud-1){//en caso de que estemos quitando la cola
                 temp2=inicio;//fijamos temp2 a inicio
                 inicio=temp2.getSig();//hacemos que inicio salte al siguiente
                 temp2.setSig(null);//cortamos el enlace de la cola con el nodo siguiente

             }else{//Estamos quitando de la cola en adelante
                 NodoGenerico<T> temp = inicio;//puntero de recorrido
                 for (int i = 0; i < longitud-indice-2; i++) {
                     temp=temp.getSig();

                 }
                 temp2=temp.getSig();//asignamos el puntero de anclaje al siguiente de temp.
                 temp.setSig(temp2.getSig());//"cortamos" y reasignamos los nodos


             }
             temp2.setSig(null);//cortamos el enlace de la cola con el nodo siguiente
             longitud--;
             return temp2.getValor();
         }

     }

     public int longitud(){
        return longitud;
     }
     public boolean esVacia() {

        return (longitud>0);
     }
}
