import java.util.Scanner;

public class Loops {

		// Assignment: Place the n-queens on the chessboard by taking input form the User
		//			   eg: User says row -> 1 and col -> 1 as input -> replace it with queen
		//			   a total of 4 inputs can be taken to place 4 queens in the chessboard
		//			   no queen can be placed in the same row again or same column again :)
		//			   Hint: use a do, while loop and make sure not to take more than 4 queens positions 

	public static boolean isSafeAndOk(char[][] arr,int row,int col){

		//Checking if queen is already Placed
		if(arr[row][col] == '\u2655'){
			System.out.println("Queen Already Placed Here");
			return false;
		}

		//Checking if any queen exist in same row
		for (int i = 0; i < arr.length; i++) {
			if(arr[row][i] == '\u2655'){
				return false;
			}
		}

		//Checking if any queen exist in same col
		for (int i = 0; i < arr.length; i++) {
			if(arr[i][col] == '\u2655'){
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char whiteBox = '\u25A1';
		char blackBox = '\u25A0';
		char queen = '\u2655';
		
		
		Scanner sc = new Scanner(System.in);
		int n  = 8;
		char arr[][] = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i%2 == 0){
					arr[i][j] = (j%2 ==0)?blackBox:whiteBox;
				}else{
					arr[i][j] = (j%2 ==0)?whiteBox:blackBox;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int i =0;
		while (i<4) {
			System.out.println("Enter the Position in 2d array where you want to place n queens");
			System.out.println("Enter Row");
			int r = sc.nextInt();
			System.out.println("Enter Col");
			int c = sc.nextInt();

			if(isSafeAndOk(arr,r-1,c-1)){
				arr[r-1][c-1] = queen;
				i++;
			}else{
				System.out.println("Try again with valid position");
			}
			
		}
		
		for (int k = 0; i < n; k++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[k][j] + " ");
			}
			System.out.println();
		}

		sc.close();


	
		
	}

}
