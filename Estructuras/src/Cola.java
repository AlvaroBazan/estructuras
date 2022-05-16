import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class Cola {

    public static void main(String[] args) {
        Queue<String> animales = new LinkedList<>();
        List<String>coches=new LinkedList<>();


        //Metemos elementos en la cola
        animales.offer("Elefante");
        animales.offer("Hipópotamo");
        animales.offer("Caballo");
        animales.offer("Perro");
        animales.offer("Gato");
        animales.offer("Ratón");

        System.out.println("La cola es = " + animales);

        String cabeza= animales.peek();
        System.out.println("El animal en la cabeza de la cola es: " + cabeza);
        System.out.println("La cola es = " + animales);

        //sacamos el elemento en la cabeza de la cola y lo eliminamos
        cabeza=animales.poll();
        System.out.println("El animal en la cabeza de la cola es: " + cabeza);
        System.out.println("La cola es = " + animales);

        //comprobamos si la cola esta vacia y cuantos elementos tiene
        boolean vacia = animales.isEmpty();
        int tamaño= animales.size();
        System.out.println("La cola esta vacia? = " + vacia);
        System.out.println("Numero de elementos de la cola: "+tamaño);

        //buscar un elemento
        String elemento="Caballo";
        boolean estaElemento= animales.contains(elemento);
        System.out.println("esta el caballo? = " + estaElemento);
    }
}
