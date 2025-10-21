from sortSelection import SortSelection

def main():
    numeros = [5, 2, 9, 1, 5, 6]
    print("Original:", numeros)
    selection = SortSelection()
    asc = selection.sort_ascendente(numeros.copy())
    print("Ascendente:", asc)
    desc = selection.sort_descendente(numeros.copy())
    print("Descendente:", desc)

if __name__ == "__main__":
    main()
