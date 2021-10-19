//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 5

/**
 * Clase RaidBoss.
 * 
 * @author José Daniel Gómez cabrera
 * @version RaidBoss Class 1.1
 */
public class RaidBoss extends JefeEnemigo{
    private String titulo;

    /**
     * Constructor.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version RaidBoss 1.1
     */
    public RaidBoss(){
        super("RAID BOSS", 500, 100);
        this.titulo = "SUPER MEGA PODEROSO";
    }

    /**
     * clonar RaidBoss.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version clonar 1.1
     * @return String
     */
    public String clonar(){
        String s = "RaidBoss clonado!";
        return s;
    }

    /**
     * variar RaidBoss.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version variar 1.1
     * @return String
     */
    public String variar(){
        String s = "Asignando habilidad especial a los clones!!";
        return s;
    }

    /**
     * liberar RaidBoss.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version liberar 1.1
     * @return String
     */
    public String liberar(){
        String s = "Desaciendose de esos clones inutiles!!";
        return s;
    }

    /**
     * get_titulo RaidBoss.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version get_titulo 1.1
     * @return String
     */
    public String get_titulo(){
        return this.titulo;
    }
}
