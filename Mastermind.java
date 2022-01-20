import java.util.ArrayList;

//2D arrayList
//secret doesnt get printed everytime
//secret is 5 non repeating pins
//how many turns or trys?
public class Mastermind {
	
	
	//int[][] arr = new int[10][8]; //4 secret pins, 4 score locations
	//ArrayList<String> test = new ArrayList<String>();
	ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
	//ArrayList<String> board = new ArrayList<String>();
/*		{{"R", "G", "B", "Y", "b", "w", "o", "o"}
		{"R", "G", "B", "Y", "b", "w", "o", "o"}
		{"R", "G", "B", "Y", "b", "w", "o", "o"}
		{"R", "G", "B", "Y", "b", "w", "o", "o"}}
		*/ 
		public void buildBoard() {
	board.add(new ArrayList<String>());
	board.get(0).add("0");
	
	board.add(new ArrayList<String>());
	board.get(1).add("x");
	System.out.println(board);
}

public void printBoard(){
	System.out.print("/t Guesses /t Scores");
	
	System.out.print(board);
}
}
