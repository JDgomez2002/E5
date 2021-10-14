//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 4

/**
 * Clase Controlador.
 * 
 * @author José Daniel Gómez cabrera
 * @version Controlador Class 1.1
 */
public class Controlador {

    /**
     * Metodo para realizar la simulacion de la batalla.
     * 
     * @author José Daniel Gómez cabrera
     * @version Simulador_de_batalla 1.1
     */
    public void Simulador_de_batalla(){
        Vista vista = new Vista();

        vista.bienvenida();
        String nombre = vista.solicitar_nombre();
        int guerrero_o_explorador = vista.solicitar_tipo_jugador();

        CampoBatalla simulacion = new CampoBatalla(guerrero_o_explorador, nombre);
        vista.campo_de_batalla_exitoso();

        boolean continuar = true;
        while(continuar){

            //MOSTRAR COMBATIENTES
            vista.mostrar_combatientes(simulacion.get_info_jugador(), simulacion.get_info_jefe(), simulacion.get_enemigos());

            //ATAQUE DEL JUGADOR
            int[] datos_ataque_jugador = vista.datos_ataque_jugador(simulacion.get_jugador());
            simulacion.ataque_jugador(datos_ataque_jugador[0], datos_ataque_jugador[1], datos_ataque_jugador[2]);
            vista.ataque_exitoso();

            //EVALUAR SI ALGUIEN HA GANADO
            if((simulacion.get_jugador().get_vida())<=0){
                vista.victoria_enemiga();
                continuar = false;
            }
            else if(((simulacion.get_jefe().get_vida())+(simulacion.get_salud_enemigos()))<=0){
                vista.victoria_jugador();
                continuar = false;
            }

            //MOSTRAR COMBATIENTES
            vista.mostrar_combatientes(simulacion.get_info_jugador(), simulacion.get_info_jefe(), simulacion.get_enemigos());

            //ATAQUE DEL ENEMIGO
            int[] datos_ataque_enemigo = vista.datos_ataque_enemigo();
            simulacion.ataque_enemigo(datos_ataque_enemigo[1], datos_ataque_enemigo[2]);
            vista.ataque_exitoso();
            if(datos_ataque_enemigo[0]==1){
                vista.usar_habiliad_enemigo(simulacion.get_habiliad_usada());
            }

            //EVALUAR SI ALGUIEN YA GANO
            if((simulacion.get_jugador().get_vida())<=0){
                vista.victoria_enemiga();
                continuar = false;
            }
            else if(((simulacion.get_jefe().get_vida())+(simulacion.get_salud_enemigos()))<=0){
                vista.victoria_jugador();
                continuar = false;
            }

            //OPCION PARA QUE EL USUARIO FINALICE EL PROGRAMA
            continuar = !(vista.terminar_simulacion());
        }
        vista.despedida();
    }
}
