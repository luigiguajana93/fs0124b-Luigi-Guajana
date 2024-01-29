/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per visualizzare l'output, lancia il file HTML a cui è collegato e apri la console dagli strumenti di sviluppo del browser. 
- Utilizza dei console.log() per testare le tue variabili e/o i risultati delle espressioni che stai creando.
*/

/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/

/* abbiamo analizzato a lezione 3 tipi di datatype principale : 
1-string (esempio [ let stringa = "pippo" ] con questa tipologia di datatype facciamo riferimento all'insieme di lettere della parola  "pippo" ) 
2-number (esempio [ let numero = 3] con questa tipologia andiamo a riferirci al numero successiva all'uguale . con questo datatype possiamo eseguire tranquillamente delle 
operazioni tra dati come addizione (+) sottrazione (-) moltiplicazione (*) e divisione (/) 
 esempio :
  let numero1 = 2;
  let numero2 = 4;
  let c = a + b ; <--- con console.log (c) dalla console del browser troveremo come risultato (6)
)
3-boolean( è un tipo di datatype che può definirci come risultato o true o false. ad esempio possiamo utilizzarlo nella scelta tra due valori )
in piu abbiamo trattato anche i seguenti datatype

4-null(segnala l'assenza intenzionale di un oggetto esempio indica una condizione di false )
5-undefined(mi indica che una variabile non ha valore ) */

/* ESERCIZIO 2
 Crea una variable chiamata "myName" e assegna ad essa il tuo nome, sotto forma di stringa.
*/

let myName = " Luigi ";
console.log (myName)

/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/

let a = 12;
let b = 20;
console.log ( a + b);


/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
*/

let x = 12;

/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "myName" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/

 /* let myName = ' Guajana '
console.log(myName) */

 /*Uncaught SyntaxError: Identifier 'myName' has already been declared (at D1.js:55:5)
 mi da questo errore */


/* a differenza di let e var , const non può essere riassegnata.
 a meno che effettuo la modificare all'interno dell'oggetto. 
 per evitare questo utilizzo Object.freeze(myName) cosi evito il riassegnamento */


/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

let d = 4 ;
let sub = d - x;
console.log (d-x);


/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/

let name1 = "john";
let name2 = "John" ;
console.log (name1.toLowerCase() === name2.toLowerCase())