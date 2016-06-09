List a = [2, 43, 4, 76, 7, 40, 50, 32, 34]
List b = []

int j=0
//Printing element of List a
a.each { item ->
    if(item > 20) {
        println(item)
    }
}

//Assigning some value of List a to List b
a.each { item ->
    if(item > 20) {
        b[j]=item
        j++
    }
}

//printing List b
b.each { hello ->
    println hello
}