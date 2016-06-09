/**
 * Created by bholenath on 8/6/16.
 */

println "Hello"

List a = [2,3,4,5,6]
List a1 = ["Ankur", "Singh", 2, 3.4, true]

if (a) {
    println "The a is not empty"
}

String b = ""

if (b) {
    println "b is not empty"
} else {
    println "b is empty"
}

Map data = [firstName:"Sidharth", lastName: "Tiu", info:"My bro own Pulsar 220F"]
println data
println data.firstName
println data.get("firstName")
println(data["lastName"])


