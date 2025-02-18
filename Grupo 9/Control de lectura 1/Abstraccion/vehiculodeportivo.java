class vehiculodeportivo extends vehiculo {
    public int cilindrada;
    
    public vehiculodeportivo(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Vehículo Deportivo - Marca: " + marca + ", Modelo: " + modelo + ", Cilindrada: " + cilindrada + "cc");
    }
}
