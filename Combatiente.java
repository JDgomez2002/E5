//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 4

/**
 * Clase Combatiente.
 * 
 * @author José Daniel Gómez cabrera
 * @version Combatiente Class 1.1
 */
public class Combatiente{
    protected String nombre;
    protected int vida;
    protected int poder_ataque;

    /**
     * Constructor.
     * 
     * @author José Daniel Gómez Cabrera
     * @version Combatiente 1.1
     * @param Propiedades
     */
    public Combatiente(String nombre, int vida, int ataque){
        this.nombre = nombre;
        this.vida = vida;
        this.poder_ataque = ataque;
    }

    /**
     * getter de poder de ataque.
     * 
     * @author José Daniel Gómez Cabrera
     * @version get_poder_ataque 1.1
     * @return int
     */
    public int get_poder_ataque(){
        return this.poder_ataque;
    }

    /**
     * getter de vida.
     * 
     * @author José Daniel Gómez Cabrera
     * @version get_vida 1.1
     * @return int
     */
    public int get_vida(){
        return this.vida;
    }

    /**
     * setter de vida.
     * 
     * @author José Daniel Gómez Cabrera
     * @version set_vida 1.1
     * @param int
     */
    public void set_vida(int dano_recibido){
        this.vida -= dano_recibido;
    }

    /**
     * getter de String para la vista.
     * 
     * @author José Daniel Gómez Cabrera
     * @version info_combatiente 1.1
     * @param String[]
     */
    public String[] info_combatiente(){
        String[] info_combatiente = new String[3];
        info_combatiente[0] = this.nombre;
        info_combatiente[1] = Integer.toString(this.vida);
        info_combatiente[2] = Integer.toString(this.poder_ataque);
        return info_combatiente;
    }
}
