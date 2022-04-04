package entidades;

public class Combate {
	private Personaje p1;
	private Personaje p2;
	
	public void batalla() {
		System.out.println("==========================================================================================");
		System.out.println("                                " + p1.nombre + " VS " + p2.nombre);
		System.out.println("==========================================================================================");
		
		if(p1 instanceof Guerrero) {
			System.out.println("==========================================================================================");
			System.out.println("Características del Guerrero " + p1.nombre + ":");
			System.out.println("Arma empleada " + p1.arma.nombre + ", con un daño de " + p1.arma.damage + " puntos.");
			System.out.println("Puntos de vida " + p1.vida + ".");
			System.out.println("Poder: " + p1.poder + ".");
			System.out.println("Daño sumado en caso de especialidad: " + p1.especialidad + ".");
			System.out.println("==========================================================================================");
			
		} 
		
		if(p1 instanceof Mago) {
			System.out.println("==========================================================================================");
			System.out.println("Características del Mago " + p1.nombre + ":");
			System.out.println("Arma empleada " + p1.arma.nombre + ", con un daño de " + p1.arma.damage + " puntos.");
			System.out.println("Puntos de vida " + p1.vida + ".");
			System.out.println("Poder: " + p1.poder + ".");
			System.out.println("Daño sumado en caso de especialidad: " + p1.especialidad + ".");
			System.out.println("==========================================================================================");
			
		}
		
		
		if(p1 instanceof Curandero) {
			System.out.println("==========================================================================================");
			System.out.println("Características del Curandero " + p1.nombre + ":");
			System.out.println("Arma empleada " + p1.arma.nombre + ", con un daño de " + p1.arma.damage + " puntos.");
			System.out.println("Puntos de vida " + p1.vida + ".");
			System.out.println("Poder: " + p1.poder + ".");
			System.out.println("Daño sumado en caso de especialidad: " + p1.especialidad + ".");
			System.out.println("==========================================================================================");
		}
		
		if(p2 instanceof Guerrero) {
			System.out.println("==========================================================================================");
			System.out.println("Características del Guerrero " + p2.nombre + ":");
			System.out.println("Arma empleada " + p2.arma.nombre + ", con un daño de " + p1.arma.damage + " puntos.");
			System.out.println("Puntos de vida " + p2.vida + ".");
			System.out.println("Poder: " + p2.poder + ".");
			System.out.println("Daño sumado en caso de especialidad: " + p2.especialidad + ".");
			System.out.println("==========================================================================================");
			
		} 
		
		if(p2 instanceof Mago) {
			System.out.println("==========================================================================================");
			System.out.println("Características del Mago " + p2.nombre + ":");
			System.out.println("Arma empleada " + p2.arma.nombre + ", con un daño de " + p2.arma.damage + " puntos.");
			System.out.println("Puntos de vida " + p2.vida + ".");
			System.out.println("Poder: " + p2.poder + ".");
			System.out.println("Daño sumado en caso de especialidad: " + p2.especialidad + ".");
			System.out.println("==========================================================================================");
		}
		
		
		if(p2 instanceof Curandero) {
			System.out.println("==========================================================================================");
			System.out.println("Características del Curandero " + p2.nombre + ":");
			System.out.println("Arma empleada " + p2.arma.nombre + ", con un daño de " + p2.arma.damage + " puntos.");
			System.out.println("Puntos de vida " + p2.vida + ".");
			System.out.println("Poder: " + p2.poder + ".");
			System.out.println("Daño sumado en caso de especialidad: " + p2.especialidad + ".");
			System.out.println("==========================================================================================");
		}
		
		
		// He indicado la condición de parada de esta forma, puesto que, al establecerla directamente en la condición del while, no funcionaba correctamente.
		
		int turno = 1;
		double comienzo = Math.random();
		while(true) {
			
			if(comienzo <= 0.5) {
				System.out.println("==========================================================================================");
				System.out.println(p1.nombre + " ataca a " + p2.nombre);
				p1.atacar(p2);
				
				if(p2.vida <= 0.00) {
					
					System.out.println(p2.nombre + " ha fallecido tras el ataque recibido en el turno " + turno + ".");
					break;
				}
				
				System.out.println(p2.nombre + " ataca a " + p1.nombre);
				p2.atacar(p1);
				
				if(p1.vida <= 0.00) {
					
					System.out.println(p1.nombre + " ha fallecido tras el ataque recibido en el turno " + turno + ".");
					break;
				}
			
			} else {
				System.out.println("==========================================================================================");
				System.out.println(p2.nombre + " ataca a " + p1.nombre);
				p2.atacar(p1);
				
				if(p1.vida <= 0.00) {
					
					System.out.println(p1.nombre + " ha fallecido tras el ataque recibido en el turno " + turno + ".");
					break;
				}
				
				System.out.println(p1.nombre + " ataca a " + p2.nombre);
				p1.atacar(p2);
				
				if(p2.vida <= 0.00) {
					
					System.out.println(p1.nombre + " ha fallecido tras el ataque recibido en el turno " + turno + ".");
					break;
				}
				
				}
			
			System.out.println("Resultado del turno " + turno + ":");
			System.out.println("Puntos de vida de " + p1.nombre + ":" + " " + p1.vida + ".");
			System.out.println("Puntos de vida de " + p2.nombre + ":" + " " + p2.vida + ".");
			turno++;
			System.out.println("==========================================================================================");
			
			
		}
		
		if(p1.vida < 0) {
			System.out.println("==========================================================================================");
			System.out.println("El ganador del combate es " + p2.nombre + ".");
			System.out.println(p2.nombre + " ha finalizado el combate con " + p2.vida + " puntos de vida.");
			System.out.println(p1.nombre + " ha finalizado el combate con " + p1.vida + " puntos de vida.");
			System.out.println("==========================================================================================");
			
		} else {
			System.out.println("==========================================================================================");
			System.out.println("El ganador del combate es " + p1.nombre + ".");
			System.out.println(p1.nombre + " ha finalizado el combate con " + p1.vida + " puntos de vida.");
			System.out.println(p2.nombre + " ha finalizado el combate con " + p2.vida + " puntos de vida.");
			System.out.println("==========================================================================================");
		}
		
		

		
	}
	
	public Personaje getP1() {
		return p1;
	}

	public void setP1(Personaje p1) {
		this.p1 = p1;
	}
	
	public Personaje getP2() {
		return p2;
	}

	public void setP2(Personaje p2) {
		this.p2 = p2;
	}


}
