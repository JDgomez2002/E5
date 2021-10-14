//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 5

/**
 * Clase Guerrero.
 * 
 * @author José Daniel Gómez cabrera
 * @version Guerrero Class 1.1
 */
public class Cazador extends Jugador{
    private Mascota mascota;
    
    /**
     * Constructor.
     * 
     * @author José Daniel Gómez cabrera
     * @version Guerrero 1.1
     * @param String nombre
     */
    public Cazador(String nombre){
        super(nombre, 80, 25);
        agregar_item("Trampa de Cazador", 20, 2);
        agregar_item("Red de Cazador", 15, 1);
        this.mascota = new Mascota();
    }
}
