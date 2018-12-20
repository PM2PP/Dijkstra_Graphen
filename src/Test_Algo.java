import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Algo
{

	@Test
	public void TestMatrixKlein()
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

		assertEquals(algoM.ermittleKuerzestenWege(0).toString(), "{0=0, 1=3, 2=4, 3=6, 4=10, 5=12}");
		assertEquals(algoM.ermittleKuerzestenWege(1).toString(), "{0=3, 1=0, 2=7, 3=3, 4=7, 5=13}");
		assertEquals(algoM.ermittleKuerzestenWege(2).toString(), "{0=4, 1=7, 2=0, 3=10, 4=6, 5=8}");
		assertEquals(algoM.ermittleKuerzestenWege(3).toString(), "{0=6, 1=3, 2=10, 3=0, 4=7, 5=13}");
		assertEquals(algoM.ermittleKuerzestenWege(4).toString(), "{0=10, 1=7, 2=6, 3=7, 4=0, 5=6}");
		assertEquals(algoM.ermittleKuerzestenWege(5).toString(), "{0=12, 1=13, 2=8, 3=13, 4=6, 5=0}");
	}

	@Test
	public void TestListeKlein()
	{
		Adjazenzliste adjazenzliste = new Adjazenzliste(6);

		adjazenzliste.KanteEinfuegen(0, 1, 3);
		adjazenzliste.KanteEinfuegen(0, 2, 4);
		adjazenzliste.KanteEinfuegen(1, 2, 7);
		adjazenzliste.KanteEinfuegen(1, 3, 3);
		adjazenzliste.KanteEinfuegen(1, 4, 7);
		adjazenzliste.KanteEinfuegen(2, 4, 6);
		adjazenzliste.KanteEinfuegen(2, 5, 8);
		adjazenzliste.KanteEinfuegen(3, 4, 7);
		adjazenzliste.KanteEinfuegen(4, 5, 6);

		DijkstraAlgo algoL = new DijkstraAlgo(adjazenzliste);

		assertEquals(algoL.ermittleKuerzestenWege(0).toString(), "{0=0, 1=3, 2=4, 3=6, 4=10, 5=12}");
		assertEquals(algoL.ermittleKuerzestenWege(1).toString(), "{0=3, 1=0, 2=7, 3=3, 4=7, 5=13}");
		assertEquals(algoL.ermittleKuerzestenWege(2).toString(), "{0=4, 1=7, 2=0, 3=10, 4=6, 5=8}");
		assertEquals(algoL.ermittleKuerzestenWege(3).toString(), "{0=6, 1=3, 2=10, 3=0, 4=7, 5=13}");
		assertEquals(algoL.ermittleKuerzestenWege(4).toString(), "{0=10, 1=7, 2=6, 3=7, 4=0, 5=6}");
		assertEquals(algoL.ermittleKuerzestenWege(5).toString(), "{0=12, 1=13, 2=8, 3=13, 4=6, 5=0}");

	}

	@Test
	public void TestMatrixGross()
	{
		AdjazensmatrixArray adjazensmatrix = new AdjazensmatrixArray(12, false);

		adjazensmatrix.KanteEinfuegen(0, 1, 3);
		adjazensmatrix.KanteEinfuegen(0, 2, 1);
		adjazensmatrix.KanteEinfuegen(1, 2, 7);
		adjazensmatrix.KanteEinfuegen(1, 3, 3);
		adjazensmatrix.KanteEinfuegen(1, 4, 7);
		adjazensmatrix.KanteEinfuegen(2, 4, 6);
		adjazensmatrix.KanteEinfuegen(2, 5, 2);
		adjazensmatrix.KanteEinfuegen(3, 4, 7);
		adjazensmatrix.KanteEinfuegen(4, 5, 6);

		adjazensmatrix.KanteEinfuegen(5, 6, 3);
		adjazensmatrix.KanteEinfuegen(5, 11, 5);
		adjazensmatrix.KanteEinfuegen(6, 2, 4);
		adjazensmatrix.KanteEinfuegen(6, 3, 8);
		adjazensmatrix.KanteEinfuegen(7, 10, 3);
		adjazensmatrix.KanteEinfuegen(7, 9, 2);
		adjazensmatrix.KanteEinfuegen(8,11, 21);
		adjazensmatrix.KanteEinfuegen(9, 8, 6);
		adjazensmatrix.KanteEinfuegen(10, 9, 8);
		adjazensmatrix.KanteEinfuegen(10, 11, 23);

		DijkstraAlgo algoM = new DijkstraAlgo(adjazensmatrix);

		assertEquals(algoM.ermittleKuerzestenWege(0).toString(),
				"{0=0, 1=3, 2=1, 3=6, 4=7, 5=3, 6=5, 7=34, 8=29, 9=35, 10=31, 11=8}");
		assertEquals(algoM.ermittleKuerzestenWege(5).toString(),
				"{0=3, 1=6, 2=2, 3=11, 4=6, 5=0, 6=3, 7=31, 8=26, 9=32, 10=28, 11=5}");
		assertEquals(algoM.ermittleKuerzestenWege(11).toString(),
				"{0=8, 1=11, 2=7, 3=16, 4=11, 5=5, 6=8, 7=26, 8=21, 9=27, 10=23, 11=0}");

	}

	@Test
	public void TestListeGross()
	{
		Adjazenzliste adjazenzliste = new Adjazenzliste(12);

		adjazenzliste.KanteEinfuegen(0, 1, 3);
		adjazenzliste.KanteEinfuegen(0, 2, 1);
		adjazenzliste.KanteEinfuegen(1, 2, 7);
		adjazenzliste.KanteEinfuegen(1, 3, 3);
		adjazenzliste.KanteEinfuegen(1, 4, 7);
		adjazenzliste.KanteEinfuegen(2, 4, 6);
		adjazenzliste.KanteEinfuegen(2, 5, 2);
		adjazenzliste.KanteEinfuegen(3, 4, 7);
		adjazenzliste.KanteEinfuegen(4, 5, 6);

		adjazenzliste.KanteEinfuegen(5, 6, 3);
		adjazenzliste.KanteEinfuegen(5, 11, 5);
		adjazenzliste.KanteEinfuegen(6, 2, 4);
		adjazenzliste.KanteEinfuegen(6, 3, 8);
		adjazenzliste.KanteEinfuegen(7, 10, 3);
		adjazenzliste.KanteEinfuegen(7, 9, 2);
		adjazenzliste.KanteEinfuegen(8,11, 21);
		adjazenzliste.KanteEinfuegen(8, 9, 6);
		adjazenzliste.KanteEinfuegen(10, 9, 8);
		adjazenzliste.KanteEinfuegen(10, 11, 23);

		DijkstraAlgo algoL = new DijkstraAlgo(adjazenzliste);
		assertEquals(algoL.ermittleKuerzestenWege(0).toString(),
				"{0=0, 1=3, 2=1, 3=6, 4=7, 5=3, 6=5, 7=34, 8=29, 9=35, 10=31, 11=8}");
		assertEquals(algoL.ermittleKuerzestenWege(5).toString(),
				"{0=3, 1=6, 2=2, 3=11, 4=6, 5=0, 6=3, 7=31, 8=26, 9=32, 10=28, 11=5}");
		assertEquals(algoL.ermittleKuerzestenWege(11).toString(),
				"{0=8, 1=11, 2=7, 3=16, 4=11, 5=5, 6=8, 7=26, 8=21, 9=27, 10=23, 11=0}");
	}

}
