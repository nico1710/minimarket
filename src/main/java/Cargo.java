import java.util.ArrayList;
import java.util.List;

public class Cargo {
    private String nombre_cargo;
    private int numero_ventas;
    private int total_ventas;
    private List<Integer> lista_ventas;

    public Cargo(String nombre_cargo) {
        this.nombre_cargo = nombre_cargo;
        this.lista_ventas= new ArrayList<Integer>();
    }

    public void setNombre_cargo(int numer_ventas) {
        this.numero_ventas = numer_ventas;
    }

    public void setLista_ventas(Integer venta) {
        lista_ventas.add(venta);
    }

    public void calcularVentas() {
        for(Integer venta : lista_ventas) {
            total_ventas += venta;
        }
    }

    public int getTotal_ventas() {
        return total_ventas;
    }
}
