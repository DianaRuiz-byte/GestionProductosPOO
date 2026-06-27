/*
 * Clase Principal
 * Crea objetos de la clase Producto y ejecuta sus métodos.
 */

public class Main {

  public static void main(String[] args) {

    // Crear objetos

    Producto producto1 = new Producto(
            "Mameluco de algodón",
            "NR00",
            347.99,
            8);

    Producto producto2 = new Producto(
            "Biberón Anticólicos",
            "NRB0",
            569.99,
            5);

    Producto producto3 = new Producto(
            "Pañal Reutilizable",
            "PR003",
            249.99,
            0);

    System.out.println("========== PRODUCTO 1 ==========");

    producto1.mostrarInformacion();
    producto1.verificarExistencia();
    System.out.println("Valor del inventario: $" + producto1.calcularInventario());

    System.out.println();

    System.out.println("========== PRODUCTO 2 ==========");

    producto2.mostrarInformacion();
    producto2.verificarExistencia();
    System.out.println("Valor del inventario: $" + producto2.calcularInventario());

    System.out.println();

    System.out.println("========== PRODUCTO 3 ==========");

    producto3.mostrarInformacion();
    producto3.verificarExistencia();
    System.out.println("Valor del inventario: $"+ producto3.calcularInventario());

    System.out.println();

  }

}
