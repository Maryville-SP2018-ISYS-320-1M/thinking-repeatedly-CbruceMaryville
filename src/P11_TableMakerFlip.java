//I do not have any code like this from class. Im assuming it is from the session
//I missed. Therefore I made the table myself.
/*
  	ISYS 320
  	Name(s):Clayton Bruce
  	Date: 3/25/2018
*/
public class Tablemaker {

	public static void main(String[] args) {
		PrintFives();
		System.out.println();
		PrintFours();
		System.out.println();
		PrintThrees();
		System.out.println();
		PrintTwos();
		System.out.println();
		PrintOnes();
	}


	
	private static void PrintFives() {
		for (int i = 1; i < 11; i++) {
			System.out.print((i*5) + " ");
		}

	}

	private static void PrintFours() {
		for (int i=1; i<11; i ++) {
			System.out.print(i*4 + " ");
		}
	}
	
	private static void PrintThrees() {
		for (int i=1; i<11; i ++) {
			System.out.print(i*3 + " ");
		}
	}
	
	private static void PrintTwos() {
		for (int i=1; i<11; i ++) {
			System.out.print(i*2 + " ");
		}
	}
	
	private static void PrintOnes() {
		for (int i=1; i<11; i ++) {
			System.out.print(i*1 + " ");
		}
	}
	
	
	/*
5 10 15 20 25 30 35 40 45 50 
4 8 12 16 20 24 28 32 36 40 
3 6 9 12 15 18 21 24 27 30 
2 4 6 8 10 12 14 16 18 20 
1 2 3 4 5 6 7 8 9 10 
	 */
	
	
	
	
	
	
	
	
}
