fun elegirPais(country: String) {
    when (country) {
        "Mexico" -> {
            val idioma = "Español"
            val divisa = "Peso"
            actualizarPerfil(pais)
            println("Bienvenido a debu shop")
        }

        "Francia" -> {
            val idioma = "Frances"
            val divisa = "Euro"
            val credito = convertirAEuros(saldo)
            println("Soyez Bienvenu a Bedu shop")
        }

        "Estados Unidos" -> {
            val idioma = "ingles"
            val divisa = "Dolar"
            val credito = convertirADolar(saldo)
            println("Welcome to Bedu shop")
        }

        else -> {
            println("Lo sentimos, este servicio no esta disponible en tu pais")
        }
    }
}