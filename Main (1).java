import java.util.ArrayList;
 
import java.util.Scanner; class Producto {
private String codigo; private String nombre; private double precio; private int cantidad;
public Producto(String codigo, String nombre, double precio, int cantidad) { this.codigo = codigo;
this.nombre = nombre; this.precio = precio; this.cantidad = cantidad;
}

public String getCodigo() { return codigo;
}

public void setCantidad(int cantidad) { this.cantidad = cantidad;
}
public double getPrecio() { return precio;
}



public int getCantidad() {
 
return cantidad;

}

@Override

public String toString() {

return "Codigo: " + codigo + ", Nombre: " + nombre + ", Precio: " + String.format("%.2f", precio) + ", Cantidad: " + cantidad;
}

}

class Inventario {

private ArrayList<Producto> productos; public Inventario() {
productos = new ArrayList<>();

}

public void registrarProducto(Producto producto) { productos.add(producto);
}

public boolean actualizarInventario(String codigo, int nuevaCantidad) { for (Producto producto : productos) {
if (producto.getCodigo().equals(codigo)) { producto.setCantidad(nuevaCantidad); return true;
}

}
 
return false;

}

public ArrayList<Producto> consultarProductos() { return productos;
}

public double calcularValorTotal() { double total = 0;
for (Producto producto : productos) {

total += producto.getPrecio() * producto.getCantidad();

}

return total;

}

}

class VistaConsola { private Scanner scanner; public VistaConsola() {
scanner = new Scanner(System.in);
}
public void mostrarMenu() {
System.out.println("\n--- Sistema de Gestion de Inventario ---"); System.out.println("1. Registrar producto"); System.out.println("2. Actualizar inventario"); System.out.println("3. Consultar productos");
 
System.out.println("4. Calcular valor total del inventario"); System.out.println("5. Salir");
}

public int leerOpcion() { System.out.print("Seleccione una opcion: "); int opcion = scanner.nextInt(); scanner.nextLine(); // Limpiar buffer
return opcion;

}

public Producto solicitarDatosProducto() { System.out.print("Ingrese el codigo del producto: "); String codigo = scanner.nextLine(); System.out.print("Ingrese el nombre del producto: "); String nombre = scanner.nextLine(); System.out.print("Ingrese el precio del producto: "); double precio = scanner.nextDouble(); System.out.print("Ingrese la cantidad del producto: "); int cantidad = scanner.nextInt();
scanner.nextLine(); // Limpiar buffer

return new Producto(codigo, nombre, precio, cantidad);

}



public String solicitarCodigo() {
 
System.out.print("Ingrese el codigo del producto: "); return scanner.nextLine();
}

public int solicitarCantidad() { System.out.print("Ingrese la nueva cantidad: "); return scanner.nextInt();
}

public void mostrarProductos(ArrayList<Producto> productos) { if (!productos.isEmpty()) {
System.out.println("\nLista de productos:"); for (Producto producto : productos) {
System.out.println(producto);

}

} else {

System.out.println("\nNo hay productos registrados.");

}

}
public void mostrarValorTotal(double valor) {
System.out.printf("\nEl valor total del inventario es: %.2f\n", valor);
}



public void mostrarMensaje(String mensaje) { System.out.println(mensaje);
 
}

}

class ControladorInventario { private Inventario inventario; private VistaConsola vista; public ControladorInventario() {
inventario = new Inventario(); vista = new VistaConsola();
}

public void iniciar() { while (true) {
vista.mostrarMenu();

int opcion = vista.leerOpcion(); switch (opcion) {
case 1:

Producto producto = vista.solicitarDatosProducto(); inventario.registrarProducto(producto); vista.mostrarMensaje("Producto registrado exitosamente."); break;
case 2:

String codigo = vista.solicitarCodigo(); int cantidad = vista.solicitarCantidad();
if (inventario.actualizarInventario(codigo, cantidad)) {
 
vista.mostrarMensaje("Inventario actualizado exitosamente.");

} else {

vista.mostrarMensaje("Producto no encontrado.");

}

break; case 3:
ArrayList<Producto> productos = inventario.consultarProductos(); vista.mostrarProductos(productos);
break; case 4:
double valorTotal = inventario.calcularValorTotal(); vista.mostrarValorTotal(valorTotal);
break; case 5:
vista.mostrarMensaje("Saliendo del sistema. ¡Adios!"); return;
default:
vista.mostrarMensaje("Opcion invalida. Intente nuevamente.");
}
}

}

}
 
public class Main {

public static void main(String[] args) {

ControladorInventario controlador = new ControladorInventario(); controlador.iniciar();
}

}

