package ayudantia_3;
import java.util.ArrayList;

public class Launcher {

    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        Launcher.inicializar();
    }

    public static void inicializar() {
        Personaje Jugador = new Jugador(40,30,10);
        Personaje Jugador1 = new Jugador(50,30,20);

        Enemigo zombie = new Zombie(10,20);
        Enemigo esqueleto = new Esqueleto(20,25);
        Enemigo jefefinal = new JefeFinal( 100,50);

        Jugador.enfrentarEnemigo(zombie);
        System.out.println();
        Jugador.enfrentarEnemigo(esqueleto);
        System.out.println();
        Jugador.enfrentarEnemigo(jefefinal);
        System.out.println();
        Jugador.atacarJugador(Jugador1);
        System.out.println();
        System.out.print("VIDA RESTANTE: "+Jugador.getVida());
    }
}
