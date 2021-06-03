public class Main {
    public static void main(String[] args) {
        Minimarket miMinimarket = new Minimarket("Lider");

        Cargo CargoVendedor = new Cargo("Vendedor");
        Cargo CargoVendedor2 = new Cargo("Vendedor");
        Cargo CargoCajero = new Cargo("Cajero");

        Puesto PuestoAbarrotes = Puesto.ABARROTES;
        Puesto PuestoPanaderia = Puesto.PANADERIA;

        Empleado empleadoJulio = new Empleado("Julio", CargoVendedor, PuestoAbarrotes);
        Empleado empleadoEsteban = new Empleado("Esteban", CargoVendedor2 , PuestoPanaderia);
        Empleado empleadoMario = new Empleado("Mario", CargoCajero, PuestoAbarrotes);
        Empleado empleadoJaime = new Empleado("Jaime", CargoVendedor, PuestoAbarrotes);
        miMinimarket.agregarEmpleado(empleadoJulio);
        miMinimarket.agregarEmpleado(empleadoEsteban);

        //ventas Julio
        empleadoJulio.getCargo().setLista_ventas(2);
        empleadoJulio.getCargo().setLista_ventas(2);
        empleadoJulio.getCargo().setLista_ventas(2);
        empleadoJulio.getCargo().calcularVentas();

        int totalJulio = empleadoJulio.getCargo().getTotal_ventas();
        System.out.println(totalJulio);

        //ventas Esteban
        empleadoEsteban.getCargo().setLista_ventas(3);
        empleadoEsteban.getCargo().setLista_ventas(3);
        empleadoEsteban.getCargo().setLista_ventas(3);
        empleadoEsteban.getCargo().calcularVentas();

        int totalEsteban = empleadoEsteban.getCargo().getTotal_ventas();
        System.out.println(totalEsteban);

        // TOTAL DE VENTA EMPLEADOS
        miMinimarket.calcular_ventas_empleados();
        System.out.println(miMinimarket.getTotal());

    }
}
