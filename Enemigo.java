//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 4

import java.util.Random;

/**
 * Clase Enemigo.
 * 
 * @author José Daniel Gómez cabrera
 * @version Enemigo Class 1.1
 */
public class Enemigo extends Combatiente {
    private Random rand = new Random();
    protected String tipo_enemigo;
    protected String habilidad_especial_1;

    /**
     * Constructor.
     * 
     * @author José Daniel Gómez Cabrera
     * @version Enemigo 1.1
     * @param Propiedades
     */
    public Enemigo(String nombre, int vida, int dano){
        super(nombre, vida, dano);
        float enemigo_random = (rand.nextFloat())*2;
        if(enemigo_random<1){
            this.tipo_enemigo = "TROLL";
            this.habilidad_especial_1 = "Usando espada de TROLL, todos los jugadores reciben perdida de sangre...";
        }
        else{
            this.tipo_enemigo = "DUENDE";
            this.habilidad_especial_1 = "Usando magia de DUENDE, todos los jugadores reciben perdida de vision...";
        }
    }

    /**
     * getter de habilidad.
     * 
     * @author José Daniel Gómez Cabrera
     * @version usar_habilidad 1.1
     * @return String
     */
    public String usar_habilidad(){
        return this.habilidad_especial_1;
    }

    /**
     * getter de tipo de enemigo.
     * 
     * @author José Daniel Gómez Cabrera
     * @version get_tipo_enemigo 1.1
     * @return String
     */
    public String get_tipo_enemigo(){
        return this.tipo_enemigo;
    }
}