package entidades;

public class Mago extends Personaje {
	
public Mago() {
		
		this.poder = Poder.INTELIGENCIA;
		this.especialidad=15;
	}

	@Override
	public void atacar(Personaje p) {
		double critico = (Math.random() > 0.80) ? 2.00 : 1.00;
		if(this.arma instanceof Hechizo) {
			
			p.restarVida((this.arma.damage * critico) + this.especialidad);
		
		} else {
			p.restarVida(this.arma.damage * critico);
		}
		
	}

	
	

}
