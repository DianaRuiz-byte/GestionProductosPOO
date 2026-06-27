/*
 * Clase Producto
 * Representa un producto disponible en el inventario de una tienda.
 * Contiene atributos, un constructor y métodos para mostrar información,
 * calcular el valor del inventario y verificar la disponibilidad.
 */

public class Producto {

    // Atributos
    private String nombre;
    private String codigo;
    private double precio;
    private int cantidad;

    // Constructor
    public Producto(String nombre, String codigo, double precio, int cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método para mostrar la información
    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad disponible: " + cantidad);
    }

    // Método para calcular el valor del inventario
    public double calcularInventario() {
        return precio * cantidad;
    }

    // Método para verificar existencia
    public void verificarExistencia() {

        if (cantidad > 0) {
            System.out.println("Estado: Disponible");
        } else {
            System.out.println("Estado: Agotado");
        }

    }
}
