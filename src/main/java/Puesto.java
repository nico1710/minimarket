public enum Puesto {
    ABARROTES("Abarrotes"),
    PANADERIA("Panaderia"),
    CONGELADO("Congelado");

    private String nombre_puesto;

    private Puesto(String nombre_puesto) {
        this.nombre_puesto = nombre_puesto;
    }

    public String getNombre_puesto(){
        return nombre_puesto;
    }
}
