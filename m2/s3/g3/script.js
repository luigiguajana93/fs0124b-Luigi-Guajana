fetch('https://striveschool-api.herokuapp.com/books')
.then(response => response.json())
.then(dati => {
    console.log(dati);

    for (let book of dati){
        let div = document.createElement('div')
        div.classList.add('card')
        div.style.width='18rem'
        let img = document.createElement('img')
        img.classList.add('card-img-top')
        img.setAttribute('src',book.img)
        div.append(img)

        let body = document.createElement('div')
        body.classList.add('card-body')
        let title = document.createElement('h5')
        title.classList.add('card-title')
        title.innerText =book.title
        body.append(title)
        let price = document.createElement('p')
        price.classList.add('card-text')
        price.innerText=book.price
        body.append(price)
        let scarta = document.createElement('button')
        scarta.classList.add('btn','btn-primary')
        scarta.innerText = "Scarta"
        
        let row= document.querySelector(".row")
        scarta.addEventListener("click",function(){
            row.removeChild(div)
        })
        
        body.append(scarta)
        
        div.append(body)
        
        document.querySelector('.row').append(div)
        
    }
})