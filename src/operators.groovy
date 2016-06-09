List a = [2, 43, 4, 76, 7, 40, 50, 32, 34]
List b = []

println a.find {
    return it > 20
}

println a.findAll {
    return it > 20
}