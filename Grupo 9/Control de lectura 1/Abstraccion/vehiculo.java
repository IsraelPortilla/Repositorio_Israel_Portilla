public abstract class vehiculo {
    public String marca;
    public String modelo;
    
    public vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public abstract void mostrarDetalles();
    public void arrancar() {
        System.out.println("El vehículo está arrancando...");
    }
}