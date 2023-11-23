package clases
fun main() {
    val miVehiculo=vehiculo("toyota", "prius", "negro", "lol")

    miVehiculo.placas="lol"
    println("el coche está prndido? ${miVehiculo.encendido}")
    miVehiculo.encender()
    println("el coche está prndido? ${miVehiculo.encendido}")
    println("el tanque está ? ${miVehiculo.gasolina}")
    miVehiculo.recargar(litros = 20.87f)
    println("El tanque tiene ${miVehiculo.gasolina}")


}
