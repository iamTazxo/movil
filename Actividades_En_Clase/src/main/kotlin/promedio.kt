import kotlin.random.Random

fun main() {
    // Definir las calificaciones y obtener un número aleatorio entre 0 y 1
    val calificacion1 = 8
    val calificacion2 = 8
    val calificacion3 = Random.nextDouble(0.0, 1.0) * 10  // Escalar de 0-1 a 0-10

    // Calcular el promedio
    val promedio = (calificacion1 + calificacion2 + calificacion3) / 3

    // Verificar si el promedio es aprobatorio
    if (promedio >= 6) {
        println("El promedio es $promedio (Aprobado)")

        // Redondear la calificación
        val calificacionRedondeada = when {
            promedio % 1 >= 0.5 -> kotlin.math.ceil(promedio)
            else -> kotlin.math.floor(promedio)
        }

        println("Calificación redondeada: $calificacionRedondeada")
    } else {
        println("El promedio es $promedio (Reprobado)")
    }
}