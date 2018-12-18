import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GraphenVisualisierenMain
{
	
	public static void main(String args[]) throws IOException
	{
		AdjazensmatrixArray adjazensmatrix;
		Adjazenzliste adjazensliste;
		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    System.out.print("Gib die Graphengroesse ein: ");
	    int eingabe = Integer.parseInt(br.readLine());
	    adjazensmatrix = new AdjazensmatrixArray(eingabe);
	    adjazensliste = new Adjazenzliste(eingabe);
	    
	if(eingabe > 5)
	{
	adjazensliste.KanteEinfuegen(4, 5, 9);
	adjazensliste.KanteEinfuegen(3, 4, 8);
	adjazensliste.KanteEinfuegen(2, 3, 7);
	adjazensliste.KanteEinfuegen(1, 2, 6);
	adjazensliste.KanteEinfuegen(0, 1, 5);
	
	adjazensmatrix.KanteEinfuegen(4, 5, 9);
	adjazensmatrix.KanteEinfuegen(3, 4, 8);
	adjazensmatrix.KanteEinfuegen(2, 3, 7);
	adjazensmatrix.KanteEinfuegen(1, 2, 6);
	adjazensmatrix.KanteEinfuegen(0, 1, 5);
	}
	    	    
	    adjazensmatrix.DebugHilfe();	
	    System.out.println();
	    adjazensliste.DebugHilfe();
	}
}
