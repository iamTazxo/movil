fun main() {
    val ancho = 2f
    val volumen = volumenPrisma(base, altura, ancho)
    println("el volumen del prisma es $volumen")
}

fun volumenPrisma(base: Float, altura: Float, ancho: Float): Float {
    return areaRectangulo(base, altura) * ancho
}