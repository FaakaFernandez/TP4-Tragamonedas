package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTragamonedas {
  
	@Test
	public void testFuncionamientoDelTragamonedas() {
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		Integer posicionPrimerTambor = miTragamonedas.primerTambor.getPosicion();
		Integer posicionSegundoTambor = miTragamonedas.segundoTambor.getPosicion();
		Integer posicionTercerTambor = miTragamonedas.tercerTambor.getPosicion();
		assertTrue((posicionPrimerTambor >= 1 && posicionPrimerTambor <= 10) &&
				   (posicionSegundoTambor >= 1 && posicionSegundoTambor <= 10) &&
				   (posicionTercerTambor >= 1 && posicionTercerTambor <= 10)
				  );
	}
	
	@Test
	public void queLosTamboresInicienEnUno(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		Integer valorEsperado = 1;
		assertEquals(valorEsperado, miTragamonedas.primerTambor.getPosicion());
		assertEquals(valorEsperado, miTragamonedas.segundoTambor.getPosicion());
		assertEquals(valorEsperado, miTragamonedas.tercerTambor.getPosicion());
	}
	
	@Test
	public void testPremio(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		
		while(miTragamonedas.entregaPremio() == false){
			assertFalse(miTragamonedas.entregaPremio());
			miTragamonedas.activar();
		}
		if(miTragamonedas.entregaPremio() == true){
			assertTrue(miTragamonedas.entregaPremio());
		}
	}
	
	@Test
	public void queSeGenereUnNumeroEntreUnoYDiez() {
		RandoNumberGenerator newGenerator = new RandoNumberGenerator();
		Integer numeroAleatorio = newGenerator.generate();
		assertTrue(numeroAleatorio >=1 && numeroAleatorio <= 10);
	}

}
