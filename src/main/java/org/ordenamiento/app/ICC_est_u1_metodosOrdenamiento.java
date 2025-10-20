package org.ordenamiento.app;

public class ICC_est_u1_metodosOrdenamiento {

    public static void main(String[] args) {
        int[] numeros = {10, 0, -5, 5, 12, 2};

        SortBubble sort = new SortBubble();

        System.out.println("Arreglo original:");
        sort.printArray(numeros);

        // Orden ascendente
        sort.sortBubleAscendente(numeros);
        System.out.println("\nOrden Ascendente:");
        sort.printArray(numeros);

        // Orden Desendente
        sort.sortBubleDesendente(numeros);
        System.out.println("\nOrden Descendente:");
        sort.printArray(numeros);
    }
}