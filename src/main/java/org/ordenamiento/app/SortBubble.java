package org.ordenamiento.app;

public class SortBubble {


    //Constructor
    public SortBubble() {
        System.out.println("Se creo mi clase SorBubble");
    }

    public void sortBubble(int[] numeros) {
        int nuemrosSize = numeros.length;
        int numeoCambios = 0;
        int preguntaCondicion = 0;
        // 10, 0, -5, 5, 15, 2
        for (int i = 0; i < nuemrosSize; i++) {
            for (int j = i + 1; j < nuemrosSize; j++) {
                preguntaCondicion++;
                //System.out.println("Pregunto " + preguntaCondicion);
                if (numeros[i] > numeros[j]) { //Si se cumple hay cambio
                    int temp = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = temp;
                    numeoCambios++;
                }
            }
        }
        System.out.println("Preguntas: " + preguntaCondicion + "\nCambios: " + numeoCambios);
    }

    public void sortBubbleAvz(int[] numeros) {
        int contCambios = 0;
        int contPregutas = 0;

        for (int i = 0; i < numeros.length - 1; i++) {
            boolean hayCambio = false;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                contPregutas++;
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    contCambios++;
                    hayCambio = true;
                }
            }
            if (!hayCambio) {
                break;
            }
        }
        System.out.println("Preguntas: " + contPregutas + "\nCambios: " + contCambios);
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

}
