package ayudantia_3;

import java.util.ArrayList;

public abstract class Personaje {
    private ArrayList<Jugador> jugadores;
    private int vida;
    private int fuerza;
    private int velocidad;

    public Personaje(int vida , int fuerza, int velocidad) {
        this.vida= vida;
        this.fuerza=fuerza;
        this.velocidad=velocidad;
    }

    public boolean agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
        return true;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getFuerza() {
        return this.fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void enfrentarEnemigo(Enemigo enemigo) {
        if (enemigo.getTipo().equals("Zombie")){
            int f= enemigo.getFuerza();
            int v= enemigo.getVelocidad();
            System.out.print("enemigo de fuerza: "+f+" y velocidad: "+v);
            System.out.println();
            System.out.println("Zombi intento comerse el cerebro del Jugador");
            int aux = getVida()-5;
            int aux1= getVelocidad()-1;
            setVida(aux);
            setVelocidad(aux1);
        } else if (enemigo.getTipo().equals("Esqueleto")) {
            int f= enemigo.getFuerza();
            int v= enemigo.getVelocidad();
            System.out.print("enemigo de fuerza: "+f+" y velocidad: "+v);
            System.out.println();
            System.out.println("Esqueleto le ha lanzado un hueso al Jugador");
            int aux = getVida()-7;
            int aux1= getVelocidad()-1;
            setVida(aux);
            setVelocidad(aux1);
        }else {
            int f= enemigo.getFuerza();
            int v= enemigo.getVelocidad();
            System.out.print("enemigo de fuerza: "+f+" y velocidad: "+v);
            System.out.println();
            System.out.println("Jefe final se rie de lo debil que es el Jugador");
            int aux = getVida()-10;
            int aux1= getVelocidad()-1;
            setVida(aux);
            setVelocidad(aux1);
        }


    }
    @Override
    public String toString() {
        return "vida"+getVida()+"fuerza"+getFuerza()+"velocidad"+getVelocidad();
    }
    public abstract String getTipo();

    public void atacarJugador(Personaje personaje) {
        if (personaje.getTipo().equals("Jugador")){
            System.out.println("Simio no mata a simio");
        }
    }
}
