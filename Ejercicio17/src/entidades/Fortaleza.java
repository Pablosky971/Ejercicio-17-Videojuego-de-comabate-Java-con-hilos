package entidades;

public class Fortaleza {
	
	private String escenario;
	private Jefe jefe;
	private int asistentes;
	
	
	

	public Fortaleza(Jefe jefe) {
		this.setJefe(jefe);
	}
	
	public synchronized void combateJefe(Personaje p) {
		
		if(jefe.vida > 0) {
			
		
		Combate c = new Combate();
		c.setP1(jefe);
		c.setP2(p);
		c.batalla();
		
		if(jefe.vida < 0) {
			for(int i=0; i < asistentes; i++) {
				System.out.println("Aficionado " + i + " celebra la victoria de " + p.getNombre() + " ante el temible jefe " + jefe.nombre);
				System.out.println("Exclama: ¡Gracias " + p.nombre + " por librarnos de su cautiverio. ¡Campeones!" );
			}
			
		}
		
		} else {
			System.out.println("El jefe ya ha sido vencido. Por lo que el personaje " +  p.nombre + "no combatirá, y se unirá a la celebración.");
		}

	}
	
	public String getEscenario() {
		return escenario;
	}

	public void setEscenario(String escenario) {
		this.escenario = escenario;
	}
	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}
	
	public int getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(int asistentes) {
		this.asistentes = asistentes;
	}

	
	
	

}
