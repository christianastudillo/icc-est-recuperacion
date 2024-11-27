package Models;
public class Persona {
    // Atributos privados
    private String nombre; // Nombre de la persona
    private int edad; // Edad de la persona
    /**
     * Constructor para crear una nueva instancia de Persona con un nombre y edad específicos.
     * 
     * @param nombre Nombre de la persona.
     * @param edad   Edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
