package ar.edu.unlam;

public class RandoNumberGenerator implements NumberGenerator {

	@Override
	public Integer generate() {
		   
		return (int)(Math.random()*10+1);
	}

}
