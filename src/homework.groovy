class User {
    String firstName
    String lastName
    String email
    int age
}

    Map m1 = [firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 19]
    Map m2 = [firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 19]
    Map m3 = [firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 19]
    Map m4 = [firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 19]
    Map m5 = [firstName: "Sidharth", lastName: "Tiu", email: "abc@123", age: 19]


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

    List Users = [u1, u2, u3, u4, u5]

    Users.each { user ->
        println "$user.firstName $user.lastName ($user.age)"
    }