import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Implementation eines gewichteten Grpahen mit hilfe einer Adjazenzmatrix
 * 
 * @author P.Aguilar Bremer & J.P.Ritter
 * @version Oktober 2018
 */
public class Adjazenzmatrix implements GraphenInterface
{
	private List<List<Integer>> _adjazenzmatrix;
	private int _graphenGroesse;
	
	public Adjazenzmatrix()
	{
		_graphenGroesse = 0;
		_adjazenzmatrix = new ArrayList<List<Integer>>();
	}

	@Override
	public void KnotenEinfuegen()
	{
		++_graphenGroesse;
		List<Integer> subListe = new ArrayList<Integer>();
		for(int i = 0; i<_graphenGroesse; ++i)
		{
			subListe.add(0);
		}
		_adjazenzmatrix.add(subListe);	
	}

	@Override
	public void KanteEinfuegen(int start, int ziel, int gewicht)
	{
		_adjazenzmatrix.get(start).set(ziel, gewicht);		
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
		Set<Integer> nachbarknoten = new HashSet<Integer>();
		for(int i = 0; i < _adjazenzmatrix.get(knotenindex).size(); ++i)
		{
			if(_adjazenzmatrix.get(knotenindex).get(i) != 0)
			{
				nachbarknoten.add(_adjazenzmatrix.get(knotenindex).get(i));				
			}
		}
		return nachbarknoten;
	}

	@Override
	public int gibGewichtung(int knoten1, int knoten2)
	{
		return _adjazenzmatrix.get(knoten1).get(knoten2);
		
	}

	@Override
	public void DebugHilfe()
	{
		// TODO Auto-generated method stub	
	}
	
	public int gibGroesse()
	{
		return _graphenGroesse;
	}

}
