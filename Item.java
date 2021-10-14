//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 4

/**
 * Clase Item.
 * 
 * @author José Daniel Gómez cabrera
 * @version Item Class 1.1
 */
public class Item {
    private String nombre_item;
    private int dano_item;
    private int durabilidad_item;

    /**
     * Constructor.
     * 
     * @author José Daniel Gómez Cabrera
     * @version Item 1.1
     * @param Propiedades
     */
    public Item(String nombre_item, int dano_item, int durabilidad){
        this.nombre_item = nombre_item;
        this.dano_item = dano_item;
        this.durabilidad_item = durabilidad;
    }

    /**
     * setter de la durabilidad del item.
     * 
     * @author José Daniel Gómez Cabrera
     * @version set_durabilidad 1.1
     */
    public void set_durabilidad(){
        this.durabilidad_item -= 1;
    }

    /**
     * getter del nombre del item.
     * 
     * @author José Daniel Gómez Cabrera
     * @version get_nombre_item 1.1
     * @return String
     */
    public String get_nombre_item(){
        return this.nombre_item;
    }

    /**
     * getter del dano del item.
     * 
     * @author José Daniel Gómez Cabrera
     * @version get_dano_item 1.1
     * @return int
     */
    public int get_dano_item(){
        return this.dano_item;
    }

    /**
     * getter de durabilidad del item.
     * 
     * @author José Daniel Gómez Cabrera
     * @version get_durabilidad_item 1.1
     * @return int
     */
    public int get_durabilidad_item(){
        return this.durabilidad_item;
    }
}
