package ayudantia_3;

public class Zombie extends Enemigo {

	public Zombie(int fuerza, int velocidad) {
		super(fuerza,velocidad);
	}

	public String getTipo() {
		return "Zombie";
	}
}