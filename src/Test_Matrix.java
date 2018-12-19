import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_Matrix
{

	@Test
	void TestMatrixKlein()
	{
		AdjazensmatrixArray adjazensmatrix = new AdjazensmatrixArray(6);

		
		adjazensmatrix.KanteEinfuegen(0, 1, 3);
		adjazensmatrix.KanteEinfuegen(0, 2, 4);
		adjazensmatrix.KanteEinfuegen(1, 2, 7);
		adjazensmatrix.KanteEinfuegen(1, 3, 3);
		adjazensmatrix.KanteEinfuegen(1, 4, 7);
		adjazensmatrix.KanteEinfuegen(2, 4, 6);
		adjazensmatrix.KanteEinfuegen(2, 5, 8);
		adjazensmatrix.KanteEinfuegen(3, 4, 7);
		adjazensmatrix.KanteEinfuegen(4, 5, 6);

		assertEquals(adjazensmatrix.gibGroesse(), 6);

		assertEquals(adjazensmatrix.gibGewichtung(0, 1), 3);
		assertEquals(adjazensmatrix.gibGewichtung(1, 0), 3);
		assertEquals(adjazensmatrix.gibGewichtung(1, 4), 7);
		assertEquals(adjazensmatrix.gibGewichtung(3, 4), 7);
		assertEquals(adjazensmatrix.gibGewichtung(5, 4), 6);

		assertEquals(adjazensmatrix.gibNachbarknoten(0).toString(), "[1, 2]");
		assertEquals(adjazensmatrix.gibNachbarknoten(1).toString(), "[0, 2, 3, 4]");
		assertEquals(adjazensmatrix.gibNachbarknoten(5).toString(), "[2, 4]");

		adjazensmatrix.KnotenEinfuegen();

		assertEquals(adjazensmatrix.gibGroesse(), 7);
	}

	@Test
	void TestMatrixGross()
	{
		AdjazensmatrixArray adjazensmatrix = new AdjazensmatrixArray(12);
		
		adjazensmatrix.KanteEinfuegen(0, 1, 3);
		adjazensmatrix.KanteEinfuegen(0, 2, 4);
		adjazensmatrix.KanteEinfuegen(1, 2, 7);
		adjazensmatrix.KanteEinfuegen(1, 3, 3);
		adjazensmatrix.KanteEinfuegen(1, 4, 7);
		adjazensmatrix.KanteEinfuegen(2, 4, 6);
		adjazensmatrix.KanteEinfuegen(2, 5, 8);
		adjazensmatrix.KanteEinfuegen(3, 4, 7);
		adjazensmatrix.KanteEinfuegen(4, 5, 6);

		adjazensmatrix.KanteEinfuegen(5, 6, 3);
		adjazensmatrix.KanteEinfuegen(5, 11, 5);
		adjazensmatrix.KanteEinfuegen(6, 2, 4);
		adjazensmatrix.KanteEinfuegen(6, 3, 8);
		adjazensmatrix.KanteEinfuegen(7, 10, 3);
		adjazensmatrix.KanteEinfuegen(7, 9, 2);
		adjazensmatrix.KanteEinfuegen(8, 9, 6);
		adjazensmatrix.KanteEinfuegen(10, 9, 8);
		adjazensmatrix.KanteEinfuegen(10, 11, 23);

		assertEquals(adjazensmatrix.gibGroesse(), 12);

		assertEquals(adjazensmatrix.gibGewichtung(0, 1), 3);
		assertEquals(adjazensmatrix.gibGewichtung(1, 0), 3);
		assertEquals(adjazensmatrix.gibGewichtung(1, 4), 7);
		assertEquals(adjazensmatrix.gibGewichtung(3, 4), 7);
		assertEquals(adjazensmatrix.gibGewichtung(5, 4), 6);

		assertEquals(adjazensmatrix.gibGewichtung(5, 6), 3);
		assertEquals(adjazensmatrix.gibGewichtung(6, 5), 3);
		assertEquals(adjazensmatrix.gibGewichtung(6, 3), 8);
		assertEquals(adjazensmatrix.gibGewichtung(8, 9), 6);
		assertEquals(adjazensmatrix.gibGewichtung(10, 11), 23);

		assertEquals(adjazensmatrix.gibNachbarknoten(0).toString(), "[1, 2]");
		assertEquals(adjazensmatrix.gibNachbarknoten(1).toString(), "[0, 2, 3, 4]");
		assertEquals(adjazensmatrix.gibNachbarknoten(5).toString(), "[2, 4, 6, 11]");

		assertEquals(adjazensmatrix.gibNachbarknoten(6).toString(), "[2, 3, 5]");
		assertEquals(adjazensmatrix.gibNachbarknoten(8).toString(), "[9]");
		assertEquals(adjazensmatrix.gibNachbarknoten(10).toString(), "[7, 9, 11]");

		adjazensmatrix.KnotenEinfuegen();

		assertEquals(adjazensmatrix.gibGroesse(), 13);
		
		adjazensmatrix.KanteEinfuegen(10, 12, 3);
		adjazensmatrix.KanteEinfuegen(11, 12, 10);
		
		assertEquals(adjazensmatrix.gibGewichtung(10, 12), 3);
		assertEquals(adjazensmatrix.gibGewichtung(11, 12), 10);
		
		assertEquals(adjazensmatrix.gibNachbarknoten(10).toString(), "[7, 9, 11, 12]");
		assertEquals(adjazensmatrix.gibNachbarknoten(11).toString(), "[5, 10, 12]");
		
		
	}

}
