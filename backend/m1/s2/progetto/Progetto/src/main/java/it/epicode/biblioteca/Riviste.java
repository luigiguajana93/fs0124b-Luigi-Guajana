package it.epicode.biblioteca;

public class Riviste extends  Lettura{

    private Periodo periodo;

    //costruttore del periodo
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
    public String toString() {
        return "Riviste{" +
                "periodo=" + periodo +
                '}';
    }
}
