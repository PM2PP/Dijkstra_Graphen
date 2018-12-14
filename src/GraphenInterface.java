/**
 * Ein Interface für Graphen mit entsprechendenn zugriffsfunktionen
 * 
 * @author P.Aguilar Bremer & J.P.Ritter
 * @version Oktober 2018
 */
public interface GraphenInterface
{
	/** 
	 * fügt einen Knoten in den Graphen ein.
	 */
	public void KnotenEinfuegen();

	/**
	 * fügt eine Kante in den Graphen ein
	 * @param start die Start position des Knoten von dem die Kante ausgeht
	 * @param ziel die Ziel position des Knoten auf den die Kante zeigt
	 * @param gewicht die Gewichtung der Kante
	 */
	public void KanteEinfuegen(int start, int ziel, int gewicht);

	/**
	 * durchquert den Graphen
	 */
	public boolean traversieren(Knoten k);

	/**
	 * gibt den Nachbarknoten wieder 
	 */
	public Knoten gibNachbarknoten();
	
	/**
	 * gibt die Gewichtung des Graphen wieder
	 */
	public void gibGewichtung();

	/**
	 * schreibt den Graphen auf die Konsole, zur debug Hilfe
	 */
	public void DebugHilfe();

}
