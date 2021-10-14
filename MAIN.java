//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 4

/**
 * Clase MAIN.
 * 
 * @author José Daniel Gómez cabrera
 * @version MAIN Class 1.1
 */
public class MAIN {
    public static void main(String[] args) {
        try{
            Controlador programa = new Controlador();
            programa.Simulador_de_batalla();
        }
        catch(Exception e){
            String s = "Ha ocurrido un error: "+e.getMessage();
            System.out.println(s);
        }
    }
}
