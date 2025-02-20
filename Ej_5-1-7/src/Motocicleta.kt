class Motocicleta(marca: String, modelo: String, capacidadCombustible: Int, val cilindrada: Int) : Vehiculo(marca, modelo, capacidadCombustible) {
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() - 40  // 40 km menos que la clase base
    }

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Cilindrada: ${cilindrada}cc")
    }
}