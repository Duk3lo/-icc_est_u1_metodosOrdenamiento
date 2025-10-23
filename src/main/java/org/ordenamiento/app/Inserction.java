package org.ordenamiento.app;

public class Inserction {

    public void insertionNumber(int[] numeros, boolean pasos) {
        for (int i = 1; i < numeros.length; i++) {
            int aux = numeros[i];
            int j = i - 1;
            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }
            while (j >= 0 && aux < numeros[j]) {
                if (pasos) {
                    System.out.println("Compara con aux: " + aux + " con numeros[ " + j + " ]: " + numeros[j]);
                }

                numeros[j + 1] = numeros[j];
                if (pasos) {
                    printArray(numeros);
                }
                j--;
                if (pasos) {
                    System.out.println("Mueve numeros [" + (j + 1) + "] a numeros [" + (j + 2) + "]");
                }
            }
            numeros[j + 1] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posicion: " + (j + 1));
                System.out.println("");
                printArray(numeros);
            }
        }
    }

    public void sortByName(String[] nombres, boolean pasos) {
        for (int i = 1; i < nombres.length; i++) {
            String aux = nombres[i];
            int j = i - 1;

            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }

            // Ordenar alfabéticamente (ascendente)
            while (j >= 0 && nombres[j].compareToIgnoreCase(aux) > 0) {
                if (pasos) {
                    System.out.println("Compara aux: \"" + aux + "\" con nombres[" + j + "]: \"" + nombres[j] + "\"");
                }

                nombres[j + 1] = nombres[j];
                if (pasos) {
                    printArray(nombres);
                }

                j--;

                if (pasos && j >= 0) {
                    System.out.println("Mueve nombres[" + (j + 1) + "] a nombres[" + (j + 2) + "]");
                }
            }

            nombres[j + 1] = aux;

            if (pasos) {
                System.out.println("Inserta \"" + aux + "\" en la posición " + (j + 1));
                System.out.println();
                printArray(nombres);
            }
        }
    }

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

    public void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public <T> void printArray(T... elementos) {
        System.out.print("[");
        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i]);
            if (i < elementos.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void printArrayPersonas(Persona[] personas) {
        System.out.print("[");
        for (int i = 0; i < personas.length; i++) {
            Persona p = personas[i];
            System.out.print(p.getName() + " (" + p.getAge() + ")");
            if (i < personas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
