//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 4

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalTime;

/**
 * Clase Vista.
 * 
 * @author José Daniel Gómez cabrera
 * @version Vista Class 1.1
 */
public class Vista{
    private Scanner scan = new Scanner(System.in);

    /**
     * Bienvenida para el usuario.
     * 
     * @author José Daniel Gómez Cabrera
     * @version bienvenida 1.1
     */
    public void bienvenida(){
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("- BIENVENIDO");
        System.out.println("- Hora: "+LocalTime.now().getHour()+" horas con "+LocalTime.now().getMinute()+" minutos.");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("- Este es el Simulador de BATALLA.");
        System.out.println("- Este programa le permitira simular la batalla de un juego de roll.");
        System.out.println("- Puede elegir entre ser Explorador o Guerrero.");
        System.out.println("- Por favor siga las instrucciones del programa.");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("- El Explorador posee poca vida pero muchos items.");
        System.out.println("- El Guerrero posee mas vida pero pocos items.");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("- QUE COMIENCE LA BATALLA.");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    /**
     * solicita opcion de elegir Guerrero o Explorador.
     * 
     * @author José Daniel Gómez Cabrera
     * @version solicitar_tipo_jugador 1.1
     * @return int
     */
    public int solicitar_tipo_jugador(){
        boolean continuar = true;
        int opcion = 0;
        while(continuar){
            try{
                System.out.println("\tIngrese 1 si desea ser Guerrero...");
                System.out.println("\tIngrese 2 si desea ser Explorador...");
                System.out.print("\t\tIngrese su decision: ");
                opcion = scan.nextInt();
                if((opcion>0)&&(opcion<3)){
                    if(opcion==1){
                        System.out.println();
                        System.out.println("- EUREKA: Ha elegido ser Guerrero, tienes mucha vida pero pocos items...");
                        System.out.println();
                    }
                    else{
                        System.out.println();
                        System.out.println("- EUREKA: Ha elegido ser Explorador, tienes muchos items pero poca vida...");
                        System.out.println();
                    }
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    continuar = false;
                }
                else{
                System.out.println();
                System.out.println("\t\tERROR: debe ingresar 1 o 2.");
                System.out.println();
                }
                
            }
            catch(Exception e){
                System.out.println();
                System.out.println("\t\tERROR: debe ingresar 1 o 2.");
                System.out.println();
                scan.next();
            }
        }
        return opcion;
    }

    /**
     * solicita nombre del Guerrero o Explorador.
     * 
     * @author José Daniel Gómez Cabrera
     * @version solicitar_nombre 1.1
     * @return String
     */
    public String solicitar_nombre(){
        String nombre = "";
        boolean continuar = true;
        while(continuar){
            try {
                System.out.println();
                System.out.print(" - Ingrese el nombre de su AVATAR: ");
                nombre = scan.nextLine();
                if(nombre.equals("")){
                    System.out.println();
                    System.out.println("\t\tError: debe de ingresar un nombre...");
                    System.out.println();
                }
                else{
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    continuar = false;
                }
            } 
            catch (Exception e) {
                System.out.println();
                System.out.println("\t\tError: debe de ingresar un nombre...");
                System.out.println();
            }
        }
        return nombre;
    }

    /**
     * Metodo de Mensaje para el usuario.
     * 
     * @author José Daniel Gómez Cabrera
     * @version campo_de_batalla_exitoso 1.1
     */
    public void campo_de_batalla_exitoso(){
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("- CAMPO DE BATALLA CREADO EXITOSAMENTE...");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("- Este es un juego por turnos...");
        System.out.println("- Primero siempre sera turno del jugador, y luego el turno del enemigo.");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    /**
     * Metodo de Mensaje para el usuario.
     * 
     * @author José Daniel Gómez Cabrera
     * @version mostrar_combatientes 1.1
     * @param String[], String[], ArrayList<Enemigo>
     */
    public void mostrar_combatientes(String[] info_jugador, String[] info_jefe, ArrayList<Enemigo> enemigos){
        System.out.println();
        System.out.println("---- CAMPO DE BATALLA ----");
        System.out.println("- Jugador:");
        System.out.println("\t\tNombre: "+info_jugador[0]);
        System.out.println("\t\tVida: "+info_jugador[1]);
        System.out.println("\t\tAtaque: "+info_jugador[2]);
        System.out.println("- Jefe:");
        System.out.println("\t\tNombre: "+info_jefe[0]);
        System.out.println("\t\tVida: "+info_jefe[1]);
        System.out.println("\t\tAtaque: "+info_jefe[2]);
        for(int k = 0; k<enemigos.size(); k++){
            System.out.println("- Enemigo "+(k+1)+":");
            System.out.println("\t\tTipo: "+enemigos.get(k).get_tipo_enemigo());
            System.out.println("\t\tVida: "+enemigos.get(k).get_vida());
            System.out.println("\t\tAtaque: "+enemigos.get(k).get_poder_ataque());
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    /**
     * Obtiene datos para poder hacer el ataque del jugador
     * 
     * @author José Daniel Gómez Cabrera
     * @version datos_ataque_jugador 1.1
     * @param Jugador
     * @return int[]
     */
    public int[] datos_ataque_jugador(Jugador jugador){
        System.out.println();
        System.out.println("--- TURNO DEL JUGADOR ---");
        System.out.println("- Es turno del jugador.");
        System.out.println("- Debes de ingresar el numero de item que deseas usar, si deseas usar uno.");
        System.out.println("- Tambien elige a que tipo de enemigo quieres atacar.");
        System.out.println("- Finalmente, si deseas atacar a un enemigo normal, digita su numero.");

        ArrayList<Item> items = jugador.get_items();

        int[] datos = new int[3];
        for(int k = 0; k<3; k++){
            boolean continuar = true;
            while(continuar){
                try{
                    if(k==0){
                        mostrar_items(items);
                        System.out.println("Si no desea usar un item, digite 0.");
                        System.out.print("Digite el numero de item que desea usar:");
                        int item = scan.nextInt();
                        if((item>=0)&&(item<=items.size())){
                            item -= 1;
                            datos[0] = item;
                            continuar = false;
                        }
                        else{
                            System.out.println("- Error, siga las instrucciones...");
                        }
                    }
                    if(k==1){
                        System.out.println();
                        System.out.println("- Digite 1 para elegir al Jefe como objetivo.");
                        System.out.println("- Digite 2 para elegir elegir a un enemigo comun.");
                        System.out.print("\t\tDigite su decision: ");
                        int tipo_enemigo = scan.nextInt();
                        if((tipo_enemigo>0)&&(tipo_enemigo<3)){
                            datos[1] = tipo_enemigo;
                            continuar = false;
                        }
                        else{
                            System.out.println("- Error, siga las instrucciones...");
                        }
                    }
                    if(k==2){
                        System.out.println();
                        System.out.println("- Digite el numero de enemigo comun que desea atacar.");
                        System.out.println("- Si eligio un jefe, simplemente digite 0.");
                        int indice_enemigo = scan.nextInt();
                        if((indice_enemigo>=0)&&(indice_enemigo<4)){
                            indice_enemigo -= 1;
                            datos[2] = indice_enemigo;
                            continuar = false;
                        }
                        else{
                            System.out.println("- Error, siga las instrucciones...");
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("- Error, siga las instrucciones...");
                }
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        return datos;
    }

    /**
     * Muestra los items del jugador
     * 
     * @author José Daniel Gómez Cabrera
     * @version mostrar_items 1.1
     * @param ArrayList<Item>
     */
    public void mostrar_items(ArrayList<Item> items){
        for(int i = 0; i<items.size(); i++){
            System.out.println();
            System.out.println("- Item "+(i+1)+":");
            System.out.println("\t\tNombre: "+items.get(i).get_nombre_item());
            System.out.println("\t\tDano: "+items.get(i).get_dano_item());
            System.out.println("\t\tUsos Restantes: "+items.get(i).get_durabilidad_item());
            System.out.println();
        }
    }

    /**
     * metodo para evaluar si el usuario desea finalizar la batalla.
     * 
     * @author José Daniel Gómez Cabrera
     * @version terminar_simulacion 1.1
     * @return boolean
     */
    public boolean terminar_simulacion(){
        System.out.println(" Desea terminar la simulacion?");
        boolean terminar = false;
        boolean continuar = true;
        int opcion = 1;
        while(continuar){
            try{
            System.out.print("\t\tSi desea terminarla digite 0.");
            opcion = scan.nextInt();
            continuar = false;
            }
            catch(Exception e){
                System.out.println("- Error: digite un numero entero.");
            }
        }
        if(opcion==0){
            terminar = true;
        }
        return terminar;
    }

    /**
     * metodo mostrar un mensaje al usuario
     * 
     * @author José Daniel Gómez Cabrera
     * @version ataque_exitoso 1.1
     */
    public void ataque_exitoso(){
        System.out.println();
        System.out.println("- Atque exitoso!!");
        System.out.println();
    }

    /**
     * metodo para obtener los datos para el ataque del enemigo.
     * 
     * @author José Daniel Gómez Cabrera
     * @version datos_ataque_enemigo 1.1
     * @return int[]
     */
    public int[] datos_ataque_enemigo(){
        System.out.println();
        System.out.println("--- TURNO DEL ENEMIGO ---");
        System.out.println("- Es turno del enemigo.");
        System.out.println("- Elige el tipo de enemigo atacante.");
        System.out.println("- Elige el numero de enemigo comun atacante.");
        System.out.println("- Elige utilizar la habiliad especial.");

        int[] datos = new int[3];
        for(int k = 0; k<3; k++){
            boolean continuar = true;
            while(continuar){
                try{
                    if(k==0){
                        System.out.print("Digita 1 si deseas utilizar la habilidad Especial.");
                        int habilidad = scan.nextInt();
                        datos[0] = habilidad;
                        continuar = false;
                    }
                    if(k==1){
                        System.out.println();
                        System.out.println("- Digite 1 para elegir al Jefe como atacante.");
                        System.out.println("- Digite 2 para elegir elegir a un enemigo comun como atacante.");
                        System.out.print("\t\tDigite su decision: ");
                        int tipo_enemigo = scan.nextInt();
                        if((tipo_enemigo>0)&&(tipo_enemigo<3)){
                            datos[1] = tipo_enemigo;
                            continuar = false;
                        }
                        else{
                            System.out.println("- Error, siga las instrucciones...");
                            System.out.println();
                        }
                    }
                    if(k==2){
                        System.out.println();
                        System.out.println("- Digite el numero de enemigo comun que desea como atacante.");
                        System.out.println("- Si eligio un jefe, simplemente digite 0.");
                        int indice_enemigo = scan.nextInt();
                        if((indice_enemigo>=0)&&(indice_enemigo<4)){
                            indice_enemigo -= 1;
                            datos[2] = indice_enemigo;
                            continuar = false;
                        }
                        else{
                            System.out.println("- Error, siga las instrucciones...");
                            System.out.println();
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("- Error, siga las instrucciones...");
                    System.out.println();
                }
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        return datos;
    }

    /**
     * metodo para mostrar un mensaje al usuario.
     * 
     * @author José Daniel Gómez Cabrera
     * @version usar_habiliad_enemigo 1.1
     */
    public void usar_habiliad_enemigo(String habilidad){
        System.out.println();
        System.out.println("- USANDO HABILIAD...");
        System.out.println(habilidad);
        System.out.println();
    }

    /**
     * metodo para mostrar un mensaje al usuario.
     * 
     * @author José Daniel Gómez Cabrera
     * @version victoria_jugador 1.1
     */
    public void victoria_jugador(){
        System.out.println();
        System.out.println("- Victoria para el Jugador!");
        System.out.println(" - Los enemigos pierden...");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    /**
     * metodo para mostrar un mensaje al usuario.
     * 
     * @author José Daniel Gómez Cabrera
     * @version victoria_enemiga 1.1
     */
    public void victoria_enemiga(){
        System.out.println();
        System.out.println("- Victoria para los enemigos!");
        System.out.println(" - el jugador pierde...");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    /**
     * metodo para despedirse del usuario.
     * 
     * @author José Daniel Gómez Cabrera
     * @version despedida 1.1
     */
    public void despedida(){
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("- MUCHAS GRACIAS POR USAR EL SIMULADOR...");
        System.out.println("Esperamos que vuelvas pronto!");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}