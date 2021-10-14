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
public class Mascota extends Combatiente{
    private boolean mascota_lanzada;
    private boolean mascota_viva;
   
    public Mascota(){
        super("Mascotita", 50, 20);
        this.mascota_lanzada = false;
        this.mascota_viva = true;
    }

    public void lanzar_mascota(){
        this.mascota_lanzada = true;
    }
    
    public void regenerar(){
        this.mascota_lanzada = false;
    }

    public void reducir_vida_mascota(int dano_recibido){
        if(this.vida>0){
            this.vida -= dano_recibido;
        }
        else{
            this.mascota_viva = false;
        }
    }

}
