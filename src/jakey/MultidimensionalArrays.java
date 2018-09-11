package jakey;

public class MultidimensionalArrays {
	public static void main(String[] args) {
	int firstarray[][]= {{8,9,10,11,12},{12,13,14,15,16}};
	int secondarray[][]= {{17,18,19,20,20},{21,22,23,24,25}};
	System.out.println(firstarray[1][1]);
	
	System.out.println("This is the first array");
	display(firstarray);
	System.out.println("This is the Second array");
	display(secondarray);
	}
	
	
	public static void display(int x[][]) {
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[row].length;col++) {
				System.out.print(x[row][col]+ "\t");
			}
			System.out.println();
		}
		
	}
	
}


