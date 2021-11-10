import oggetti.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Dado d = new Dado();
		Moneta m = new Moneta();
				
		System.out.println("Andiamo a lanciare il dado...");
		d.lancio();
		System.out.println("Risultato: " + d.toString());
		
		System.out.println("E ora andiamo a lanciare la moneta...");
		m.lancio();
		System.out.println("Risultato: " + m.toString());
	}
}