import ogetti.Studente;

public class Main {

    public static void main(String[] args) {

        boolean [] ciccio = inizializzaArrayBooleaniPrimiQuattroTrue(10);
        stampaArrayDiBooleani(ciccio);
    }
    private static int sommaArray(int []array){
       int somma = 0;

       for(int i =0; i< array.length;i++){
          somma = somma+array[i];
       }
       return somma;
    }



    private static boolean arrayPari(int [] array) {

        for(int i=0; i<array.length; i++){
            int numero = array[i];
            if(numero%2 == 1){
                return false;
            }
        }
        return true;

    }

    private static boolean [] inizializzaArrayBooleaniPrimiQuattroTrue(int lunghezza) {
        boolean [] risultato = new boolean[lunghezza];
        for(int i = 0; i < risultato.length; i++) {
            if(i < 4) {
                risultato[i] = true;
            } else {
                risultato[i] = false;
            }
        }
        return risultato;
    }

    private static int [] inizializzaInteriNumCrescente(int lunghezza) {
        int [] risultato = new int[lunghezza];
        for(int i = 0; i < risultato.length; i++) {
            risultato[i] = i;
        }
        return risultato;
    }





    private static boolean [] inizializzaArrayTuttiTrue(int lunghezza) {
        boolean [] risultato = new boolean[lunghezza];
        for(int i = 0; i < risultato.length; i++) {
            risultato[i] = true;
        }
        return risultato;
    }

    private static boolean verificaArrayTuttiTrue(boolean [] array) {

        for(int i = 0; i  < array.length; i++) {
            if(array[i] == false) {
                return false;
            }
        }
        return true;
    }

    private static void stampaArrayDiBooleani(boolean [] array) {
        String result = "[";
        for(int i = 0; i < array.length - 1; i++) {
            result = result + array[i] + ", ";
        }
        result = result + array[array.length - 1] + "]";
        System.out.println(result);
    }

    private static void stampaArrayDiInteri(int [] array) {
        int i = 0;
        while(i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }

    private static void stampaArrayDiInteriV2(int [] array) {
        int i = 0;
        String result = "[";
        while(i < array.length - 1) {
            result = result + array[i] + ", ";
            i++;
        }
        result = result + array[array.length - 1] + "]";
        System.out.println(result);
    }

    private static void stampaArrayDiInteriV2ConFor(int [] array) {
        String result = "[";
        for(int i = 0; i < array.length - 1; i++) {
            result = result + array[i] + ", ";
        }
        result = result + array[array.length - 1] + "]";
        System.out.println(result);
    }






}