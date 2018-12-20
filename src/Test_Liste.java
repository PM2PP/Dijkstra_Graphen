import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_Liste
{

	@Test
	void TestListeKlein()
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

		assertEquals(adjazenzliste.gibGroesse(), 6);

		assertEquals(adjazenzliste.gibGewichtung(0, 1), 3);
		assertEquals(adjazenzliste.gibGewichtung(1, 0), 3);
		assertEquals(adjazenzliste.gibGewichtung(1, 4), 7);
		assertEquals(adjazenzliste.gibGewichtung(3, 4), 7);
		assertEquals(adjazenzliste.gibGewichtung(5, 4), 6);

		assertEquals(adjazenzliste.gibNachbarknoten(0).toString(), "[1, 2]");
		assertEquals(adjazenzliste.gibNachbarknoten(1).toString(), "[0, 2, 3, 4]");
		assertEquals(adjazenzliste.gibNachbarknoten(5).toString(), "[2, 4]");

		adjazenzliste.KnotenEinfuegen();

		assertEquals(adjazenzliste.gibGroesse(), 7);
	}

	@Test
	void TestListeGross()
	{

		Adjazenzliste adjazenzliste = new Adjazenzliste(12);
		
		adjazenzliste.KanteEinfuegen(0, 1, 3);
		adjazenzliste.KanteEinfuegen(0, 2, 4);
		adjazenzliste.KanteEinfuegen(1, 2, 7);
		adjazenzliste.KanteEinfuegen(1, 3, 3);
		adjazenzliste.KanteEinfuegen(1, 4, 7);
		adjazenzliste.KanteEinfuegen(2, 4, 6);
		adjazenzliste.KanteEinfuegen(2, 5, 8);
		adjazenzliste.KanteEinfuegen(3, 4, 7);
		adjazenzliste.KanteEinfuegen(4, 5, 6);

		adjazenzliste.KanteEinfuegen(5, 6, 3);
		adjazenzliste.KanteEinfuegen(5, 11, 5);
		adjazenzliste.KanteEinfuegen(6, 2, 4);
		adjazenzliste.KanteEinfuegen(6, 3, 8);
		adjazenzliste.KanteEinfuegen(7, 10, 3);
		adjazenzliste.KanteEinfuegen(7, 9, 2);
		adjazenzliste.KanteEinfuegen(8, 9, 6);
		adjazenzliste.KanteEinfuegen(10, 9, 8);
		adjazenzliste.KanteEinfuegen(10, 11, 23);

		assertEquals(adjazenzliste.gibGroesse(), 12);

		assertEquals(adjazenzliste.gibGewichtung(0, 1), 3);
		assertEquals(adjazenzliste.gibGewichtung(1, 0), 3);
		assertEquals(adjazenzliste.gibGewichtung(1, 4), 7);
		assertEquals(adjazenzliste.gibGewichtung(3, 4), 7);
		assertEquals(adjazenzliste.gibGewichtung(5, 4), 6);

		assertEquals(adjazenzliste.gibGewichtung(5, 6), 3);
		assertEquals(adjazenzliste.gibGewichtung(6, 5), 3);
		assertEquals(adjazenzliste.gibGewichtung(6, 3), 8);
		assertEquals(adjazenzliste.gibGewichtung(8, 9), 6);
		assertEquals(adjazenzliste.gibGewichtung(10, 11), 23);

		assertEquals(adjazenzliste.gibNachbarknoten(0).toString(), "[1, 2]");
		assertEquals(adjazenzliste.gibNachbarknoten(1).toString(), "[0, 2, 3, 4]");
		assertEquals(adjazenzliste.gibNachbarknoten(5).toString(), "[2, 4, 6, 11]");

		assertEquals(adjazenzliste.gibNachbarknoten(6).toString(), "[2, 3, 5]");
		assertEquals(adjazenzliste.gibNachbarknoten(8).toString(), "[9]");
		assertEquals(adjazenzliste.gibNachbarknoten(10).toString(), "[7, 9, 11]");

		adjazenzliste.KnotenEinfuegen();

		assertEquals(adjazenzliste.gibGroesse(), 13);
		
		adjazenzliste.KanteEinfuegen(10, 12, 3);
		adjazenzliste.KanteEinfuegen(11, 12, 10);
		
		assertEquals(adjazenzliste.gibGewichtung(10, 12), 3);
		assertEquals(adjazenzliste.gibGewichtung(11, 12), 10);
		
		assertEquals(adjazenzliste.gibNachbarknoten(10).toString(), "[7, 9, 11, 12]");
		assertEquals(adjazenzliste.gibNachbarknoten(11).toString(), "[5, 10, 12]");
			
	}
}
