package vehiculos

fun main() {

    println("=== SISTEMA DE VEHÍCULOS ===")

    val auto = Auto(
        marca = "Toyota",
        modelo = "Corolla",
        numeroPuertas = 4
    )

    println("\n--- AUTO ---")
    auto.mostrarInformacion()
    auto.conducir()
    auto.acelerar()
    auto.acelerar()
    auto.detener()

    val moto = Motocicleta(
        marca = "Honda",
        modelo = "CB190R",
        cilindrada = 190
    )

    println("\n--- MOTOCICLETA ---")
    moto.mostrarInformacion()
    moto.conducir()
    moto.acelerar()
    moto.acelerar()
    moto.detener()
}