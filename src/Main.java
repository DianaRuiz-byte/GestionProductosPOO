/*
 * Clase Principal
 * Crea objetos de la clase Producto y ejecuta sus métodos.
 */

public class Main {

  public static void main(String[] args) {

    // Crear objetos de las clases derivadas

    Productobebe producto1 = new Productobebe(
            "Mameluco de algodón",
            "NR001",
            347.99,
            8,
            "0 a 6 meses");

    Productobebe producto2 = new Productobebe(
            "Biberón Anticólicos",
            "NRB001",
            569.99,
            5,
            "0 a 12 meses");

    Productohigiene producto3 = new Productohigiene(
            "Pañal Reutilizable",
            "PH001",
            249.99,
            0,
            true);

    Productohigiene producto4 = new Productohigiene(
            "Shampoo para bebé",
            "SH001",
            189.99,
            12,
            true);

    System.out.println("========== PRODUCTO 1 ==========");
    producto1.mostrarInformacion();
    producto1.verificarExistencia();
    producto1.mostrarCategoria();
    System.out.println("Valor del inventario: $" + producto1.calcularInventario());

    System.out.println();

    System.out.println("========== PRODUCTO 2 ==========");
    producto2.mostrarInformacion();
    producto2.verificarExistencia();
    producto2.mostrarCategoria();
    System.out.println("Valor del inventario: $" + producto2.calcularInventario());

    System.out.println();

    System.out.println("========== PRODUCTO 3 ==========");
    producto3.mostrarInformacion();
    producto3.verificarExistencia();
    producto3.mostrarUso();
    System.out.println("Valor del inventario: $" + producto3.calcularInventario());

    System.out.println();

    System.out.println("========== PRODUCTO 4 ==========");
    producto4.mostrarInformacion();
    producto4.verificarExistencia();
    producto4.mostrarUso();
    System.out.println("Valor del inventario: $" + producto4.calcularInventario());
  }

}