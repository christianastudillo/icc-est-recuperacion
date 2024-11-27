package Controllers;
import Models.Persona;
public class PersonaController {
    // Ordenar las personas por edad usando el método de selección
    public void ordenarPorEdadDescendente(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < personas.length; j++) {
                if (personas[j].getEdad() > personas[maxIndex].getEdad()) {
                    maxIndex = j;
                }
            }
            Persona temp = personas[i];
            personas[i] = personas[maxIndex];
            personas[maxIndex] = temp;
        }
    }
    // Ordenar las personas por nombre usando el método de inserción
    public void ordenarPorNombreAscendente(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona key = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getNombre().compareTo(key.getNombre()) > 0) {
                personas[j + 1] = personas[j];
                j = j - 1;
            }
            personas[j + 1] = key;
        }
    }
    //Búsqueda binaria por edad 
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int left = 0;
        int right = personas.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (personas[mid].getEdad() == edad) {
                return personas[mid]; 
            }

            if (personas[mid].getEdad() < edad) {
                right = mid - 1; 
            } else {
                left = mid + 1;  
            }
        }
        return null; 
    }

    // Búsqueda binaria por nombre 
    public Persona buscarPorNombre(Persona[] personas, String nombre) {
        int left = 0;
        int right = personas.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = personas[mid].getNombre().compareTo(nombre);
            if (comparison == 0) {
                return personas[mid]; 
            }
            if (comparison < 0) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return null; 
    }
}
