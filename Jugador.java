//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 4

import java.util.ArrayList;

/**
 * Clase Jugador.
 * 
 * @author José Daniel Gómez cabrera
 * @version Jugador Class 1.1
 */
public class Jugador extends Combatiente{
    protected ArrayList<Item> items = new ArrayList<Item>();

    /**
     * Constructor.
     * 
     * @author José Daniel Gómez Cabrera
     * @version Jugador 1.1
     * @param Propiedades
     */
    public Jugador(String nombre, int vida, int dano){
        super(nombre, vida, dano);
    }

    /**
     * agrega un item a los items del jugador.
     * 
     * @author José Daniel Gómez Cabrera
     * @version agregar_item 1.1
     * @param Propiedades
     */
    public void agregar_item(String nombre_item, int dano_item, int durabilidad){
        Item nuevo_item = new Item(nombre_item, dano_item, durabilidad);
        this.items.add(nuevo_item);
    }

    /**
     * getter de los items.
     * 
     * @author José Daniel Gómez Cabrera
     * @version get_items 1.1
     * @return ArrayList<Item>
     */
    public ArrayList<Item> get_items(){
        return this.items;
    }

    /**
     * getter de dano de un item especifico.
     * 
     * @author José Daniel Gómez Cabrera
     * @version get_dano_item 1.1
     * @param int dano del item
     */
    public int get_dano_item(int indice_item){
        int dano = this.items.get((indice_item-1)).get_dano_item();
        return dano;
    }

    public void set_item(int indice){
        this.items.get(indice).set_durabilidad();
    }
}