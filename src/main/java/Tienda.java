import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Producto> listaProductos =  new ArrayList<>();
    public void agregar(Producto producto) {
        System.out.println("agregando producto a compra");
       listaProductos.add(producto);

    }

    public void agregar(Producto producto, int cantidad) {

            System.out.println(String.format("Agregando %s, %s vez", producto.getNombre(), cantidad));
            producto.setCantidad(cantidad);
            listaProductos.add(producto);

    }

    public String getRecibo() {
        StringBuilder sb = new StringBuilder();
        for (Producto producto: listaProductos) {
            sb.append(String.format("%s - %s - %s Bs\n", producto.getCantidad(), producto.getNombre(), producto.getCosto()));
        }
        sb.append(String.format("Total %s Bs.", getTotal()));

        return sb.toString() ;
    }

    public int getTotal() {
        int total = 0;
        for (Producto producto: listaProductos) {
              total = total + (producto.getCosto()* producto.getCantidad());
        }
        return total;
    }
}
