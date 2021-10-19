//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 5

import java.util.ArrayList;

/**
 * Clase CampoBatalla.
 * 
 * @author José Daniel Gómez cabrera
 * @version CampoBatalla Class 1.1
 */
public class CampoBatalla {
    private Jugador jugador;
    private JefeEnemigo jefe;
    private ArrayList<Enemigo> enemigos = new ArrayList<Enemigo>();
    private String habiliad_usada;

    private Jugador[] jugadores_raid = new Jugador[3];
    private RaidBoss jefe_maestro_raid;
    private JefeEnemigo jefe_raid;
    private ArrayList<Enemigo> enemigos_raid = new ArrayList<Enemigo>();
    private ArrayList<Clon> clones_raid = new ArrayList<Clon>();



    /**
     * Constructor.
     * 
     * @author José Daniel Gómez Cabrera
     * @version CampoBatalla 1.1
     * @param int String
     */
    public CampoBatalla(int tipo_jugador, String nombre_jugador){
        if(tipo_jugador==1){
            this.jugador = new Guerrero(nombre_jugador);
        }
        else{
            this.jugador = new Explorador(nombre_jugador);
        }
        this.jefe = new JefeEnemigo("JEFE", 250, 40);
        for(int k = 0; k<3; k++){
            Enemigo enemigo_k = new Enemigo("Enemigo "+(k+1), 100, 25);
            this.enemigos.add(enemigo_k);
        }
    }

    /**
     * ataque de un jugador a un enemigo.
     * 
     * @author José Daniel Gómez Cabrera
     * @version ataque_jugador 1.1
     * @param indices
     */
    public void ataque_jugador(int item, int tipo_enemigo, int indice_enemigo){
        int dano_jugador = this.jugador.get_poder_ataque();
        if(!(item==0)){
            item -= 1;
            dano_jugador += (this.jugador.get_dano_item(item));
            this.jugador.get_items().get(item).set_durabilidad();
        }
        if(tipo_enemigo == 1){
            this.jefe.set_vida(dano_jugador);
        }
        else{
            if(!(indice_enemigo==-1)){
                indice_enemigo -= 1;
                this.enemigos.get(indice_enemigo).set_vida(dano_jugador);
            }
        }
    }

    /**
     * ataque de un enemigo a un jugador.
     * 
     * @author José Daniel Gómez Cabrera
     * @version ataque_enemigo 1.1
     * @param indices
     */
    public void ataque_enemigo(int tipo_enemigo, int indice_enemigo){
        if(tipo_enemigo == 1){
            int dano_jefe = this.jefe.get_poder_ataque();
            this.jugador.set_vida(dano_jefe);
            this.habiliad_usada = this.jefe.usar_habilidad_especial_2();
        }
        else{
            int dano_enemigo = this.enemigos.get(indice_enemigo).get_poder_ataque();
            this.jugador.set_vida(dano_enemigo);
            this.habiliad_usada = this.enemigos.get(indice_enemigo).usar_habilidad();
        }
    }

    /**
     * getter de la informacion del jugador.
     * 
     * @author José Daniel Gómez Cabrera
     * @version get_info_jugador 1.1
     * @return String[]
     */
    public String[] get_info_jugador(){
        String[] info_jugador = this.jugador.info_combatiente();
        return info_jugador;
    }

    /**
     * getter de la informacion del jefe.
     * 
     * @author José Daniel Gómez Cabrera
     * @version get_info_jefe 1.1
     * @return String[]
     */
    public String[] get_info_jefe(){
        String[] info_jefe = this.jefe.info_combatiente();
        return info_jefe;
    }

    /**
     * getter de la lista de enemigos.
     * 
     * @author José Daniel Gómez Cabrera
     * @version get_enemigos 1.1
     * @return ArrayList<Enemigo>
     */
    public ArrayList<Enemigo> get_enemigos(){
        return this.enemigos;
    }

    public Jugador get_jugador(){
        return this.jugador;
    }

    public JefeEnemigo get_jefe(){
        return this.jefe;
    }

    public String get_habiliad_usada(){
        return this.habiliad_usada;
    }

