fun main() {
    val numeros = mutableList0f("one", "two", "three", "four", "five", "four", "four")
    val numSet: Set<Int> = set0f(0, 1, 2, 3, 4, 5, 5)
    println("Numero de elementos: ${numeros.size}")
    println("Segundo elemento: ${numeros.get(1)}")
    println("Cuarto elemento: ${numeros[3]}")
    println("Ultimo elemento:  ${numeros.get(numeros.size - 1)}")
    println("Index del elemento \"four\":  ${numeros.index0f("four")}")

}