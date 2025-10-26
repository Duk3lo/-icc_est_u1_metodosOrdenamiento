package org.ordenamiento.app;

public class ICC_est_u1_metodosOrdenamiento {

    public static void main(String[] args) {
        int[] numeros = {10, 0, -5, 5, 12, 2};

        SortBubble claseSortBubble = new SortBubble();

        /* printArray(nuemros);
        sortBubble(nuemros);
        System.out.println("Ordenado");
        printArray(nuemros);  */
        //Creo laclase SortBubble
        //Crear la clase == Instanciar la clase
        
        //claseSortBubble.sortBubble(nuemros);
        //claseSortBubble.printArray(nuemros);

        //claseSortBubble.sortBubbleAvz(numeros);
        //Original
        System.out.println("Original: ");
        claseSortBubble.printArray(numeros);

        //Asendente
        SortSelection selection = new SortSelection();
        System.out.println("Asendente:");
        selection.sortAscendente(numeros);
        claseSortBubble.printArray(numeros);

        //Desendente
        System.out.println("Desendente: ");
        selection.sortDescendente(numeros);
        claseSortBubble.printArray(numeros);

        Inserction inserction = new Inserction();

        int[] arre = new int[]{10, 0, -5, 5, 12, 2};
        System.out.println("\nInserction de numeos");
        inserction.insertionNumber(arre, false);
        claseSortBubble.printArray(arre);

        System.out.println("");
        Persona[] personas = new Persona[]{
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28)
        };

        System.out.println("Array original:");
        inserction.printArrayPersonas(personas);

        inserction.sortByPersonaNombre(personas);
        System.out.println("\nArray ordenado por nombre:");
        inserction.printArrayPersonas(personas);

        inserction.sortByPersonaEdad(personas);
        System.out.println("\nArray ordenado por edad:");
        inserction.printArrayPersonas(personas);

    }
}
