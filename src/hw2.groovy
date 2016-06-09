class User {
    String firstName
    String lastName
    String email
    int age
}

Map m1 = [firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 198]
Map m2 = [firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 19]
Map m3 = [firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 192]
Map m4 = [firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 89]
Map m5 = [firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 99]
Map m6 = [firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 129]
Map m7 = [firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 142]
Map m8 = [firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 86]
Map m9 = [firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 75]


/*User u1 = new User([firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 19])
User u2 = new User([firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 19])
User u3 = new User([firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 19])
User u4 = new User([firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 19])
User u5 = new User([firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 19])*/

User u1 = new User(m1)
User u2 = new User(m2)
User u3 = new User(m3)
User u4 = new User(m4)
User u5 = new User(m5)
User u6 = new User(m6)
User u7 = new User(m7)
User u8 = new User(m8)
User u9 = new User(m9)

List Users = [u1, u2, u3, u4, u5, u6, u7, u8, u9]
List a = [] // age > 100
List b = [] // age <= 100

a = Users.findAll {
    return it.age > 100
}

b = Users.findAll {
    return it.age <= 100
}

println("Age above 100")
a.each {
    println "$it.firstName $it.lastName ($it.age)"
}

println("Age below 100")
b.each {
    println "$it.firstName $it.lastName ($it.age)"
}