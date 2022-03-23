package es.iespuerto.principal;

public class Nathan {
    String nombre;
    String apellido1;
    String apellido2;

    /**
     * Constructor por defecto de la clase
     */
    public Nathan() {}

    /**
     * Constructor con 1 parametro
     * @param nombre de la clase
     */
    public Nathan(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor con 2 parametros
     * @param nombre de la clase
     * @param apellido1 de la clase
     */
    public Nathan(String nombre, String apellido1) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
    }

    /**
     * CVonstructor con 3 parametros
     * @param nombre de la clase
     * @param apellido1 de la clase
     * @param apellido2 de la clase
     */
    public Nathan(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    /**
     * Metodo que valida el nombre completo de una persona
     * @param nombre de la persona
     * @param apellido1 de la persona
     * @param apellido2 de la persona
     * @return el nombre de la persona validado
     */
    String  ValidarNombre(String nombre,String apellido1, String apellido2){
        return nombre + " " + apellido1 + " " + apellido2;
    }
}
