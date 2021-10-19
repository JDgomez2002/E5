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
public class Clon extends Acompanante{
    private boolean clon_lanzado;
    private boolean clon_vivo;
    private String habilidad_clon;
   
    /**
     * Constructor
     * 
     * @author José Daniel Gómez Cabrera
     * @version Clon 1.1
     */
    public Clon(String habilidad, String nombre){
        super(nombre, 500, 100);
        this.clon_lanzado = false;
        this.clon_vivo = true;
        this.habilidad_clon = habilidad;
    }
   
    /**
     * metodo para regenerar clon despues de ciertos turnos
     * 
     * @author José Daniel Gómez Cabrera
     * @version regenerar 1.1
     */
    public void regenerar(){
        this.clon_lanzado = false;
    }

    /**
     * metodo para reducir la vida de la mascota
     * 
     * @author José Daniel Gómez Cabrera
     * @version reducir_vida_clon 1.1
     */
    public void reducir_vida_clon(int dano_recibido){
        if(this.vida>0){
            this.vida -= dano_recibido;
        }
        else{
            this.clon_vivo = false;
        }
    }

    /**
     * lanzar clon, definida obligadamente por abstract
     * 
     * @author José Daniel Gómez Cabrera
     * @version lanzarse 1.1
     */
    public String lanzarse(){
        String s = "El clon se ha lanzado!";
        this.clon_lanzado= true;
        return s;
    }

    /**
     * matar clon, definida obligadamente por abstract
     * 
     * @author José Daniel Gómez Cabrera
     * @version morir 1.1
     */
    public String morir(){
        String s = "El clon ha muerto!";
        this.clon_vivo = false;
        return s;
    }

    /**
     * atacar con clon, definida obligadamente por abstract
     * 
     * @author José Daniel Gómez Cabrera
     * @version atacar 1.1
     */
    public String atacar(){
        String s = "El clon esta atacando!";
        return s;
    }

}
