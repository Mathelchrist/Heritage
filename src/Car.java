
public class Car extends Vehicule{
	
	@Override
	public String doStuff() {
		return "Je suis " +this.getBrand()+ " et je fais vroum vroum !";
	}
}
