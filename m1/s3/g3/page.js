document.addEventListener("DOMContentLoaded",()=>{
    const invia = document.getElementById("invia")
    const reset = document.getElementById("reset")
    const input = document.getElementById("input")

    invia.addEventListener("click",()=>{
        console.log("nuovo task")
    })

    reset.addEventListener("click",()=>{
        console.log("pulisci task")
    })

    input.addEventListener("click",()=>{
        console.log("premere invio")
    })

})