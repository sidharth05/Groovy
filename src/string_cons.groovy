class Person {

    String firstname
    String lastname
    String a
    String b
    float c
    int score
}

//Java Way
Person u = new Person()
u.setFirstname("john")
u.setLastname("doe")
u.setA()
u.setScore(13)

print u.firstname
println u.getFirstname()

Person u1 = new Person([firstName: "John", lastName: "alkdsfjf", score: 2])
println u1.firstname
println u1.lastname