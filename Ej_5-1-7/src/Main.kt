fun main() {
    val coche = Automovil("Toyota", "Corolla", 50, "Sedán")
    val moto = Motocicleta("Yamaha", "YZF-R3", 15, 321)

    coche.mostrarInformacion()
    println("Autonomía: ${coche.calcularAutonomia()} km\n")

    moto.mostrarInformacion()
    println("Autonomía: ${moto.calcularAutonomia()} km")
}