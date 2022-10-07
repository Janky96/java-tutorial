package esercitazione0710;

public class Studente extends Persona {

    private int numEsami;
    private int matricola;

    public Studente() {
    }

    public Studente(String nome, String cognome, int numEsami, int matricola) {
        super(nome, cognome);
        this.numEsami = numEsami;
        this.matricola = matricola;
    }

    public int getNumEsami() {
        return numEsami;
    }

    public void setNumEsami(int numEsami) {
        this.numEsami = numEsami;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }
}
