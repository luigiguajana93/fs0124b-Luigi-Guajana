const addressBarContent = new URLSearchParams(location.search)
const productId = addressBarContent.get('id')
const nameProductInput = document.getElementById('name')
const descriptionProductInput = document.getElementById('description')
const brandProductInput = document.getElementById('brand')
const imageProductInput = document.getElementById('imageUrl')
const priceProductInput = document.getElementById('price')
console.log(productId)


if (productId) {
  fetch('https://striveschool-api.herokuapp.com/api/product/' + productId, {
    headers: {
      Authorization:
      'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZjE4NjJkN2IxMTAwMTkwZTcwZTkiLCJpYXQiOjE3MDk4OTYwNzAsImV4cCI6MTcxMTEwNTY3MH0.85NQbOskpuWhk7lsDU8giCwfFzbySgHwu3LRMgRsnVY'
    },
  })
    .then((res) => {
      if (res.ok) {
        return res.json()
      } else {
        
        if (res.status === 400) {
          throw new Error('Errore 400 - Bad request')
        } else if (res.status === 401) {
          throw new Error('Errore 401 - Unauthorized')
        } else if (res.status === 404) {
          throw new Error('Errore 404 - Not found')
        } else if (res.status === 500) {
          throw new Error('Errore 500 - Internal Server Error')
        } else {
          throw new Error('Errore')
        }
      }
    })
    .then((productDetails) => {
      
      nameProductInput.value = productDetails.name
      descriptionProductInput.value = productDetails.description
      brandProductInput.value = productDetails.brand
      imageProductInput.value = productDetails.imageUrl
      priceProductInput.value = productDetails.price
    })
    .catch((err) => {
      console.log(err)
    })
}

const formProduct = document.getElementById('salvabtn')
formProduct.addEventListener("click", (e) => {
  e.preventDefault()


  const newProduct = {
    name: nameProductInput.value,
    description: descriptionProductInput.value,
    brand: brandProductInput.value,
    imageUrl: imageProductInput.value,
    price: priceProductInput.value,
  }

  console.log(newProduct)




  fetch('https://striveschool-api.herokuapp.com/api/product/', {
    method: 'POST',
    body: JSON.stringify(newProduct),
    headers: {
      'Content-Type': 'application/json',
      Authorization:
      "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZjE4NjJkN2IxMTAwMTkwZTcwZTkiLCJpYXQiOjE3MDk4OTYwNzAsImV4cCI6MTcxMTEwNTY3MH0.85NQbOskpuWhk7lsDU8giCwfFzbySgHwu3LRMgRsnVY"
    },
  })
    .then((res) => {
      if (res.ok) {
        alert('Congratulazioni! Hai salvato il prodotto!')
        window.location.href='index.html'
      } else {
        console.log(res)
        alert('ATTENZIONE! Errore nel salvataggio!')
        if (res.status === 400) {
          throw new Error('Errore 400 - Bad request')

        } else if (res.status === 401) {
          throw new Error('Errore 401 - Unauthorized')
        } else if (res.status === 404) {
          throw new Error('Errore 404 - Not found')
        } else if (res.status === 500) {
          throw new Error('Errore 500 - Internal Server Error')
        } else {
          throw new Error('Errore')
        }
      }
    })
    .catch((err) => {
      console.log(err)
    })
})


const edit = document.getElementById('editbtn')
edit.addEventListener("click",()=>{

  const newProduct = {
    name: nameProductInput.value,
    description: descriptionProductInput.value,
    brand: brandProductInput.value,
    imageUrl: imageProductInput.value,
    price: priceProductInput.value,
  }

fetch(`https://striveschool-api.herokuapp.com/api/product/${productId}`, {
    method: 'PUT',
    body: JSON.stringify(newProduct),
    headers: {
      'Content-Type': 'application/json',
      Authorization:
      "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZjE4NjJkN2IxMTAwMTkwZTcwZTkiLCJpYXQiOjE3MDk4OTYwNzAsImV4cCI6MTcxMTEwNTY3MH0.85NQbOskpuWhk7lsDU8giCwfFzbySgHwu3LRMgRsnVY"
    },
  })
    .then((res) => {
      if (res.ok) {
        alert('Congratulazioni! Hai modificato il prodotto!')
        window.location.href='index.html'
      } else {
        alert('ATTENZIONE! Errore nella modifica')
        if (res.status === 400) {
          throw new Error('Errore 400 - Bad request')
        } else if (res.status === 401) {
          throw new Error('Errore 401 - Unauthorized')
        } else if (res.status === 404) {
          throw new Error('Errore 404 - Not found')
        } else if (res.status === 500) {
          throw new Error('Errore 500 - Internal Server Error')
        } else {
          throw new Error('Errore')
        }
      }

    })
    .catch((err) => {
      console.log(err)
    })
  })
