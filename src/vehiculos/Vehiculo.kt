package vehiculos

abstract class Vehiculo(
    open val marca: String,
    open val modelo: String,
    velocidadInicial: Int = 0
) {

    private var _velocidad: Int = velocidadInicial

    var velocidad: Int
        get() = _velocidad
        set(valor) {
            _velocidad = if (valor >= 0) valor else 0
        }

    abstract val tipo: String

    fun mostrarInformacion() {
        println("Tipo: $tipo")
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Velocidad: $velocidad km/h")
    }

    abstract fun acelerar()
}

interface Conducible {
    fun conducir()
    fun detener()
}

class Auto(
    override val marca: String,
    override val modelo: String,
    val numeroPuertas: Int
) : Vehiculo(marca, modelo), Conducible {

    override val tipo = "Auto"

    override fun acelerar() {
        velocidad += 20
        println("$marca $modelo aceleró a $velocidad km/h")
    }

    override fun conducir() {
        println("Conduciendo el auto $marca $modelo")
    }

    override fun detener() {
        velocidad = 0
        println("El auto se detuvo")
    }
}

class Motocicleta(
    override val marca: String,
    override val modelo: String,
    val cilindrada: Int
) : Vehiculo(marca, modelo), Conducible {

    override val tipo = "Motocicleta"

    override fun acelerar() {
        velocidad += 30
        println("$marca $modelo aceleró a $velocidad km/h")
    }

    override fun conducir() {
        println("Conduciendo la motocicleta $marca $modelo")
    }

    override fun detener() {
        velocidad = 0
        println("La motocicleta se detuvo")
    }
}