public class Empleado {
    private String nombre_empleado;
    private Cargo cargo;
    private Puesto puesto;

    public Empleado(String nombre_empleado, Cargo cargo, Puesto puesto) {
        this.nombre_empleado = nombre_empleado;
        this.cargo = cargo;
        this.puesto = puesto;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
