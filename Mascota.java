//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 5

/**
 * Clase Mascota.
 * 
 * @author José Daniel Gómez cabrera
 * @version Mascota Class 1.1
 */
public class Mascota extends Acompanante{
    private boolean mascota_lanzada;
    private boolean mascota_viva;
   
    /**
     * Constructor
     * 
     * @author José Daniel Gómez Cabrera
     * @version Mascota 1.1
     */
    public Mascota(){
        super("Mascotita", 50, 20);
        this.mascota_lanzada = false;
        this.mascota_viva = true;
    }
   
    /**
     * metodo para regenerar mascota despues de ciertos turnos
     * 
     * @author José Daniel Gómez Cabrera
     * @version regenerar 1.1
     */
    public void regenerar(){
        this.mascota_lanzada = false;
    }

    /**
     * metodo para reducir la vida de la mascota
     * 
     * @author José Daniel Gómez Cabrera
     * @version reducir_vida_mascota 1.1
     */
    public void reducir_vida_mascota(int dano_recibido){
        if(this.vida>0){
            this.vida -= dano_recibido;
        }
        else{
            this.mascota_viva = false;
        }
    }

    /**
     * lanzar mascota, definida obligadamente por abstract
     * 
     * @author José Daniel Gómez Cabrera
     * @version lanzarse 1.1
     */
    public String lanzarse(){
        String s = "La mascota se ha lanzado!";
        this.mascota_lanzada = true;
        return s;
    }

    /**
     * matar mascota, definida obligadamente por abstract
     * 
     * @author José Daniel Gómez Cabrera
     * @version morir 1.1
     */
    public String morir(){
        String s = "La mascota ha muerto!";
        this.mascota_viva = false;
        return s;
    }

    /**
     * atacar con mascota, definida obligadamente por abstract
     * 
     * @author José Daniel Gómez Cabrera
     * @version atacar 1.1
     */
    public String atacar(){
        String s = "La mascota esta atacando!";
        return s;
    }

}
