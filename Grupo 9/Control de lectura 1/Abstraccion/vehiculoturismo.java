public class vehiculoturismo extends vehiculo {
    public int puertas;
    
    public vehiculoturismo(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Vehículo Turismo - Marca: " + marca + ", Modelo: " + modelo + ", Puertas: " + puertas);
    }
}
