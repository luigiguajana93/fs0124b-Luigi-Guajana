const input = document.getElementById('input');
const button =document.getElementById('addButton');
const lista = document.getElementById('lista');

button.addEventListener('click',function() {
    let contenitore = document.createElement('li');
    lista.append(contenitore);
    contenitore.innerText= input.value;
    let bottone = document.createElement('button');
    contenitore.append(bottone);
    bottone.innerText= "Elimina";
    bottone.addEventListener('click',()=>{
        contenitore.remove();
    })
    
    contenitore.classList.add("elemento");
    contenitore.addEventListener('click',()=>{
        contenitore.classList.toggle("completed");
    })
    
})


