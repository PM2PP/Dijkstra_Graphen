/**
 * Implementation einer Kante für die 
 * gewichteten Grpahen
 * 
 * @author P.Aguilar Bremer & J.P.Ritter
 * @version Oktober 2018
 */
public class Kante
{
	private Knoten _knoten1;
	private Knoten _knoten2;
	private int _kantenlaenge;
	
	public Kante(Knoten startKnoten, Knoten zielKnoten, int kantenlaenge)
	{
		_knoten1 = startKnoten;
		_knoten2 = zielKnoten;
		_kantenlaenge = kantenlaenge;
	}
	
	public int gibKantenlaenge()
	{
		return _kantenlaenge;
	}
}
