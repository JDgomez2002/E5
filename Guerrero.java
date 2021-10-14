//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 4

/**
 * Clase Guerrero.
 * 
 * @author José Daniel Gómez cabrera
 * @version Guerrero Class 1.1
 */
public class Guerrero extends Jugador{
    
    /**
     * Constructor.
     * 
     * @author José Daniel Gómez cabrera
     * @version Guerrero 1.1
     * @param String nombre
     */
    public Guerrero(String nombre){
        super(nombre, 200, 30);
        agregar_item("Espada", 20, 2);
        agregar_item("Lanza", 15, 1);
    }
}
