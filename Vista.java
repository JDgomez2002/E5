//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 5

import java.util.ArrayList;
import java.util.Scanner;

import javax.security.sasl.AuthorizeCallback;

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
        System.out.println("- Este es el Simulador de BATALLA RAID.");
        System.out.println("- Este programa le permitira simular la batalla de un juego de roll.");
        System.out.println("- Puede elegir entre ser Explorador, Guerrero o Cazador.");
        System.out.println("- Por favor siga las instrucciones del programa.");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("- El Explorador posee poca vida pero muchos items.");
        System.out.println("- El Guerrero posee mas vida pero pocos items.");
        System.out.println("- El cazador posee la habilidad de convocar y lanzar mascotas.");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("- QUE COMIENCE LA BATALLA RAID.");
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
                System.out.println("\tIngrese 3 si desea ser Cazador...");
                System.out.print("\t\tIngrese su decision: ");
                opcion = scan.nextInt();
                if((opcion>0)&&(opcion<4)){
                    if(opcion==1){
                        System.out.println();
                        System.out.println("- EUREKA: Ha elegido ser Guerrero, tienes mucha vida pero pocos items...");
                        System.out.println();
                    }
                    else if(opcion==2){
                        System.out.println();
                        System.out.println("- EUREKA: Ha elegido ser Explorador, tienes muchos items pero poca vida...");
                        System.out.println();
                    }
                    else{
                        System.out.println();
                        System.out.println("- EUREKA: Ha elegido ser Cazador, tienes mascotas para lanzar y atacar...");
                        System.out.println();
                    }
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    continuar = false;
                }
                else{
                System.out.println();
                System.out.println("\t\tERROR: debe ingresar 1, 2 o 3.");
                System.out.println();
                }
                
            }
            catch(Exception e){
                System.out.println();
                System.out.println("\t\tERROR: debe ingresar 1, 2 o 3.");
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
                scan = new Scanner(System.in);
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
     * solicita nombre del Guerrero o Explorador.
     * 
     * @author José Daniel Gómez Cabrera
     * @version solicitar_nombre 1.1
     * @return String
     */
    public String solicitar_nombre(int numero){
        String nombre = "";
        boolean continuar = true;
        while(continuar){
            try {
                System.out.println();
                System.out.print(" - Ingrese el nombre de su AVATAR numero "+numero+": ");
                scan = new Scanner(System.in);
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
        System.out.println("- Primero siempre sera turno de los jugadores, y luego el turno del RaidBoss.");
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
     * Metodo de Mensaje para el usuario.
     * 
     * @author José Daniel Gómez Cabrera
     * @version mostrar_combatientes 1.1
     * @param String[], String[], ArrayList<Enemigo>
     */
    public void mostrar_combatientes_raid(Jugador[] jugadores, RaidBoss jefe_raid, JefeEnemigo jefe, ArrayList<Enemigo> enemigos, ArrayList<Clon> clones){
        System.out.println();
        System.out.println("---- CAMPO DE BATALLA ----");
        System.out.println();
        System.out.println("- Jugador 1");
        System.out.println("\t\tNombre: "+jugadores[0].get_nombre());
        System.out.println("\t\tVida: "+jugadores[0].get_vida());
        System.out.println("\t\tAtaque: "+jugadores[0].get_poder_ataque());
        System.out.println("- Jugador 2");
        System.out.println("\t\tNombre: "+jugadores[1].get_nombre());
        System.out.println("\t\tVida: "+jugadores[1].get_vida());
        System.out.println("\t\tAtaque: "+jugadores[1].get_poder_ataque());
        System.out.println("- Jugador 3");
        System.out.println("\t\tNombre: "+jugadores[2].get_nombre());
        System.out.println("\t\tVida: "+jugadores[2].get_vida());
        System.out.println("\t\tAtaque: "+jugadores[2].get_poder_ataque());
        System.out.println();


        System.out.println("- RAIDBOSS");
        System.out.println("\t"+jefe_raid.get_titulo()+"...");
        System.out.println("\t\tNombre: "+jefe_raid.get_nombre());
        System.out.println("\t\tVida: "+jefe_raid.get_vida());
        System.out.println("\t\tAtaque: "+jefe_raid.get_poder_ataque());
        System.out.println();

        System.out.println("- CLONES");
        if(clones.size()<=0){
            System.out.println("No hay clones disponibles en el campo de batalla...");
        }
        else{
            for(int k = 0; k<clones.size() ;k++){
                System.out.print("- Clon "+(k+1)+":");
                System.out.println(clones.get(k).get_nombre());
            }
        }
        System.out.println();

        System.out.println("- JEFE");
        System.out.println("\t\tNombre: "+jefe.get_nombre());
        System.out.println("\t\tVida: "+jefe.get_vida());
        System.out.println("\t\tAtaque: "+jefe.get_poder_ataque());
        System.out.println();

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



    public int[] datos_ataque_jugador_raid(){
        System.out.println();
        System.out.println("--- TURNO DE LOS JUGADORES ---");
        System.out.println("- Es turno de los jugadores.");
        System.out.println("- Elige a que tipo de enemigo quieres atacar.");
        System.out.println("- Finalmente, si deseas atacar a un enemigo normal, digita su numero.");

        int[] datos = new int[2];
        for(int k = 0; k<2; k++){
            boolean continuar = true;
            while(continuar){
                try{
                    
                    if(k==0){
                        System.out.println();
                        System.out.println("- Digite 1 para elegir al RaidBoss como objetivo.");
                        System.out.println("- Digite 2 para elegir atacar a el jefe.");
                        System.out.println("- Digite 3 para elegir a un enemigo comun como objetivo.");
                        System.out.print("\t\tDigite su decision: ");
                        int tipo_enemigo = scan.nextInt();
                        if((tipo_enemigo>0)&&(tipo_enemigo<4)){
                            datos[0] = tipo_enemigo;
                            continuar = false;
                        }
                        else{
                            System.out.println("- Error, siga las instrucciones...");
                        }
                    }
                    if(k==1){
                        System.out.println();
                        System.out.println("- Digite el numero de enemigo comun que desea atacar.");
                        System.out.print("- Si eligio a un jefe, simplemente digite 0: ");
                        scan = new Scanner(System.in);
                        int indice_enemigo = scan.nextInt();
                        if((indice_enemigo>=0)&&(indice_enemigo<4)){
                            indice_enemigo -= 1;
                            datos[1] = indice_enemigo;
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
            System.out.print("\t\tSi desea terminarla digite 0: ");
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
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }

    public void turno_jugadores(){
        System.out.println();
        System.out.println("--- TURNO DE LOS JUGADORES ---");
        System.out.println();
    }

    public void turno_enemigo(){
        System.out.println();
        System.out.println("--- TURNO DEL ATAQUE ENEMIGO ---");
        System.out.println();
    }

    public void ataque_jugadores_raid(int jugador){
        System.out.println("- Turno del jugador "+jugador+":");
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
     * @version victoria_jugadores 1.1
     */
    public void victoria_jugadores(){
        System.out.println();
        System.out.println("- Victoria para los Jugadores!");
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

    public int solicitar_jugador_objetivo_raid(){
        boolean continuar = true;
        int opcion = 0;
        while(continuar){
            try{
                System.out.println("\tIngrese el numero de jugador objetivo...");
                System.out.print("\t\tIngrese su decision: ");
                scan = new Scanner(System.in);
                opcion = scan.nextInt();
                if((opcion>0)&&(opcion<4)){
                    if(opcion==1){
                        opcion -= 1;
                        System.out.println();
                        System.out.println("- Ha elegido como objetivo el jugador 1...");
                        System.out.println();
                    }
                    else if(opcion==2){
                        opcion -= 1;
                        System.out.println();
                        System.out.println("- Ha elegido como objetivo el jugador 2...");
                        System.out.println();
                    }
                    else{
                        opcion -= 1;
                        System.out.println();
                        System.out.println("- Ha elegido como objetivo el jugador 3...");
                        System.out.println();
                    }
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    continuar = false;
                }
                else{
                System.out.println();
                System.out.println("\t\tERROR: debe ingresar 1, 2 o 3.");
                System.out.println();
                }
                
            }
            catch(Exception e){
                System.out.println();
                System.out.println("\t\tERROR: debe ingresar 1, 2 o 3.");
                System.out.println();
                scan.next();
            }
        }
        return opcion;
    }

    public boolean clonar_o_no_clonar(){
        boolean clonar = false;
        System.out.println();
        System.out.print("- Desea clonar al RaidBoss? (si/no): ");
        try{
            scan = new Scanner(System.in);
            String opcion = scan.nextLine();
            opcion = opcion.toLowerCase();
            if(opcion.equals("si")){
                System.out.println("- Clonando RAIDBOSS...");
                clonar = true;
            }
        }
        catch(Exception e){
            System.out.println("- No se hizo clonacion...");
        }
        return clonar;
    }

    public String solicitar_nombre_habilidad(){
        String nombre = "";
        boolean continuar = true;
        while(continuar){
            try {
                System.out.println();
                System.out.print(" - Ingrese el nombre de la habilidad de su clon: ");
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

    public void clonacion_exitosa(){
        System.out.println();
        System.out.println("- Clonacion exitosa!");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

}