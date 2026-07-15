//Clase derivada que hereda de Producto y representa productos para bebé.
public class Productobebe extends Producto {

    private String edadRecomendada;

    public Productobebe(String nombre, String codigo,
                        double precio, int cantidad,
                        String edadRecomendada) {

        super(nombre, codigo, precio, cantidad);
        this.edadRecomendada = edadRecomendada;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();
        System.out.println("Edad recomendada: " + edadRecomendada);
    }

    public void mostrarCategoria() {
        System.out.println("Categoría: Producto para bebé");
    }
}

