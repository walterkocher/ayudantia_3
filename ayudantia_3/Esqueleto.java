package ayudantia_3;

public class Esqueleto extends Enemigo {

	public Esqueleto(int fuerza, int velocidad) {
		super(fuerza,velocidad);
	}

	public String getTipo() {
		return "Esqueleto";
	}
}