package vista;

import entidades.Arco;
import entidades.Arma;
import entidades.Combate;
import entidades.Curandero;
import entidades.Espada;
import entidades.Fortaleza;
import entidades.Guerrero;
import entidades.Hechizo;
import entidades.Jefe;
import entidades.Laser;
import entidades.Mago;
import entidades.Personaje;
import entidades.Rezo;

public class MainVideojuego {
	public static void main(String[] args) {
	
	
	Jefe j = new Jefe();
	j.setNombre("Godzilla");
	j.setVida(200);
	Arma armaJefe = new Laser();
	armaJefe.setNombre("Lasér por la boca");
	armaJefe.setDamage(45.00);
	j.setArma(armaJefe);
	
	
	Fortaleza f = new Fortaleza(j);
	f.setEscenario("Tokio");
	f.setAsistentes(10);
	
	
	Personaje p1 = new Guerrero();
	
	p1.setNombre("Beowulf");
	Arma a1 = new Espada();
	a1.setNombre("Mandoble de fuego");
	a1.setDamage(23.00);
	p1.setArma(a1);
	p1.setFortaleza(f);
	
	
	Personaje p2 = new Mago();
	p2.setNombre("Harry Potter");
	Arma a2 = new Hechizo();
	a2.setNombre("Varita de Saúco");
	a2.setDamage(25.00);
	p2.setArma(a2);
	p2.setFortaleza(f);
	
	
	Personaje p3 = new Curandero();
	p3.setNombre("Oráculo de Delfos");
	Arma a3 = new Rezo();
	p3.setArma(a3);
	a3.setNombre("Ave María");
	a3.setDamage(20.00);
	p3.setFortaleza(f);
	
	Personaje p4 = new Mago();
	p4.setNombre("Albus Dumbledore");
	p4.setArma(a2);
	p4.setFortaleza(f);

	Personaje p5 = new Guerrero();
	p5.setNombre("Legolas");
	Arma a4 = new Arco();
	a4.setNombre("Belthrondin");
	a4.setDamage(21.00);
	p5.setArma(a4);
	p5.setFortaleza(f);
	
	Personaje p6 = new Curandero();
	p6.setNombre("Cura de la parroquia");
	p6.setArma(a4);
	p6.setFortaleza(f);
	
	
	// Lucha en Tokio:
	
	p1.start();
	p2.start();
	p3.start();
	p4.start();
	p5.start();
	p6.start();
	
	
//	Combate c = new Combate();
//	c.setP1(p1);
//	c.setP2(p2);
//	c.batalla();
//	
//	Combate c1 = new Combate();
//	c.setP1(p3);
//	c.setP2(p6);
//	c.batalla();
//	
//	Combate c2 = new Combate();
//	c.setP1(p4);
//	c.setP2(p5);
//	c.batalla();
//	
}

}
