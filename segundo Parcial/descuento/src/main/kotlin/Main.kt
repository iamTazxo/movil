import kotlin.reflect.KFunction2

fun main() {
    fun calcularDescuento(precio: Double, cupon: String, calculadoraDescuento: KFunction2<Double, String, Double>): Double {
        return calculadoraDescuento(precio, cupon)
    }

    fun aplicarDescuento(precio: Double, cupon: String): Double {
        return when (cupon) {
            "NOIVA" -> precio
            "HALFIVA" -> precio + (precio * 0.08)
            "MINUS100" -> precio - 100
            "PROMO2020" -> when {
                precio >= 0 && precio < 1000 -> precio + (precio * 0.12)
                precio in 1000.0..2000.0 -> precio + (precio * 0.04)
                precio > 2000 && precio < 4000 -> ((precio * 0.08) + precio) / 2
                else -> precio - ((precio / 3) * 2)
            }
            else -> precio + (precio * 0.08)
        }
    }

    val precio1 = 1000.0
    val cupon1 = "NOIVA"
    val descuento1 = calcularDescuento(precio1, cupon1, ::aplicarDescuento)
    println("Descuento para precio $precio1 con cupón $cupon1: $descuento1")

    val precio2 = 1000.0
    val cupon2 = "HALFIVA"
    val descuento2 = calcularDescuento(precio2, cupon2, ::aplicarDescuento)
    println("Descuento para precio $precio2 con cupón $cupon2: $descuento2")

    val precio3 = 1000.0
    val cupon3 = "MINUS100"
    val descuento3 = calcularDescuento(precio3, cupon3, ::aplicarDescuento)
    println("Descuento para precio $precio3 con cupón $cupon3: $descuento3")

    val precio4 = 100.0
    val cupon4 = "PROMO2020"
    val descuento4 = calcularDescuento(precio4, cupon4, ::aplicarDescuento)
    println("Descuento para precio $precio4 con cupón $cupon4: $descuento4")

    val precio5 = 1500.0
    val cupon5 = "PROMO2020"
    val descuento5 = calcularDescuento(precio5, cupon5, ::aplicarDescuento)
    println("Descuento para precio $precio5 con cupón $cupon5: $descuento5")

    val precio6 = 3000.0
    val cupon6 = "PROMO2020"
    val descuento6 = calcularDescuento(precio6, cupon6, ::aplicarDescuento)
    println("Descuento para precio $precio6 con cupón $cupon6: $descuento6")

    val precio7 = 6000.0
    val cupon7 = "PROMO2020"
    val descuento7 = calcularDescuento(precio7, cupon7, ::aplicarDescuento)
    println("Descuento para precio $precio7 con cupón $cupon7: $descuento7")
}
