//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 4

/**
 * Clase Explorador.
 * 
 * @author José Daniel Gómez cabrera
 * @version Explorador Class 1.1
 */
public class Explorador extends Jugador{
    
    /**
     * Constructor.
     * 
     * @author José Daniel Gómez cabrera
     * @version Explorador 1.1
     * @param String nombre
     */
    public Explorador(String nombre){
        super(nombre, 100, 30);
        agregar_item("Trampa", 20, 1);
        agregar_item("Onda", 10, 1);
        agregar_item("Arco y Flecha", 30, 3);
        agregar_item("Catana", 25, 1);
    }
}
