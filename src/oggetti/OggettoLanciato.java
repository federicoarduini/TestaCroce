package oggetti;

public class OggettoLanciato
{
	protected int valoreOttenuto;
	
	public OggettoLanciato()
	{
		this.valoreOttenuto = 0;
	}
	
	public int getValoreOttenuto()
	{
		return this.valoreOttenuto;
	}
	
	public void lancio()
	{
		// metodo placeholder che verrà implementato specificatamente dalle classi che derivano da me
	}
	
	public String toString()
	{
		return "Valore ottenuto: " + this.valoreOttenuto + "\n";
	}
}
