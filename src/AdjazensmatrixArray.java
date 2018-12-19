import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
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

	public AdjazensmatrixArray(int groesse)
	{
		_adjazensmatrix = new int[groesse][groesse];
		_graphenGroesse = groesse;
	}

	@Override
	public void KnotenEinfuegen()
	{
		if (_graphenGroesse < _adjazensmatrix.length)
		{
			++_graphenGroesse;
		}
		else
		{
			Arrays.copyOf(_adjazensmatrix, _adjazensmatrix.length + 20);
			for (int i = 0; i < _adjazensmatrix.length; ++i)
			{
				Arrays.copyOf(_adjazensmatrix[i], _adjazensmatrix.length);
			}
			++_graphenGroesse;
		}
	}

	@Override
	public void KanteEinfuegen(int start, int ziel, int gewicht)
	{
		_adjazensmatrix[start][ziel] = gewicht;
		_adjazensmatrix[ziel][start] = gewicht;
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
		for (int i = 0; i < _adjazensmatrix[knotenIndex].length; ++i)
		{
			if (_adjazensmatrix[knotenIndex][i] != 0)
			{
				nachbarknoten.add(i);
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
		for (int i = 0; i < _graphenGroesse; ++i)
		{
			System.out.println();
			for (int j = 0; j < _graphenGroesse; ++j)
			{
				System.out.print(_adjazensmatrix[i][j]);
			}

		}
	}

	public int gibGroesse()
	{
		return _graphenGroesse;
	}

}
