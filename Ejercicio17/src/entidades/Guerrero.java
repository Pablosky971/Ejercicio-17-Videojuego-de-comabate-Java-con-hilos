package entidades;

public class Guerrero extends Personaje {
	
	public Guerrero() {
		
		this.poder = Poder.FUERZA;
		this.especialidad=15;
		
		
	}

	@Override
	public void atacar(Personaje p) {
		double critico = (Math.random() > 0.80) ? 2.00 : 1.00;
		if(this.arma instanceof Espada || this.arma instanceof Arco) {
			p.restarVida((this.arma.damage * critico) + this.especialidad);
			if(critico==2.00) {
				System.out.println("Se ha aplicado daño crítico.");
				
			}
		} else {
			p.restarVida(this.arma.damage);
		}
		
		
		
	}

	@Override
	public void restarVida(double resta) {
		this.vida -= resta;
		
	}

}
