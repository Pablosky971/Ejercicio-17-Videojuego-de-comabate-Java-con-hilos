package entidades;

public class Jefe extends Personaje {
	
	
	public Jefe() {
		
		this.especialidad=25.00;
		this.poder=Poder.VESANIA;
		
	}

	@Override
	public void atacar(Personaje p) {
		double critico = (Math.random() > 0.80) ? 2.00 : 1.00;
		
			p.restarVida((this.arma.damage * critico) + this.especialidad);
			if(critico==2.00) {
				System.out.println("Se ha aplicado daño crítico.");
				
			}
		
		
		
		
	}

	

}
