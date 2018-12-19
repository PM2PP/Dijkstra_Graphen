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
		System.out.print("Gib die Graphengroesse ein: ");
		int eingabe = Integer.parseInt(br.readLine());
		adjazensmatrix = new AdjazensmatrixArray(eingabe, false);
		adjazensliste = new Adjazenzliste(eingabe);
		adjazensmatrixZufall1 = new AdjazensmatrixArray(eingabe, true);
		adjazensmatrixZufall2 = new AdjazensmatrixArray(eingabe, true);

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

			adjazensmatrix.KanteEinfuegen(0, 1, 3);
			adjazensmatrix.KanteEinfuegen(0, 2, 4);
			adjazensmatrix.KanteEinfuegen(1, 2, 7);
			adjazensmatrix.KanteEinfuegen(1, 3, 3);
			adjazensmatrix.KanteEinfuegen(1, 4, 7);
			adjazensmatrix.KanteEinfuegen(2, 4, 6);
			adjazensmatrix.KanteEinfuegen(2, 5, 8);
			adjazensmatrix.KanteEinfuegen(3, 4, 7);
			adjazensmatrix.KanteEinfuegen(4, 5, 6);
			

		}

		adjazensmatrix.DebugHilfe();
		System.out.println();
		adjazensliste.DebugHilfe();
		System.out.println();
		adjazensmatrixZufall1.DebugHilfe();
		System.out.println();
		adjazensmatrixZufall2.DebugHilfe();

	}
}
