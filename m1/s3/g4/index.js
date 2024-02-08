const button = document.getElementById('numrandom');
const tabella = document.querySelector('.tabella')

for( let i = 1; i <= 90;i++){
    const number = document.createElement('div')
    number.classList.add('numero')
    number.innerText=i;    
    tabella.append(number)
    
    
}

button.addEventListener('click',function(){
    let casuale = Math.floor(Math.random() * (76) + 1);

    let contenitore = document.createElement('li');
    lista.append(contenitore);
    contenitore.innerText= casuale;
    const n =document.querySelector('.tabella .numero:nth-child('+ casuale +')');
    n.classList.add('completed')
})
