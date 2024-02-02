/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per visualizzare l'output, lancia il file HTML a cui è collegato e apri la console dagli strumenti di sviluppo del browser. 
- Utilizza dei console.log() per testare le tue variabili e/o i risultati delle espressioni che stai creando.
*/

/* ESERCIZIO 1
    Dato il seguente array, scrivi del codice per stampare ogni elemento ell'array in console.
*/
const pets = ['dog', 'cat', 'hamster', 'redfish']

for(let i=0;i<pets.length;i++){
  console.log(pets[i]);
}
console.log(pets);

/* ESERCIZIO 2
    Scrivi del codice per ordinare alfabeticamente gli elementi dell'array "pets".
*/

for(let i=0; i<pets.length;i++){
  pets.sort();
}
console.log(pets);

/* ESERCIZIO 3
    Scrivi del codice per stampare nuovamente in console gli elementi dell'array "pets", questa volta in ordine invertito.
*/

for(let i=0;i<pets.length;i++){

  console.log(pets[i]);
}
pets.reverse();
console.log(pets);
/* ESERCIZIO 4
    Scrivi del codice per spostare il primo elemento dall'array "pets" in ultima posizione.
*/
for(let i=0;i<pets.length;i++){
  console.log(pets[i]);
}
pets.shift();
console.log(pets);
pets.push("redfish");
console.log(pets);

/* ESERCIZIO 5
    Dato il seguente array di oggetti, scrivi del codice per aggiungere ad ognuno di essi una proprietà "licensePlate" con valore a tua scelta.
*/
const cars = [
  {
    brand: 'Ford',
    model: 'Fiesta',
    color: 'red',
    trims: ['titanium', 'st', 'active'],
  },
  {
    brand: 'Peugeot',
    model: '208',
    color: 'blue',
    trims: ['allure', 'GT'],
  },
  {
    brand: 'Volkswagen',
    model: 'Polo',
    color: 'black',
    trims: ['life', 'style', 'r-line'],
  },
]


let targa = Math.floor(Math.random()*1000 + 1 );
for(i=0 ;i<cars.length;i++){
  
Object.assign(cars[i],{ licenseplate:"AB" +  targa + "CD"})

}
console.log(cars);


/* ESERCIZIO 6
    Scrivi del codice per aggiungere un nuovo oggetto in ultima posizione nell'array "cars", rispettando la struttura degli altri elementi.
    Successivamente, rimuovi l'ultimo elemento della proprietà "trims" da ogni auto.
*/


let newcar = {
  brand: 'Hyundai',
  model: 'Kona',
  color: 'green',
  trims: ['tdci', 'hybrid', 'full']
};

cars.push(newcar);
for (let i = 0; i <cars.length; i++){
  cars[i].trims.pop();

}
console.log(cars);



/* ESERCIZIO 7
    Scrivi del codice per salvare il primo elemento della proprietà "trims" di ogni auto nel nuovo array "justTrims", sotto definito.
*/
const justTrims = []
for (let i = 0; i < cars.length; i++) {
  let car = cars[i]
  let firstTrim = car.trims[0]
  justTrims.push(firstTrim)
}

console.log(justTrims)

/* ESERCIZIO 8
    Cicla l'array "cars" e costruisci un if/else statament per mostrare due diversi messaggi in console. Se la prima lettera della proprietà
    "color" ha valore "b", mostra in console "Fizz". Altrimenti, mostra in console "Buzz".
*/

for (let i = 0; i < cars.length; i++) {
  let macchina = cars[i]
  let color = macchina.color
  let Lettera = color.charAt(0)
  if (Lettera.toLowerCase() === 'b') {
    console.log('Fizz')
  } else {
    console.log('Buzz')
  }
}


/* ESERCIZIO 9
    Utilizza un ciclo while per stampare in console i valori del seguente array numerico fino al raggiungimento del numero 32.
*/
{const numericArray = [6, 90, 45, 75, 84, 98, 35, 74, 31, 2, 8, 23, 100, 32, 66, 313, 321, 105,]

let i = 0;

while (i < numericArray.length && numericArray[i] !== 32) {
  console.log(numericArray[i]);
  i++;
}
}



/* ESERCIZIO 10
    Partendo dall'array fornito e utilizzando un costrutto switch, 
    genera un nuovo array composto dalle posizioni di ogni carattere all'interno
    dell'alfabeto italiano.
    es. [f, b, e] --> [6, 2, 5]
*/
const charactersArray = ['g', 'n', 'u', 'z', 'd']
const arr =[];

for( let i=0; i<charactersArray.length;i++) {
  let lettera = charactersArray[i];
  let alfabeto;



switch (lettera) {
  case 'a': alfabeto = 1;
            break;
  case 'b': alfabeto = 2;
            break;
  case 'c': alfabeto = 3;
            break;
  case 'd': alfabeto = 4;
            break;
  case 'e': alfabeto = 5;
            break;
  case 'f': alfabeto = 6;
            break;                             
  case 'g': alfabeto = 7;
            break;
  case 'h': alfabeto = 8;
            break;
  case 'i': alfabeto = 9;
            break;
  case 'l': alfabeto = 10;
            break;
  case 'm': alfabeto = 11;
            break;
  case 'n': alfabeto = 12;
            break;
  case 'o': alfabeto = 13;
            break;
  case 'p': alfabeto = 14;
            break;
  case 'q': alfabeto = 15;
            break;
  case 'r': alfabeto = 16;
            break;
  case 's': alfabeto = 17;
            break;
  case 't': alfabeto = 18;
            break;
  case 'u': alfabeto = 21;
            break;
  case 'v': alfabeto = 22;
            break; 
  case 'z': alfabeto = 23;
            break      
}

arr.push(alfabeto);
}
console.log(arr);