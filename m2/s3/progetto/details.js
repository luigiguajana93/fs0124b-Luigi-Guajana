const addressBarContent = new URLSearchParams(location.search)
const productId = addressBarContent.get('productId')

const deleteProduct = () => {
  fetch(`https://striveschool-api.herokuapp.com/api/product/${productId}` , {
    method: 'DELETE',
    headers: {
      "Authorization":  "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZjE4NjJkN2IxMTAwMTkwZTcwZTkiLCJpYXQiOjE3MDk4OTYwNzAsImV4cCI6MTcxMTEwNTY3MH0.85NQbOskpuWhk7lsDU8giCwfFzbySgHwu3LRMgRsnVY"
    },
  })
    .then((res) => {
      if (res.ok) {
        alert('Prodotto eliminato')
        location.assign('./index.html')
      } else {
        alert("Errore nell'eliminazione del prodotto")
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
}



const showDetail = function (details) {
  const rowD = document.getElementById('row-detail')
  rowD.innerHTML = `<div class="card w-75 m-auto">
    <img src="${details.imageUrl}" class="card-img-top" alt="${details.name}" >
    <div class="card-body">
      <h5 class="card-title">Nome prodotto: ${details.name}</h5>
      <p class="card-text">Brand: ${details.brand}</p>
      <p class="card-text">Descrizione: ${details.description}</p>
      <p class="card-text">Prezzo: ${details.price}€</p>
      <a href="#" class="btn btn-danger" id='delete-btn' onclick='deleteProduct()'>ELIMINA</a>
      <a href="./index.html" class="btn btn-success">Torna Indietro</a>
    </div>
  </div>`

}

const detailProduct = function () {
  fetch(`https://striveschool-api.herokuapp.com/api/product/${productId}`, {
    method:'GET',
    headers: {
      "Authorization":  "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZjE4NjJkN2IxMTAwMTkwZTcwZTkiLCJpYXQiOjE3MDk4OTYwNzAsImV4cCI6MTcxMTEwNTY3MH0.85NQbOskpuWhk7lsDU8giCwfFzbySgHwu3LRMgRsnVY"
        
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
      showDetail(productDetails)
    })
    .catch((err) => {
      console.log(err)
    })
}

detailProduct()