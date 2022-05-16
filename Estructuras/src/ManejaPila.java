public class ManejaPila {
    public static void main(String[] args) {
        MiPila pilaEspañola =new MiPila();
        pilaEspañola.meter("Pepe");
        pilaEspañola.meter("Maria Jose");

        int tamaño= pilaEspañola.tamaño();
        System.out.println(pilaEspañola);

        String salida= pilaEspañola.mirar();
        System.out.println("salida = " + salida);

        pilaEspañola.eliminar();
        salida= pilaEspañola.mirar();
        System.out.println("salida = " + salida);

        tamaño= pilaEspañola.tamaño();
        System.out.println("tamaño = " + tamaño);

    }
}
