fun edad() {
    print("Ingresa edad y presiona enter (escribe solo el numero ): ")
    val age = readLine()?.toInt()
    if (age == 18) {
        println("Ya eres mayor de edad!")
    }
}