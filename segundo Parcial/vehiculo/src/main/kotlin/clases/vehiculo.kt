package clases

import java.awt.Color

class vehiculo constructor(val marca:String, val modelo:String, val color: String){
    init {
        println("""Los datos del coche son 
            marca: $marca
            modelo:$modelo
            color: $color""")
    }
    constructor(val marca:String, val modelo:String, val color: String, val placas:String):this[marca,modelo,color]{
        this.placas=placas
        println("las placas son: ${this.placas}")
    }

    var placas=""
    var gasolina=0f
    var encendido=false

    fun encender(){
        encendido=true

    }
    fun apagar(){
        encendido=false
    }
    fun recargar(litros:Float){
        gasolina+=litros
    }
}