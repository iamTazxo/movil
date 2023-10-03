fun main() {
    val lado1 = 3.0
    val lado2 = 4.0
    val lado3 = 5.0


    if (esTriangulo(lado1, lado2, lado3)) {
        val tipo = determinarTipoTriangulo(a = lado1, b = lado2, c = lado3)
        println("El triángulo es $tipo")
    } else {
        println("Las longitudes ingresadas no forman un triángulo válido.")
    }
}


fun esTriangulo(a: Double, b: Double, c: Double): Boolean {
    return (a + b > c) && (a + c > b) && (b + c > a)
}


fun determinarTipoTriangulo(a: Double, b: Double, c: Double): String {
    return when {
        a == b && b == c -> "equilátero"
        a == b || b == c || a == c -> "isósceles"
        else -> "escaleno"
    }
}