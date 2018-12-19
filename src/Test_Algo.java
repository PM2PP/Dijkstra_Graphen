import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Algo
{

	@Test
	public void TestMatrix()
	{
		AdjazensmatrixArray adjazensmatrix = new AdjazensmatrixArray(6, false);

		
		adjazensmatrix.KanteEinfuegen(0, 1, 3);
		adjazensmatrix.KanteEinfuegen(0, 2, 4);
		adjazensmatrix.KanteEinfuegen(1, 2, 7);
		adjazensmatrix.KanteEinfuegen(1, 3, 3);
		adjazensmatrix.KanteEinfuegen(1, 4, 7);
		adjazensmatrix.KanteEinfuegen(2, 4, 6);
		adjazensmatrix.KanteEinfuegen(2, 5, 8);
		adjazensmatrix.KanteEinfuegen(3, 4, 7);
		adjazensmatrix.KanteEinfuegen(4, 5, 6);
		
		DijkstraAlgo algoM = new DijkstraAlgo(adjazensmatrix); 
		//System.out.println(algoM.ermittleKuerzestenWege(1));
		
		assertEquals(algoM.ermittleKuerzestenWege(0).toString(), "{0=0, 1=3, 2=4, 3=6, 4=10, 5=12}");
		assertEquals(algoM.ermittleKuerzestenWege(1).toString(), "{0=3, 1=0, 2=7, 3=3, 4=7, 5=13}");
		assertEquals(algoM.ermittleKuerzestenWege(2).toString(), "{0=3, 1=0, 2=7, 3=3, 4=7, 5=13}");
		
		
		
		
	}

}
