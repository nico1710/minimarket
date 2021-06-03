import java.util.ArrayList;
import java.util.List;

public class Minimarket {
    private final String nombre_minimarket;
    private List<Empleado> empleados;
    private int total;

    public Minimarket(String nombre_minimarket) {
        this.nombre_minimarket = nombre_minimarket;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public String getNombre_minimarket() {
        return nombre_minimarket;
    }

    public void calcular_ventas_empleados() {
        for (Empleado empleado : empleados) {
            total += empleado.getCargo().getTotal_ventas();
        }
    }

    public int getTotal() {
        return total;
    }
}
