package it.epicode.biblioteca;

// La classe Riviste rappresenta un tipo di articolo di lettura, in particolare una rivista.
public class Riviste extends  Lettura{

    //questo è il periodo di pubblicazione della rivista(mensile,settimanale,semestrale)
    private Periodo periodo;

    //costruttore della classe Riviste e utilizzando  l'extends di Lettura possiamo accedere attraverso il super ai setter della classe Lettura
    public Riviste(Periodo periodo,Long isbn ,String titolo,int anno,int numeroPagine) {
        this.periodo = periodo;
        super.setIsbn(isbn);
        super.setTitolo(titolo);
        super.setAnno(anno);
        super.setNumeroPagine(numeroPagine);
    }

//getter e setter del periodo
    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }



    @Override
    //metodo per fornire una rappresentazione testuale della classe rivista
    public String toString() {
        return "Riviste{" +
                "periodo=" + periodo +
                '}';
    }
}
