package it.epicode.biblioteca.services;

import it.epicode.biblioteca.Lettura;

//interfaccia che definisce i metodi che vogliamo utilizzare per la gestione della biblioteca

public interface LetturaService {

    void aggiungiLettura(Lettura lettura);

    void rimuoviLettura(Long isbn);


}
