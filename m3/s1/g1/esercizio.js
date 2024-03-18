"use strict";
class User {
    constructor(nome, cognome) {
        this.credito = 0;
        this.numeroChiamate = 0;
        this.nome = nome;
        this.cognome = cognome;
    }
    ricarica(ammontare) {
        this.credito += ammontare;
    }
    chiamata(minuti) {
        if (this.credito - (minuti * 0.20) < 0) {
            console.log("credito insufficiente");
            return;
        }
        this.credito -= (minuti * 0.20);
        this.numeroChiamate += minuti;
    }
    get numero404() {
        return this.credito;
    }
    get getNumeroChiamate() {
        return this.numeroChiamate;
    }
    azzeraChiamate() {
        this.numeroChiamate = 0;
    }
}
const soggetto = new User("luigi", "guajana");
soggetto.ricarica(10);
soggetto.chiamata(2);
soggetto.chiamata(5);
soggetto.chiamata(3);
soggetto.chiamata(10);
soggetto.chiamata(15);
soggetto.chiamata(16);
console.log(soggetto.numero404);
console.log(soggetto.getNumeroChiamate);
soggetto.azzeraChiamate();
