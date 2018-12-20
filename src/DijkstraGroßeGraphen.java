
public class DijkstraGroßeGraphen
{
	
	public DijkstraGroßeGraphen()
	{

	}
	
	public static void main(String[] args)
	{
		AdjazensmatrixArray matrix1 = new AdjazensmatrixArray(10, true);
		AdjazensmatrixArray matrix2 = new AdjazensmatrixArray(100, true);
		AdjazensmatrixArray matrix3 = new AdjazensmatrixArray(1000, true);
		AdjazensmatrixArray matrix4 = new AdjazensmatrixArray(10000, true);	
//		AdjazensmatrixArray adjazensmatrix = new AdjazensmatrixArray(10, false);	
		DijkstraAlgo algo1 = new DijkstraAlgo(matrix1);
		DijkstraAlgo algo2 = new DijkstraAlgo(matrix2);
		DijkstraAlgo algo3 = new DijkstraAlgo(matrix3);
		DijkstraAlgo algo4 = new DijkstraAlgo(matrix4);
//		DijkstraAlgo algo5 = new DijkstraAlgo(adjazensmatrix);
		
		algo1.ermittleKuerzestenWege(0);
		algo2.ermittleKuerzestenWege(0);
	    algo3.ermittleKuerzestenWege(0);
	    algo4.ermittleKuerzestenWege(0);
//	    System.out.println("Tracking-Liste für 10.000 Knoten");
	    algo3.printKeyListe();
	    algo3.printTrackingListe();
	    
//	    adjazensmatrix.KanteEinfuegen(0, 1, 9);
//		adjazensmatrix.KanteEinfuegen(0, 2, 1);
//		adjazensmatrix.KanteEinfuegen(2, 1, 2);
//		adjazensmatrix.KanteEinfuegen(0, 3, 8);
//		adjazensmatrix.KanteEinfuegen(0, 4, 1);
//		adjazensmatrix.KanteEinfuegen(4, 5, 1);
//		adjazensmatrix.KanteEinfuegen(5, 6, 1);
//		adjazensmatrix.KanteEinfuegen(6, 3, 1);
//		adjazensmatrix.KanteEinfuegen(6, 9, 2);
//		adjazensmatrix.DebugHilfe();
//		System.out.println();
//		algo5.ermittleKuerzestenWege(0);
//		algo5.printKeyListe();
//		algo5.printTrackingListe();
	   
	    System.out.print("Dijkstra-Alogrithmen für 10^1, 10^2, 10^3 und 10^4 ausgeführt");
	}
}
