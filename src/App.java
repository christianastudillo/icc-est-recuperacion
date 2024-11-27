import Models.Persona;
import Controllers.PersonaController;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear un arreglo de personas
        Persona[] personas = {
            new Persona("Anais", 25),
            new Persona("Luis", 32),
            new Persona("Carlos", 40),
            new Persona("María", 19),
            new Persona("José", 45),
            new Persona("Laura", 30),
            new Persona("Pedro", 28),
            new Persona("Marta", 35),
            new Persona("Jorge", 50),
            new Persona("Sofía", 22),
            new Persona("Raúl", 18),
            new Persona("Patricia", 29),
            new Persona("Andrés", 41),
            new Persona("Elena", 24),
            new Persona("Manuel", 38),
            new Persona("Isabel", 34),
            new Persona("Gabriel", 42),
            new Persona("Claudia", 26),
            new Persona("Fernando", 31),
            new Persona("Paula", 20),
            new Persona("Diego", 36),
            new Persona("Rosa", 27),
            new Persona("Rubén", 44),
            new Persona("Teresa", 33),
            new Persona("Iván", 17),
            new Persona("Julia", 21),
            new Persona("Adriana", 39),
            new Persona("Sergio", 48),
            new Persona("Lorena", 23),
            new Persona("Miguel", 52)
        };

        PersonaController controller = new PersonaController();
        // Ordenar por edad 
        controller.ordenarPorEdadDescendente(personas);
        System.out.println("Personas ordenadas por edad:");
        for (Persona p : personas) {
            System.out.println(p.getNombre() + " -----> " + p.getEdad());
        }
        // Buscar por edad
        Persona persona = controller.buscarPorEdad(personas, 25);
        if (persona != null) {
            System.out.println("Encontrada persona con edad 25: " + persona.getNombre());
        } else {
            System.out.println("Persona con edad 25 no encontrada.");
        }

        persona = controller.buscarPorEdad(personas, 70);
        if (persona != null) {
            System.out.println("Encontrada persona con edad 70: " + persona.getNombre());
        } else {
            System.out.println("Persona con edad 70 no encontrada.");
        }

        // Ordenar por nombre 
        controller.ordenarPorNombreAscendente(personas);
        System.out.println("\nPersonas ordenadas por nombre:");
        for (Persona p : personas) {
            System.out.println(p.getNombre() + " -----> " + p.getEdad());
        }

        // Buscar por nombre
        persona = controller.buscarPorNombre(personas, "Anais");
        if (persona != null) {
            System.out.println("Encontrada persona con nombre 'Anais': " + persona.getNombre());
        } else {
            System.out.println("Persona con nombre 'Anais' no encontrada.");
        }

        persona = controller.buscarPorNombre(personas, "Miguel");
        if (persona != null) {
            System.out.println("Encontrada persona con nombre 'Miguel': " + persona.getNombre());
        } else {
            System.out.println("Persona con nombre 'Miguel' no encontrada.");
        }
    }
}
