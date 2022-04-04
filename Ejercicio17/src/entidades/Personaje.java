package entidades;

public abstract class Personaje extends Thread {
	
	protected String nombre;
	protected Arma arma;
	protected double vida;
	protected Poder poder;
	protected double especialidad;
	protected Fortaleza fortaleza;
	
	public Personaje() {
		this.setVida(100);
	}

	public abstract void atacar(Personaje p);
	
	public void restarVida(double resta) {
		this.vida -= resta;
		
	}

	public void run() {
		fortaleza.combateJefe(this);
	}

	
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
		if(this instanceof Jefe) {
			if(this.vida < 300) {
				vida = 300;
			}
		
		}
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
	
	public Fortaleza getFortaleza() {
		return fortaleza;
	}
	public void setFortaleza(Fortaleza fortaleza) {
		this.fortaleza = fortaleza;
	}
	
	

}
