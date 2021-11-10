package oggetti;
import java.util.Random;

public class Dado extends OggettoLanciato
{
	public Dado()
	{
		super();
	}
	
	public void lancio()
	{
		Random rnd = new Random();
		// genero un numero da 1 compreso a 7 escluso
		this.valoreOttenuto = rnd.nextInt(7 - 1) + 1;
	}
	
	public String toString()
	{
		return "Il dado ha restituito " + this.getValoreOttenuto() + "\n";
	}
}
