
public class Main {
    public static void main(String[] args) {
        almacen almacen = new almacen();

        almacen.agregarProducto(new producto("ProductoB", "Categoria2"));
        almacen.agregarProducto(new producto("ProductoA", "Categoria1"));
        almacen.agregarProducto(new producto("ProductoC", "Categoria1"));

        /* metodo para buscar el producto */
        producto productoBuscado = almacen.buscarProducto("ProductoA");

        /* condicional para la busqueda */
        if (productoBuscado != null) {
            System.out.println("Producto encontrado: " + productoBuscado.nombre);
        } else {
            System.out.println("Producto no encontrado.");

            /* se creo un almacen el cual agregamos unos productos para poder buscar uno de ellos y mostrar la eficiencia
            * y gestion inteligente que posee*/
        }
    }
}
