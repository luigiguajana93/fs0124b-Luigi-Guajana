
salvabottone.addEventListener('click',function(){
            
            
    const salvabottone = document.querySelector('#invia')
    const lista = document.querySelector('#lista')
    const input = document.querySelector('#task')
        

        let li= document.createElement('li');
        li.innerText=input.value
        li.classList.add('task')
        li.addEventListener('click',function(){
            li.classList.toggle('completed')
        })

        let button = document.creatElement('button')
        button.innerText = 'Elimina'

        button.addEventListener('click',function(){
            li.remove()
        })

        li.append(button)
        lista.append(li)

    })



    