import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GraphenVisualisierenMain
{

	public static void main(String args[]) throws IOException
	{
		AdjazensmatrixArray adjazensmatrixZufall1;
		AdjazensmatrixArray adjazensmatrixZufall2;
		AdjazensmatrixArray adjazensmatrix;
		Adjazenzliste adjazensliste;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Gib die Graphengroesse ein (muss > 6 sein): ");
		int eingabe = Integer.parseInt(br.readLine());
		adjazensmatrix = new AdjazensmatrixArray(eingabe, false);
		adjazensliste = new Adjazenzliste(eingabe);
		adjazensmatrixZufall1 = new AdjazensmatrixArray(eingabe, true);
		adjazensmatrixZufall2 = new AdjazensmatrixArray(eingabe, true);
		AdjazensmatrixArray adjazensmatrix1 = new AdjazensmatrixArray(12, false);

		if (eingabe > 5)
		{ 
			adjazensliste.KanteEinfuegen(0, 1, 3);
			adjazensliste.KanteEinfuegen(0, 2, 4);
			adjazensliste.KanteEinfuegen(1, 2, 7);
			adjazensliste.KanteEinfuegen(1, 3, 3);
			adjazensliste.KanteEinfuegen(1, 4, 7);
			adjazensliste.KanteEinfuegen(2, 4, 6);
			adjazensliste.KanteEinfuegen(2, 5, 8);
			adjazensliste.KanteEinfuegen(3, 4, 7);
			adjazensliste.KanteEinfuegen(4, 5, 6);
			adjazensliste.KanteEinfuegen(5, 6, 3);

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

			adjazensmatrix1.KanteEinfuegen(0, 1, 3);
			adjazensmatrix1.KanteEinfuegen(0, 2, 1);
			adjazensmatrix1.KanteEinfuegen(1, 2, 7);
			adjazensmatrix1.KanteEinfuegen(1, 3, 3);
			adjazensmatrix1.KanteEinfuegen(1, 4, 7);
			adjazensmatrix1.KanteEinfuegen(2, 4, 6);
			adjazensmatrix1.KanteEinfuegen(2, 5, 2);
			adjazensmatrix1.KanteEinfuegen(3, 4, 7);
			adjazensmatrix1.KanteEinfuegen(4, 5, 6);

			adjazensmatrix1.KanteEinfuegen(5, 6, 3);
			adjazensmatrix1.KanteEinfuegen(5, 11, 5);
			adjazensmatrix1.KanteEinfuegen(6, 2, 4);
			adjazensmatrix1.KanteEinfuegen(6, 3, 8);
			adjazensmatrix1.KanteEinfuegen(7, 10, 3);
			adjazensmatrix1.KanteEinfuegen(7, 9, 2);
			adjazensmatrix1.KanteEinfuegen(8, 9, 6);
			adjazensmatrix1.KanteEinfuegen(10, 9, 8);
			adjazensmatrix1.KanteEinfuegen(10, 11, 23);

		}

		adjazensmatrix.DebugHilfe();
		System.out.println();
		adjazensliste.DebugHilfe();
		System.out.println();
		adjazensmatrixZufall1.DebugHilfe();
		System.out.println();
		adjazensmatrixZufall2.DebugHilfe();
		System.out.println();
		System.out.println();
		DijkstraAlgo algoM = new DijkstraAlgo(adjazensmatrix);
		System.out.println(algoM.ermittleKuerzestenWege(0));
		System.out.println();
		DijkstraAlgo algoL = new DijkstraAlgo(adjazensliste);
		System.out.println(algoL.ermittleKuerzestenWege(0));
		System.out.println();
		System.out.println(algoM.ermittleKuerzestenWege(1));
		System.out.println();
		System.out.println(algoL.ermittleKuerzestenWege(1));
		System.out.println();
		System.out.println(algoM.ermittleKuerzestenWege(2));
		System.out.println();
		System.out.println(algoL.ermittleKuerzestenWege(2));
		System.out.println();
		System.out.println(algoM.ermittleKuerzestenWege(3));
		System.out.println();
		System.out.println(algoL.ermittleKuerzestenWege(3));
		System.out.println();
		System.out.println(algoM.ermittleKuerzestenWege(4));
		System.out.println();
		System.out.println(algoL.ermittleKuerzestenWege(4));
		System.out.println();
		System.out.println(algoM.ermittleKuerzestenWege(5));
		System.out.println();
		System.out.println(algoL.ermittleKuerzestenWege(5));
		System.out.println();
		System.out.println(algoM.ermittleKuerzestenWege(6));
		System.out.println();
		System.out.println(algoL.ermittleKuerzestenWege(6));
		System.out.println();
		
		DijkstraAlgo algoM1 = new DijkstraAlgo(adjazensmatrix1);
		System.out.println(algoM1.ermittleKuerzestenWege(0));
		System.out.println();
		// DijkstraAlgo algoL1 = new DijkstraAlgo(adjazensliste);
		// System.out.println(algoL1.ermittleKuerzestenWege(5));

	}
}
