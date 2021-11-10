package oggetti;
import java.util.Random;

public class Moneta extends OggettoLanciato
{
	public Moneta()
	{
		super();
	}
	
	public void lancio()
	{
		Random rnd = new Random();
		// genero un valore random da 0 incluso a 2 escluso. 0 = testa; 1 = croce.
		this.valoreOttenuto = rnd.nextInt(2);
	}
	
	public String getStringValoreOttenuto()
	{
		String out = "";
		
		if (this.valoreOttenuto == 0)
			out = "Testa";
		else if (this.valoreOttenuto == 1)
			out = "Croce";
		
		return out;
	}
	
	public String toString()
	{
		return "La moneta ha dato " + this.getStringValoreOttenuto() + "\n";
	}
}
