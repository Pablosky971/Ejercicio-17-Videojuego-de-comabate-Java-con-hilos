package entidades;

public abstract class Personaje {
	
	protected String nombre;
	protected Arma arma;
	protected double vida = 100.00;
	protected Poder poder;
	protected double especialidad;
	
	
	public abstract void atacar(Personaje p);
	public abstract void restarVida(double resta);
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public double getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public Poder getPoder() {
		return poder;
	}
	public void setPoder(Poder poder) {
		
		this.poder = poder;
	}
	
	public double getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(double especialidad) {
		this.especialidad = especialidad;
	}
	
	

}
