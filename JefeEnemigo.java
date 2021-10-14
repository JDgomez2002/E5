//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 4

/**
 * Clase JefeEnemigo.
 * 
 * @author José Daniel Gómez cabrera
 * @version JefeEnemigo Class 1.1
 */
public class JefeEnemigo extends Enemigo{
    private String habilidad_especial_2;

    /**
     * Constructor.
     * 
     * @author José Daniel Gómez Cabrera
     * @version JefeEnemigo 1.1
     * @param Propiedades
     */
    public JefeEnemigo(String nombre, int vida, int dano){
        super(nombre, vida, dano);
        if(this.tipo_enemigo.equals("TROLL")){
            this.tipo_enemigo = "JEFE TROLL";
            this.habilidad_especial_2 = "Usando super martillo de TROLL, todos los jugadores son afectados por un terremoto corto...";
        }
        else{
            this.tipo_enemigo = "JEFE DUENDE";
            this.habilidad_especial_2 = "Usando super magia de DUENDE, todos los jugadores tienen visiones que los distraen...";
        }
    }

    /**
     * getter de habilidad especial 2.
     * 
     * @author José Daniel Gómez Cabrera
     * @version usar_habilidad_especial_2 1.1
     * @return String
     */
    public String usar_habilidad_especial_2(){
        return this.habilidad_especial_2;
    }
}
