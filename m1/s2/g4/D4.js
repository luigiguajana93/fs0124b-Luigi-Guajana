/* ESERCIZIO 1
 Scrivi una funzione di nome "area", che riceve due parametri (l1, l2) e calcola l'area del rettangolo associato.
*/

function area(l1,l2)
{
    return l1*l2;
}
console.log(area(5,8));
/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 2
 Scrivi una funzione di nome "crazySum", che riceve due numeri interi come parametri.
 La funzione deve ritornare la somma dei due parametri, ma se il valore dei due parametri è il medesimo deve invece tornare
 la loro somma moltiplicata per tre.
*/

function crazySum (a,b){

    if(a == b) {
                return (a+b)*3;               
                }
    else {return a+b;}            
            }
    console.log(crazySum(4,4));

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 3
 Scrivi una funzione di nome "crazyDiff" che calcola la differenza assoluta
tra un numero fornito come parametro e 19.
 Deve inoltre tornare la differenza assoluta moltiplicata per tre qualora il numero fornito sia 
 maggiore di 19.
*/

function crazyDiff (a,b=19) {

let diffabs=0;
diffabs = (Math.abs(a) - b);

if(a>19) {return diffabs*3;}

else {return diffabs;} 
}
console.log(crazyDiff(6,19))



/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 4
 Scrivi una funzione di nome "boundary" che accetta un numero intero n come parametro,
 e ritorna true se n è compreso tra 20 e 100 (incluso) oppure
 se n è uguale a 400.
*/

function boundary(n){
if(( n>20 && n <= 100) || n == 400 ) return "TRUE";
else{ return "FALSE"}
}
console.log(boundary(19))

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 5
 Scrivi una funzione di nome "epify" che accetta una stringa come parametro.
 La funzione deve aggiungere la parola "EPICODE" all'inizio della stringa fornita, 
 ma se la stringa fornita comincia già con "EPICODE" allora deve
 ritornare la stringa originale senza alterarla.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 6
 Scrivi una funzione di nome "check3and7" che accetta un numero positivo come parametro.
  La funzione deve controllare che il parametro sia un multiplo
 di 3 o di 7. (Suggerimento: usa l'operatore modulo)
*/

function check3and7 (n) {
    if(n % 3 ==0 && n % 7 ==0){return "è multiplo di 3 e di 7"}
    else if(n % 3 == 0) {return "é un multiplo di 3"}
    else if (n % 7== 0) {return "é un multiplo di 7"}
        else {return "non è un multiplo di 3 e di 7"}
}
console.log(check3and7(21));

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 7
 Scrivi una funzione di nome "reverseString", il cui scopo è invertire una 
 stringa fornita come parametro (es. "EPICODE" --> "EDOCIPE")
*/

let stringa = "EPICODE"

function reverseString(){
    let splitString = stringa.split("");
    let reverseArray = splitString.reverse();
    let joinArray = reverseArray.join("");
    return joinArray;
}
console.log(reverseString());

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 8
 Scrivi una funzione di nome "upperFirst", che riceve come parametro una stringa 
 formata da diverse parole.
 La funzione deve rendere maiuscola la prima lettera di ogni parola 
 contenuta nella stringa.
*/
let str ="epicode è una bella scuola "

function upperFirst(str) {
    for(let i=0; i< str.length;i++) {
    if(!str) {return str;}
    else { return str[0].toUpperCase() + str.slice(1);} 
                                    }
    }
console.log(upperFirst(str))

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 9
 Scrivi una funzione di nome "cutString", che riceve come parametro
una stringa. 
 La funzione deve creare una nuova stringa senza il primo 
 e l'ultimo carattere
 della stringa originale.
*/



/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 10
 Scrivi una funzione di nome "giveMeRandom", che accetta come
  parametro un numero n e ritorna un'array contenente n numeri 
  casuali inclusi tra 0 e 10.
*/
function giveMeRandom (n)
/* SCRIVI QUI LA TUA RISPOSTA */
