fun main() {
    val base = 20f
    val altura = 4f
    val area = areaRectangulo(base, altura)
    println("el area del rectangulo es $area")
}

fun areaRectangulo(base: Float, altura: Float): Float {
    return base * altura
}