import org.junit.Assert;
import org.junit.Test;

public class TiendaTest {

    @Test
    public void testTiendaRecibo() {
        //AAA
        String recibo = "1 - Pan - 1 Bs\n1 - Fideos - 5 Bs\n1 - Bolsa de Leche - 6 Bs\nTotal 12 Bs.";
        Tienda tienda = new Tienda();

        tienda.agregar(new Producto("Pan", 1));
        tienda.agregar(new Producto("Fideos", 5));
        tienda.agregar(new Producto("Bolsa de Leche", 6));

        String reciboActual = tienda.getRecibo();

        Assert.assertEquals(recibo, reciboActual);
    }

    @Test
    public void testCostoTotalRecibo() {
        //AAA
        int costo = 35;
        Tienda tienda = new Tienda();
        tienda.agregar(new Producto("Pan", 1));
        tienda.agregar(new Producto("Fideos", 5));
        tienda.agregar(new Producto("Bolsa de Leche", 6));
        tienda.agregar(new Producto("Fanta", 13));
        tienda.agregar(new Producto("Tarjeta entel", 10));

        int costoTotal = tienda.getTotal();

        Assert.assertEquals(costo, costoTotal);
    }

    @Test
    public void testReciboConCantidadDeProductos() {
        int costo = 89;
        Tienda tienda = new Tienda();
        tienda.agregar(new Producto("Pan", 1), 5);
        tienda.agregar(new Producto("Fideos", 5), 2);
        tienda.agregar(new Producto("Bolsa de Leche", 6), 3);
        tienda.agregar(new Producto("Fanta", 13), 2);
        tienda.agregar(new Producto("Tarjeta entel", 10), 3);
        int costoTotal = tienda.getTotal();
        Assert.assertEquals(costo, costoTotal);
    }

    @Test
    public void testTiendaReciboConCantidad() {
        //AAA
        String recibo = "5 - Pan - 1 Bs\n3 - Fideos - 5 Bs\n1 - Bolsa de Leche - 6 Bs\nTotal 26 Bs.";
        Tienda tienda = new Tienda();

        tienda.agregar(new Producto("Pan", 1), 5);
        tienda.agregar(new Producto("Fideos", 5), 3);
        tienda.agregar(new Producto("Bolsa de Leche", 6), 1);

        String reciboActual = tienda.getRecibo();

        Assert.assertEquals(recibo, reciboActual);
    }
}
