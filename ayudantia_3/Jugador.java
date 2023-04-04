package ayudantia_3;

import java.util.ArrayList;

public class Jugador extends Personaje {


	public Jugador(int vida , int fuerza, int velocidad) {
		super(vida,fuerza,velocidad);
	}
	public String getTipo() {
		return "Jugador";
	}
}