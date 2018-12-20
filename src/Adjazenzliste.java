import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Implementation eines gewichteten Grpahen mit hilfe einer Adjazenzliste
 * 
 * @author P.Aguilar Bremer & J.P.Ritter
 * @version Oktober 2018
 */
public class Adjazenzliste implements GraphenInterface
{
	// Knotenindex <Nachbarknoten, Kantenlaenge zu diesem>
	private List<Map<Integer, Integer>> _adjazenzliste;

	public Adjazenzliste()
	{
		_adjazenzliste = new ArrayList<Map<Integer, Integer>>();
	}

	public Adjazenzliste(int groesse)
	{
		_adjazenzliste = new ArrayList<Map<Integer, Integer>>();
		for (int i = 1; i <= groesse; ++i)
		{
			KnotenEinfuegen();
		}
	}

	@Override
	public void KnotenEinfuegen()
	{
		Map<Integer, Integer> subMap = new HashMap<Integer, Integer>();
		_adjazenzliste.add(subMap);
	}

	@Override
	public void KanteEinfuegen(int start, int ziel, int gewicht)
	{
		_adjazenzliste.get(start).put(ziel, gewicht);
		_adjazenzliste.get(ziel).put(start, gewicht);
	}

	@Override
	public boolean traversieren(Knoten k)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Integer> gibNachbarknoten(int knotenindex)
	{
		return _adjazenzliste.get(knotenindex).keySet();
	}

	@Override
	public int gibGewichtung(int knoten1, int knoten2)
	{
		return _adjazenzliste.get(knoten1).get(knoten2);
	}

	@Override
	public void DebugHilfe()
	{
		for (int i = 0; i < _adjazenzliste.size(); ++i)
		{
			System.out.print("Knoten " + i + ":");
			for (Integer j : gibNachbarknoten(i))
			{
				System.out.print(" " + j + " " + "(" + gibGewichtung(i, j) + ")");
			}
			System.out.println();
		}
	}

	public int gibGroesse()
	{
		return _adjazenzliste.size();
	}

	@Override
	public void zufallsKanteEinfuegen()
	{
		// TODO Auto-generated method stub

	}

}
