class Automovil(marca: String, modelo: String, capacidadCombustible: Int, val tipo: String) : Vehiculo(marca, modelo, capacidadCombustible) {
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() + 100  // 100 km más que la clase base
    }

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Tipo: $tipo")
    }
}