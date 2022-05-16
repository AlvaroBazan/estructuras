import java.util.ArrayList;

// lista enlazada una sola direccion
//lista doblemente enlazada puede ir para alante y para atras
public class Lista {
    public static void main(String[] args) {
        ArrayList <String> animales = new ArrayList<>();
        
        //añadimos los animales al arraylist
        animales.add("Elefante");
        animales.add("Hipópotamo");
        animales.add("Caballo");
        animales.add("Perro");
        animales.add("Gato");
        animales.add("Ratón");

        System.out.println("animales = " + animales);

        //como coger un elemento
        String  animalitos =animales.get(1);
        System.out.println("animalitos = " + animalitos);

        for (String a:animales) {
            System.out.println("a = " + a);

        }

        //eliminar el ultimo de la lista del arraylist en otra variable
        //pero podrias quitarla de la principal con:
        // animales.remove(animales.sice()-1)
        String eliminados=animales.remove(animales.size()-1);
        System.out.println("eliminados = " + eliminados);
        System.out.println("animales = " + animales);

        //insertar un dato en el arraylist en una posicion
        animales.add(2,"Alce");
        System.out.println("animales = " + animales);
        
        //Para ordenar el sort
        
        // podemos utilizar el contain
        boolean estaAlce = animales.contains("Alce");
        System.out.println("estaAlce = " + estaAlce);

        String pepe="Alce";
        estaAlce=animales.contains(pepe);
        System.out.println("estaAlce = " + estaAlce);

        //Comprobor en que posicion está el elemento
        int indice=animales.indexOf("Perro");
        System.out.println("En que posicion esta el perro? = " + indice);
        
        // si no esta devuelve el -1
        indice=animales.indexOf("Raton");
        System.out.println("En que posicion esta el gato? = " + indice);
        
        //Saber si una lista es vacia
        boolean esVacia=animales.isEmpty();
        System.out.println("esVacia = " + esVacia);
    }
}
