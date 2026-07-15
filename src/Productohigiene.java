// Clase derivada que hereda de Producto y representa productos de higiene.
public class Productohigiene extends Producto {

    private boolean hipoalergenico;

    public Productohigiene(String nombre, String codigo,
                           double precio, int cantidad,
                           boolean hipoalergenico) {

        super(nombre, codigo, precio, cantidad);
        this.hipoalergenico = hipoalergenico;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        if (hipoalergenico) {
            System.out.println("Producto hipoalergénico");
        } else {
            System.out.println("No es hipoalergénico");
        }
    }

    public void mostrarUso() {
        System.out.println("Uso: Higiene del bebé");
    }
}
