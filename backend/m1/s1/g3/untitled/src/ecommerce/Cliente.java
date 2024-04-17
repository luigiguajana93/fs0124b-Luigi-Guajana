package ecommerce;

public class Cliente {
    int codice;
    String nome;
    String cognome;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
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

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    String email;
    Date data;

    public Date getData() {
        return data;
    }
    public void setData(Date data){
        this.data=data;
    }

}
