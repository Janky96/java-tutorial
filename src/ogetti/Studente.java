package ogetti;

public class Studente {

    private String nome;
    private String cognome;
    private int eta;
    private String dataNascita;
    private int annoNascita;

    public Studente() {
    }

    public Studente(String nome, String cognome, int eta, String dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.dataNascita = dataNascita;
    }

    public String getAnagrafica() {
        String anagrafica = "Lo studente " + nome + " " + cognome + " di età " +
                eta + " è nato il " + dataNascita;
        return anagrafica;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public void setAnnoNascita(int annoNascita) {
        this.annoNascita = annoNascita;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", dataNascita='" + dataNascita + '\'' +
                ", annoNascita=" + annoNascita +
                '}';
    }

    public Studente prendiStudenteConEtaMaggiore(Studente studenteFuori) {
        if(this.eta > studenteFuori.getEta()) {
            return this;
        } else {
            return studenteFuori;
        }
    }

}
