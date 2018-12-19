import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DijkstraAlgo
{
	private GraphenInterface _graph;
	private Map<Integer, Integer> _kuerzesterKnotenwegListe;
	private Set<Integer> _besuchteKnoten;

	public DijkstraAlgo(GraphenInterface graph)
	{
		_graph = graph;
		_kuerzesterKnotenwegListe = new HashMap<Integer, Integer>();
		_besuchteKnoten = new HashSet<Integer>();
	}

	public Map<Integer, Integer> ermittleKuerzestenWege(int startKnoten)
	{
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
