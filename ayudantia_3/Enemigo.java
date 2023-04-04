package ayudantia_3;

public abstract class Enemigo {
	private int fuerza;
	private int velocidad;

	public Enemigo(int fuerza, int velocidad) {
		this.fuerza=fuerza;
		this.velocidad=velocidad;
	}

	public int getFuerza() {
		return this.fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getVelocidad() {
		return this.velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "fuerza"+getFuerza()+"velocidad"+getVelocidad();
	}

	public abstract String getTipo();
}