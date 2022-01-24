import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

//2D arrayList
//secret doesnt get printed everytime
//secret is 4 non repeating pins
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
		public void populateBoard() {
				char[] secret = new char[4];
			char[] colors = {'R', 'O', 'G', 'B', 'Y', 'P'};
			for (int x=0; x<4; x++) {
				int num = (int)(Math.random()*6);
				secret[x] = colors[num]; 
									}
				
				
				
				
				
			
		} //close Populate
		
		public void buildBoard() {
	board.add(new ArrayList<String>());
	board.get(0).add("_");
	board.get(0).add("_");
	board.get(0).add("_");
	board.get(0).add("_");
	board.add(new ArrayList<String>());
	board.get(1).add("_");
	board.get(1).add("_");
	board.get(1).add("_");
	board.get(1).add("_");
	board.add(new ArrayList<String>());
	board.get(2).add("_");
	board.get(2).add("_");
	board.get(2).add("_");
	board.get(2).add("_");
	board.add(new ArrayList<String>());
	board.get(3).add("_");
	board.get(3).add("_");
	board.get(3).add("_");
	board.get(3).add("_");
	int next = 0;
		for(int i = 0; i<board.size(); i++)
		{
			if(i%2==0) {
				System.out.print("---------------------------\n");
				System.out.print(board.get(i)+"\t");
				//next = -1;
				//i--;
			} else {
			System.out.println(board.get(i));
			//next++;
			}
	//System.out.println(board);
}
}
	public void printBoard() {
		System.out.print("Guesses  \t Scores\n");
	
							}
}