    public int get_salud_enemigos(){
        int salud_total_enemigos = 0;
        for(int k = 0; k<this.enemigos.size();k++){
            int vida = this.enemigos.get(k).get_vida();
            salud_total_enemigos += vida;
        }
        return salud_total_enemigos;
    }

    ////////////////////////////////////////////////////////////////////////////////
    /*Seccion de RAID*/
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * Constructor overwriting.
     * 
     * @author José Daniel Gómez Cabrera
     * @version CampoBatalla 1.1
     * @param int[],String[]
     */
    public CampoBatalla(int[] tipo_jugadores, String[] nombres_jugadores){
        for(int k = 0; k<3; k++){    
            if(tipo_jugadores[k]==1){
                this.jugadores_raid[k] = new Guerrero(nombres_jugadores[k]);
            }
            else if(tipo_jugadores[k]==2){
                this.jugadores_raid[k] = new Explorador(nombres_jugadores[k]);
            }
            else{
                this.jugadores_raid[k] = new Cazador(nombres_jugadores[k]);
            }
        }
        this.jefe_maestro_raid = new RaidBoss();
        this.jefe_raid = new JefeEnemigo("JEFE", 250, 40);
        for(int k = 0; k<3; k++){
            Enemigo enemigo_k = new Enemigo("Enemigo "+(k+1), 100, 25);
            this.enemigos_raid.add(enemigo_k);
        }
    }

    /**
     * ataque de un jugador a un enemigo en RAID.
     * 
     * @author José Daniel Gómez Cabrera
     * @version ataque_jugador_raid 1.1
     * @param int,int,int
     */
    public void ataque_jugador_raid(int numero_de_jugador, int tipo_enemigo, int indice_enemigo){
        int dano_jugador = this.jugadores_raid[numero_de_jugador].get_poder_ataque();
        if(tipo_enemigo == 1){
            this.jefe_maestro_raid.set_vida(dano_jugador);
        }
        else if(tipo_enemigo == 2){
            this.jefe_raid.set_vida(dano_jugador);
        }
        else{
                this.enemigos_raid.get(indice_enemigo).set_vida(dano_jugador);
        }
    }

    /**
     * ataque del raidboss a un jugador en RAID.
     * 
     * @author José Daniel Gómez Cabrera
     * @version ataque_enemigo_raid 1.1
     * @param int
     */
    public void ataque_enemigo_raid(int jugador_objetivo){
        int dano_raidboss = this.jefe_maestro_raid.get_poder_ataque();
        this.jugadores_raid[jugador_objetivo].set_vida(dano_raidboss);
    }

    /**
     * clonar RaidBoss
     * 
     * @author José Daniel Gómez Cabrera
     * @version clonar_raid_boss 1.1
     * @param String
     */
    public void clonar_raid_boss(String habilidad){
        int numero_de_clones = ((this.clones_raid.size())+1);
        String numero_clon = "Clon "+numero_de_clones;
        Clon c = new Clon(habilidad, numero_clon);
        this.clones_raid.add(c);
    }

    public Jugador[] get_jugadores_raid(){
        return this.jugadores_raid;
    }

    public int get_vida_total_jugadores_raid(){
        int vida_jugadores = 0;
        for(int k = 0; k<this.jugadores_raid.length; k++){
            vida_jugadores += this.jugadores_raid[k].get_vida();
        }
        return vida_jugadores;
    }

    public RaidBoss get_raid_boss_raid(){
        return this.jefe_maestro_raid;
    }

    public JefeEnemigo get_jefe_raid(){
        return this.jefe_raid;
    }

    public ArrayList<Enemigo> get_enemigos_raid(){
        return this.enemigos_raid;
    }

    public ArrayList<Clon> get_clones_raid(){
        return this.clones_raid;
    }

    public int get_vida_total_enemigos_raid(){
        int vida_enemigos = 0;
        vida_enemigos += this.jefe_maestro_raid.get_vida();
        vida_enemigos += this.jefe_raid.get_vida();
        for(int k = 0; k<this.enemigos_raid.size() ;k++){
            vida_enemigos += this.enemigos_raid.get(k).get_vida();
        }
        return vida_enemigos;
    }

}