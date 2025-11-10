package org.ordenamiento.app;

public class ICC_est_u1_metodosOrdenamiento {

    private static final String STUDENT_NAME = "Pablo Torres";

    public static void main(String[] args) {
        Inserction insercion = new Inserction();

        // --- 1) Arreglo de enteros (tal como pide la práctica) ---
        int[] numerosOriginal = {10, 0, -5, 5, 15, 2};

        System.out.println("Estudiante: " + STUDENT_NAME);
        System.out.println("Método Inserción");
        System.out.println("Original");
        insercion.printArray(numerosOriginal);

        // Ordenado Ascendente
        int[] copiaAsc = insercion.copyIntArray(numerosOriginal);
        insercion.insertionNumber(copiaAsc, false); // pasos = false
        System.out.println("Ordenado Ascendente");
        insercion.printArray(copiaAsc);

        // Ordenado Descendente (hacemos la inversa del ascendente)
        int[] copiaDesc = insercion.copyIntArray(copiaAsc);
        insercion.reverseIntArray(copiaDesc);
        System.out.println("Ordenado Descendente");
        insercion.printArray(copiaDesc);

        System.out.println("\n----------------------------------------\n");

        // --- 2) Arreglo de cadenas ---
        System.out.println("Estudiante: " + STUDENT_NAME);
        String[] nombres = {"Pedro", "Ana", "Maria", "Luis", "Juan"};
        System.out.println("Array de Nombres Original:");
        insercion.printArrayStrings(nombres);

        String[] nombresCopia = insercion.copyStringArray(nombres);
        insercion.sortByName(nombresCopia, false); // pasos = false
        System.out.println("Ordenado por Nombre:");
        insercion.printArrayStrings(nombresCopia);

        System.out.println("\n----------------------------------------\n");

        // --- 3) Arreglo de personas ordenado por nombre ---
        System.out.println("Estudiante: " + STUDENT_NAME);
        Persona[] personas = new Persona[]{
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28)
        };

        System.out.println("Array de Personas Original:");
        insercion.printPersonasLines(personas);

        Persona[] personasPorNombre = insercion.copyPersonaArray(personas);
        insercion.sortByPersonaNombre(personasPorNombre);
        System.out.println("\nOrdenado por Nombres de Personas:");
        insercion.printPersonasLines(personasPorNombre);

        System.out.println("\n----------------------------------------\n");

        // --- 4) Arreglo de personas ordenado por edad ---
        System.out.println("Estudiante: " + STUDENT_NAME);
        System.out.println("Array de Personas Original:");
        insercion.printPersonasLines(personas);

        Persona[] personasPorEdad = insercion.copyPersonaArray(personas);
        insercion.sortByPersonaEdad(personasPorEdad);
        System.out.println("\nOrdenado por EDAD de Personas:");
        insercion.printPersonasLines(personasPorEdad);
    }
}
