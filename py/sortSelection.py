class SortSelection:
    def sort_ascendente(self, numeros):
        n = len(numeros)
        for i in range(n - 1):
            menor_pos = i
            for j in range(i + 1, n):
                if numeros[j] < numeros[menor_pos]:
                    menor_pos = j
            numeros[i], numeros[menor_pos] = numeros[menor_pos], numeros[i]
        return numeros

    def sort_descendente(self, numeros):
        n = len(numeros)
        for i in range(n - 1):
            mayor_pos = i
            for j in range(i + 1, n):
                if numeros[j] > numeros[mayor_pos]:
                    mayor_pos = j
            numeros[i], numeros[mayor_pos] = numeros[mayor_pos], numeros[i]
        return numeros