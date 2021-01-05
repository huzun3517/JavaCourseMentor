package Sema._03_TwoDArray;

public class Q6 {

	public static void main(String[] args) {
		String[][] arr= {{"A","B","C","D"},{"E","F"}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
				if (arr[i][j].equals("B")){
					break;
			} 	}
			continue;
	} 	}


}
/*
A B C
A B C D E F
A B E F
Compilation fails.
 */