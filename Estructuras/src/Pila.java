import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Pila {

    /**
     * COLA
     *
     * LIFO (Last In First Out)
     * El ultimo que entra es el primero en salir
     *
     */
    public static void main(String[] args) {
        //Es una clase que coge el elemento que tu le das y aplica lo que sea sobre el.
        //Lo primero que podemos hacer es puss
        Stack<String>animales = new Stack<>();

        //Metemos animales en la pila con push
        animales.push("Elefante");
        animales.push("Hipopótamo");
        animales.push("Caballo");
        animales.push("Perro");
        animales.push("Gato");
        animales.push("Ratón");

        System.out.println("La pila es: "+animales);

        //muestra la cabeza de la pila
        String animal= animales.peek();
        System.out.println("La cabeza de la pila es: "+animal);
        System.out.println("La pila es: "+animales);

        //pop lo saca de la pila y lo elimina de la pila
        animal = animales.pop();
        System.out.println("Hemos sacado: "+animal);
        System.out.println("La pila es: "+animales);

        //El metodo empty devuelve true si esta llena y false si esta vacia
        boolean vacia = animales.empty();
        System.out.println("¿Está vacia?: " +vacia);

        //Conocer la posicion del string en la pila (Spoiler: Es el último)
        int posicion=animales.search("Elefante");
        System.out.println("El elefante está en la posición: "+posicion);

        }
       }


