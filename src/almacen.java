import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class almacen {
        List<producto> inventario;

/* Metodo para iniciar el inventario como una lista basia */
        public almacen() {
            this.inventario = new ArrayList<>();
        }

        /* metodo donde se agrega productos al inventario */
        public void agregarProducto(producto producto) {
            inventario.add(producto);
        }

        /*  para ordenar productos usando collections.store */
        public void ordenarProductos() {
            Collections.sort(inventario, (p1, p2) -> p1.nombre.compareTo(p2.nombre));
        }

        /* este es elmetodo para buscar por nomnbre utilizando busqueda
        * binaria   */
        public producto buscarProducto(String nombre) {
            ordenarProductos();
            int index = Collections.binarySearch(inventario, new producto(nombre, null), (p1, p2) -> p1.nombre.compareTo(p2.nombre));
            return index >= 0 ? inventario.get(index) : null;
        }
    }


