import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AdjazensmatrixArray implements GraphenInterface
{
	private int[][] _adjazensmatrix;
	private int _graphenGroesse;
	
	public AdjazensmatrixArray() 
	{
		_adjazensmatrix = new int[20][20];	
		_graphenGroesse = 0;
	}

	@Override
	public void KnotenEinfuegen()
	{
		if(_graphenGroesse < _adjazensmatrix.length)
		{
		++_graphenGroesse;
		}
		else
		{
			for(int i = 0; i < _adjazensmatrix.length; ++i)
			{
				Arrays.copyOf(_adjazensmatrix[i], _adjazensmatrix.length + 20);		
			}
			++_graphenGroesse;
		}
	}

	@Override
	public void KanteEinfuegen(int start, int ziel, int gewicht)
	{
		_adjazensmatrix[start][ziel] = gewicht;	
	}

	@Override
	public boolean traversieren(Knoten k)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Integer> gibNachbarknoten(int knotenIndex)
	{
		Set<Integer> nachbarknoten = new HashSet<Integer>();
		for(int i = 0; i < _adjazensmatrix[knotenIndex].length; ++i)
		{
			if(_adjazensmatrix[knotenIndex][i] != 0)
			{
				nachbarknoten.add(_adjazensmatrix[knotenIndex][i]);
			}	
		}
		return nachbarknoten;
	}

	@Override
	public int gibGewichtung(int knoten1, int knoten2)
	{
		return _adjazensmatrix[knoten1][knoten2];
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
