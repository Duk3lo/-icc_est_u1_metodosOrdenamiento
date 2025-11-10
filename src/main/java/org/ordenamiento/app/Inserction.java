package org.ordenamiento.app;

public class Inserction {

    // Inserción para números (ascendente)
    public void insertionNumber(int[] numeros, boolean pasos) {
        for (int i = 1; i < numeros.length; i++) {
            int aux = numeros[i];
            int j = i - 1;
            while (j >= 0 && aux < numeros[j]) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = aux;
        }
    }

    // Copias y utilidades
    public int[] copyIntArray(int[] origen) {
        int[] dest = new int[origen.length];
        System.arraycopy(origen, 0, dest, 0, origen.length);
        return dest;
    }

    public void reverseIntArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++; j--;
        }
    }

    public String[] copyStringArray(String[] origen) {
        String[] dest = new String[origen.length];
        System.arraycopy(origen, 0, dest, 0, origen.length);
        return dest;
    }

    public Persona[] copyPersonaArray(Persona[] origen) {
        Persona[] dest = new Persona[origen.length];
        System.arraycopy(origen, 0, dest, 0, origen.length);
        return dest;
    }

    // Inserción para Strings (alfabético ascendente)
    public void sortByName(String[] nombres, boolean pasos) {
        for (int i = 1; i < nombres.length; i++) {
            String aux = nombres[i];
            int j = i - 1;
            while (j >= 0 && nombres[j].compareToIgnoreCase(aux) > 0) {
                nombres[j + 1] = nombres[j];
                j--;
            }
            nombres[j + 1] = aux;
        }
    }

    // Personas por nombre (ascendente)
    public void sortByPersonaNombre(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona aux = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getName().compareToIgnoreCase(aux.getName()) > 0) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    }

    // Personas por edad (ascendente)
    public void sortByPersonaEdad(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona aux = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getAge() > aux.getAge()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    }

    // Impresiones (salida limpia)
    public void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public void printArrayStrings(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Imprime personas línea por línea (formato para las capturas)
    public void printPersonasLines(Persona[] personas) {
        for (Persona p : personas) {
            System.out.println("Nombre: " + p.getName() + ", Edad: " + p.getAge());
        }
    }

    // Mantengo el método original si se necesita
    public void printArrayPersonas(Persona[] personas) {
        System.out.print("[");
        for (int i = 0; i < personas.length; i++) {
            Persona p = personas[i];
            System.out.print(p.getName() + " (" + p.getAge() + ")");
            if (i < personas.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
