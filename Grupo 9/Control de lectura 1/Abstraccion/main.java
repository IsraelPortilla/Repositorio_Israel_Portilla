public class main {
    public static void main(String[] args) {
        vehiculo miTurismo = new vehiculoturismo("Honda", "Civic", 4);
        vehiculo miDeportivo = new vehiculodeportivo("Ferrari", "F8", 600);

        miTurismo.arrancar();
        miTurismo.mostrarDetalles();

        miDeportivo.arrancar();
        miDeportivo.mostrarDetalles();
    }
}
