/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    // 1. Para un número decimal, ¿Qué tipo de dato se asigna por defecto? Imprimirlo
    val numeroDecimal = 5.1602
    println("El tipo de dato asignado por defecto para el número decimal es: Double")

    // 2. Volver flotante a la variable decimal
    val numeroFlotante = numeroDecimal.toFloat()
    println("La variable decimal convertida a flotante es: $numeroFlotante")

    // 3. Declarar una variable const val con el valor de Pi y multiplicarla por 2 veces nuestra variable decimal para sacar el perímetro de un círculo.
    val Pi: Double = 3.141592
    val radio = numeroDecimal
    val perimetro = 2 * Pi * radio

    // a. Utilizar un String Template para imprimir el texto "El perímetro del círculo es: [resultado]" siendo resultado nuestra variable perímetro.
    println("El perímetro del círculo es: $perimetro")
}