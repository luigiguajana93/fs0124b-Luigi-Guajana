interface Smartphone {
    credito:number
    numeroChiamate:number
    ricarica(ammontare:number):void
    chiamata (minuti: number): void
    get numero404(): number
    get getNumeroChiamate(): number
    azzeraChiamate(): void
}
class User implements Smartphone {
    nome: string
    cognome: string
    credito: number = 0 
    numeroChiamate: number  = 0
    constructor ( nome: string , cognome: string){
        this.nome = nome
        this.cognome = cognome
    }
    ricarica(ammontare: number): void{
        this.credito += ammontare
    }
    chiamata(minuti: number): void{
        if(this.credito - ( minuti * 0.20) < 0){
            console.log("credito insufficiente")
            return
        }
        this.credito -= ( minuti * 0.20)
        this.numeroChiamate += 1
        
    }
    get numero404(){
        return this.credito
    }
    get getNumeroChiamate(){
        return this.numeroChiamate
    }
    azzeraChiamate(): void {
        this.numeroChiamate = 0
    }
}

const soggetto = new User ("luigi","guajana")
soggetto.ricarica(10)
soggetto.chiamata(2)
soggetto.chiamata(5)
soggetto.chiamata (3)
soggetto.chiamata(15)
soggetto.chiamata(15)
soggetto.chiamata(15)
console.log(soggetto.numero404)
console.log(soggetto.getNumeroChiamate)
soggetto.azzeraChiamate()
