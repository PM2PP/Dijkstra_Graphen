import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DijkstraAlgo
{
	private GraphenInterface _graph;
	private Map<Integer, Integer> _kuerzesterKnotenwegListe;
	private Set<Integer> _besuchteKnoten;
	private List<List<Integer>> _pfadTracker;
	private List<Integer> _trackingList;


	public DijkstraAlgo(GraphenInterface graph)
	{
		_graph = graph;
		_kuerzesterKnotenwegListe = new HashMap<Integer, Integer>();
		_besuchteKnoten = new HashSet<Integer>();
		_pfadTracker = new LinkedList<List<Integer>>();
		for(int i = 0; i < graph.gibGroesse(); ++i)
		{
			_trackingList = new LinkedList<Integer>();
			_pfadTracker.add(_trackingList);
		}
		_besuchteKnoten = new HashSet<Integer>(); 
	}

	public Map<Integer, Integer> ermittleKuerzestenWege(int startKnoten)
	{
		_kuerzesterKnotenwegListe = new HashMap<Integer, Integer>();
		_besuchteKnoten = new HashSet<Integer>();
		int bisherigeDistanz;
		_kuerzesterKnotenwegListe.put(startKnoten, 0);

		while (_besuchteKnoten.size() < _graph.gibGroesse() && !_besuchteKnoten.contains(startKnoten))
		{
			bisherigeDistanz = _kuerzesterKnotenwegListe.get(startKnoten);
			setzeAbstaende(startKnoten, bisherigeDistanz);
			_besuchteKnoten.add(startKnoten);
			startKnoten = gibNaehestenKnoten(startKnoten);
		}
		return _kuerzesterKnotenwegListe;
	}

	public void printTrackingListe()
	{
		for(int i = 0; i < _graph.gibGroesse(); ++i)
		{
			if(!_pfadTracker.get(i).isEmpty())
			{
			System.out.println("Pfadverlauf für " + i + ": " + _pfadTracker.get(i));
			}
		}
	}
	
	public void printKeyListe()
	{
		for(int i = 0; i < _graph.gibGroesse(); ++i)
		{
			if(_kuerzesterKnotenwegListe.get(i) != null)
			{
			System.out.println("Gewichtung für " + i + ": " + _kuerzesterKnotenwegListe.get(i));
			}
		}
	}
	


	private void setzeAbstaende(int startKnoten, int bisherigeDistanz)
	{
		int distanz;
		for (Integer knoten : _graph.gibNachbarknoten(startKnoten))
		{
			distanz = _graph.gibGewichtung(startKnoten, knoten);
			if (!_kuerzesterKnotenwegListe.containsKey(knoten) || (_kuerzesterKnotenwegListe.containsKey(knoten)
					&& (bisherigeDistanz + distanz) < _kuerzesterKnotenwegListe.get(knoten)))
			{
				_kuerzesterKnotenwegListe.put(knoten, bisherigeDistanz + distanz);
//				_pfadTracker.set(knoten, _pfadTracker.get(startKnoten));
//				for(int i = 0; i < _pfadTracker.get(startKnoten).size(); ++i)
//				{
//					_pfadTracker.get(knoten).add(_pfadTracker.get(startKnoten).get(i));		
//				}
				_pfadTracker.set(knoten, new LinkedList<Integer>());
				for(Integer i : _pfadTracker.get(startKnoten))
				{
					_pfadTracker.get(knoten).add(i);
				}
				_pfadTracker.get(knoten).add(startKnoten);
				}
		}			
			}



	private int gibNaehestenKnoten(int startKnoten)
	{
		int distanz;
		int naehesterKnoten = startKnoten;
		int kleinsteDistanz = Integer.MAX_VALUE;
		for (Integer knoten : _kuerzesterKnotenwegListe.keySet())
		{
			distanz = _kuerzesterKnotenwegListe.get(knoten);
			if (!_besuchteKnoten.contains(knoten) && distanz < kleinsteDistanz)
			{
				naehesterKnoten = knoten;
			}
		}
		return naehesterKnoten;
	}

}
