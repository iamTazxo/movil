fun main() {
    val nombres = list0f(
        "Juan",
        "Mikasa",
        "Yue",
        "Yotsuba",
        "Miku",
        "Itsuki",
        "Nino",
        "Mai",
        "Marin"
    )
    for (nombre in nombres) {
        println(nombre)
        if (nombre == "Mikasa") {
            println("Personaje Encontrado!")
            break
        }
    }
}
