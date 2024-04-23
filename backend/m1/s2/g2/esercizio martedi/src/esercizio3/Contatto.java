package esercizio3;

import java.util.Objects;

public class Contatto {
    private String nome;
    private String telefono;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Contatto(String nome, String telefono) {
        this.nome = nome;
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Contatto contatto && o.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefono);
    }

    @Override
    public String toString() {
        return "Contatto{" +
                "nome='" + nome + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
