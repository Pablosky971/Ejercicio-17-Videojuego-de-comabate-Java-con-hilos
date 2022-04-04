package entidades;

public class Curandero extends Personaje {

public Curandero() {
		
		this.poder = Poder.SABIDURIA;
		this.especialidad=15;
	}
	@Override
	public void atacar(Personaje p) {
		double critico = (Math.random() > 0.80) ? 2.00 : 1.00;
		if(this.arma instanceof Rezo) {
			p.restarVida((this.arma.damage * critico) + this.especialidad);
		} else {
			p.restarVida(this.arma.damage);
		}
		
	}

	

}
