import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
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

	public AdjazensmatrixArray(int groesse, boolean istZufallsgraph)
	{
		_adjazensmatrix = new int[groesse][groesse];
		_graphenGroesse = groesse;
		if(istZufallsgraph)
		{
			Random random = new Random();
			int zufall = random.nextInt((_graphenGroesse+1)*2);
			for(int i = 0; i < zufall; ++i)
			{
				zufallsKanteEinfuegen();
			}
		}
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
			int[][] hilfsarray = new int[_graphenGroesse+20][_graphenGroesse+20];
			for(int i = 0; i < _adjazensmatrix.length; ++i)
			{
				for(int j = 0; j < _adjazensmatrix[i].length; ++j)
				{
					hilfsarray[i][j] = _adjazensmatrix[i][j];
				}
			}
			_adjazensmatrix = hilfsarray;
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

	@Override
	public void zufallsKanteEinfuegen()
	{
		Random random = new Random();
		int zufallszahl1 = random.nextInt(_graphenGroesse);
		int zufallszahl2 = random.nextInt(_graphenGroesse);
		int zufallsgewicht = random.nextInt(10);
		_adjazensmatrix[zufallszahl1][zufallszahl2] = zufallsgewicht;
		_adjazensmatrix[zufallszahl2][zufallszahl1] = zufallsgewicht;		
	}
}
