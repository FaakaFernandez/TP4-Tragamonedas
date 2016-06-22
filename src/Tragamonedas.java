package ar.edu.unlam;

public class Tragamonedas {
	
	public Tambor primerTambor;
	public Tambor segundoTambor;
	public Tambor tercerTambor;
	FixNumberGenerator generator = new FixNumberGenerator(1);
	
	public Tragamonedas() {
		this.primerTambor=new Tambor(generator);
		this.segundoTambor=new Tambor(generator);
		this.tercerTambor=new Tambor(generator);
	}
	
	
	public void activar() {
		this.primerTambor.girar();
		this.segundoTambor.girar();
		this.tercerTambor.girar();
	}
	
	public boolean entregaPremio(){
		
		if(primerTambor.getPosicion() == segundoTambor.getPosicion() && segundoTambor.getPosicion()== tercerTambor.getPosicion()){
			
			return true;
		
		} else {
			
			return false;
		}
	}
}