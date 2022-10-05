# Java Arrays

Come inizializzare un array di interi di 5 elementi

```Java
int [] array = new int [5]
```

&nbsp;

Come inizializzare un array di booleani di 8 elementi

```Java
boolean [] array = new boolean [8]
```

&nbsp;

Come scandire un array normalmente col while

```Java
int i = 0;
while(i < array.length) {
    array[i]
    i++;
}
```

&nbsp;

Come scandire un array normalmente col for

```Java
for(int i = 0; i < array.length; i++) {
    array[i]
}
```

&nbsp;

Funzione che stampa un array in modo corretto

```Java
private void stampaArrayDiInt(int [] array) {
    String res = "[";
    for(int i = 0; i < array.length - 1; i++) {
        res = res + array[i] + ", ";
    }
    System.out.println(res + array[array.length - 1] + "]");
}
```

&nbsp;

Funzione che verifica che l'array di booleani in input abbia solo valori true

```Java
private boolean verificaArrayTrue(boolean [] array) {
    for(int i = 0; i < array.length; i++) {
        if(array[i] == false) {
            return false;
        }
    }
    return true;
}
```

&nbsp;

Ora vediamo un esempio di come avremo in input una determinata lunghezza, e da lì iniziallizarci
un array di interi che ha come elementi all'interno, proprio la posizione
```Java
private int [] inizializzaArrayPosizioni(int lunghezza) {
    int [] risultato = new int[lunghezza];
    for(int i = 0; i < array.length; i++) {
        array[i] = i;
    }
    return risultato;
}
```
