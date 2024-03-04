class User {
    constructor(firstName, lastName, age, location){
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
        this.location = location
    }

    confronta(user2){
        if(this.age < user2.age){
            return `${user2.firstName} è più grande di ${this.firstName}`
        } else if(this.age > user2.age){
            return `${user2.firstName} è più piccolo di ${this.firstName}`
        } else {return `${user2.firstName} e ${this.firstName} hanno la stessa età`
    }
    }
}

x= new User ('Luigi','Guajana', 10, 'Palermo')
y= new User ('Mario','Rossi', 10,'Roma')

console.log(x.confronta(y))