//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 5

/**
 * Clase Acompanante.
 * 
 * @author José Daniel Gómez cabrera
 * @version Mascota Class 1.1
 */
public abstract class Acompanante extends Combatiente {

    
    public Acompanante(String nombre, int vida, int ataque){
        super(nombre, vida, ataque);
    }

    public abstract String lanzarse();

    public abstract String morir();

    public abstract String atacar();

}
