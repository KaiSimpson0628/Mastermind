import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

//2D arrayList
//secret doesnt get printed everytime
//secret is 4 non repeating pins
//how many turns or trys?
public class Mastermind {
	
	char[] secret;
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
				secret = new char[4];
				int num = 0;
			char[] colors = {'R', 'O', 'G', 'B', 'Y', 'P'};
			for (int x=0; x<4; x++) {
				int temp = (int)(Math.random()*1000);
				num = (int)(Math.random()*6);
				secret[x] = colors[num]; 
				System.out.println(secret[x]);
			}
				
					
		} //close Populate
		/*public void userInterface() {
			Scanner scan = new Scanner(System.in);
			System.out.print("Pick a color by its first letter your options are Red, Orange, Green, Blue, Yellow and Purple\n No repeats");
			System.out.print("Your first guess is: ");
			String guess1 = scan.nextLine();
		}*/
		
		public void buildBoard() {
			int rp = 0;
			int wp =0;
			Scanner scan = new Scanner(System.in);
			System.out.print("Pick a color by its first letter your options are Red, Orange, Green, Blue, Yellow and Purple\nNo repeats");
			System.out.print("\nYour first guess is: ");
			String guess1 = scan.nextLine();
			System.out.print("\nYour second guess is: ");
			String guess2 = scan.nextLine();
			System.out.print("\nYour third guess is: ");
			String guess3 = scan.nextLine();
			System.out.print("\nYour fourth guess is: ");
			String guess4 = scan.nextLine();
			System.out.print("Guesses  \t Scores\n");
	board.add(new ArrayList<String>());
	board.get(0).add(guess1);
	board.get(0).add(guess2);
	board.get(0).add(guess3);
	board.get(0).add(guess4);
	for (int y=0; y<4; y++) {
		for (int z=0; z<4; z++) {
		if (board.get(0).get(y).equals(String.valueOf(secret[z]))) {
			if (y==z) {
				rp = rp + 1;
			}
			else {
			wp = wp + 1;
			}
		} //close if 	
	} //close for loop
	} //close for loop
	board.add(new ArrayList<String>());
	board.get(1).add("RP");
	board.get(1).add(String.valueOf(rp));
	board.get(1).add("WP");
	board.get(1).add(String.valueOf(wp));
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
	//public void printBoard() {
		//System.out.print("Guesses  \t Scores\n");
	
							//}
}

