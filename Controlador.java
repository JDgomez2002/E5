//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 5

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

    //RAID
    public void simulador_de_batalla_raid(){
        Vista vista = new Vista();
        try{

            vista.bienvenida();

            String[] nombres = new String[3];
            int[] tipo_jugadores = new int[3];

            nombres[0] = vista.solicitar_nombre(1);
            tipo_jugadores[0] = vista.solicitar_tipo_jugador();

            nombres[1] = vista.solicitar_nombre(2);
            tipo_jugadores[1] = vista.solicitar_tipo_jugador();

            nombres[2] = vista.solicitar_nombre(3);
            tipo_jugadores[2] = vista.solicitar_tipo_jugador();

            CampoBatalla simulacion_raid = new CampoBatalla(tipo_jugadores, nombres);
            vista.campo_de_batalla_exitoso();

            boolean continuar_raid = true;

            while(continuar_raid){
                //Evaluar si algun bando ya gano
                if(simulacion_raid.get_vida_total_jugadores_raid()<=0){
                    vista.victoria_enemiga();
                    continuar_raid = false;
                }
                else if(simulacion_raid.get_vida_total_enemigos_raid()<=0){
                    vista.victoria_jugadores();
                    continuar_raid = false;
                }

                //mostrar combatientes en el campo de batalla
                vista.mostrar_combatientes_raid(simulacion_raid.get_jugadores_raid(), simulacion_raid.get_raid_boss_raid(), simulacion_raid.get_jefe_raid(), simulacion_raid.get_enemigos_raid(), simulacion_raid.get_clones_raid());

                //Ataque jugadores
                vista.turno_jugadores();

                vista.ataque_jugadores_raid(1);
                int[] datos_ataque_jugador_1 = vista.datos_ataque_jugador_raid();
                simulacion_raid.ataque_jugador_raid(0, datos_ataque_jugador_1[0], datos_ataque_jugador_1[1]);
                vista.ataque_exitoso();

                vista.ataque_jugadores_raid(2);
                int[] datos_ataque_jugador_2 = vista.datos_ataque_jugador_raid();
                simulacion_raid.ataque_jugador_raid(1, datos_ataque_jugador_2[0], datos_ataque_jugador_2[1]);
                vista.ataque_exitoso();

                vista.ataque_jugadores_raid(3);
                int[] datos_ataque_jugador_3 = vista.datos_ataque_jugador_raid();
                simulacion_raid.ataque_jugador_raid(2, datos_ataque_jugador_3[0], datos_ataque_jugador_3[1]);
                vista.ataque_exitoso();

                //Ataque de enemigos
                vista.turno_enemigo();

                int jugador_objetivo = vista.solicitar_jugador_objetivo_raid();
                simulacion_raid.ataque_enemigo_raid(jugador_objetivo);
                vista.ataque_exitoso();

                //clonar raidboss
                boolean clonar_raidBoss = vista.clonar_o_no_clonar();
                if(clonar_raidBoss){
                    String habilidad = vista.solicitar_nombre_habilidad();
                    simulacion_raid.clonar_raid_boss(habilidad);
                    vista.clonacion_exitosa();
                }

                //Evaluar si algun bando ya gano
                if(simulacion_raid.get_vida_total_jugadores_raid()<=0){
                    vista.victoria_enemiga();
                    continuar_raid = false;
                }
                else if(simulacion_raid.get_vida_total_enemigos_raid()<=0){
                    vista.victoria_jugadores();
                    continuar_raid = false;
                }

                //OPCION PARA QUE EL USUARIO FINALICE EL PROGRAMA
                continuar_raid = !(vista.terminar_simulacion());
            }
        }
        catch(Exception e){
            String s = "- Ha ocurrido un error en el simulador RAID: "+e.getMessage();
            System.out.println(s);
        }
        vista.despedida();
    }
}
