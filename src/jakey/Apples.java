package jakey;
public class Apples {
	public static void main(String args[]) {

		System.out.println("_______________________");
		char a = 'A';
		
		System.out.print("___");
		for(int colu=0;colu<10;colu++) {
			System.out.print(a+ "_");			
			a++;
		}
		System.out.println();
		for(int line=1;line<=10;line++) {
			System.out.print(line + " ");	
			for(int grid=1;grid<=10;grid++) 
				System.out.print("|#");
			System.out.print("|");
			System.out.println();
		}				
	}
}
	//  ___A_B_
	//	1 |#|#| 
	//	2 |#|#|