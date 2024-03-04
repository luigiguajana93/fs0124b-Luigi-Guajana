let camponame= document.getElementById('camponame')
let campoowner =document.getElementById('campoowner')
let campospecie =document.getElementById('campospecie')
let camporazza =document.getElementById('camporazza')
let campoinvio =document.getElementById('campoinvio')
let campolista = document.getElementById('campolista')

let pets = []

class Pet {
    constructor (name,owner,species,breed){
        this.name = name
        this.owner = owner
        this.species =species
        this.breed = breed
    }

sameowner(pet2){
    if(this.owner === pet2.owner){return true}
        else{ return false}
}
}



const animali = function() {
    campolista.innerHTML=''
    pets.forEach((pet) =>{
        const nextLi = document.createElement('li')
        nextLi.innerText = 'Nome animale: ' + pet.name + ', proprietario animale: ' + pet.owner + ' ,specie animale: ' + pet.species + ', razza: ' + pet.breed
    campolista.appendChild(nextLi)
    })
}

campoinvio.onclick=function(){
let newPet = new Pet(
    camponame.value ,
    campoowner.value ,
    campospecie.value ,
    camporazza.value
)
pets.push(newPet)
console.log(pets)
animali()
camponame.value =''
campoowner.value =''
campospecie.value = ''
camporazza.value= ''
}

