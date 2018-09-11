package jakey;
import java.util.Random;
import java.util.Scanner;
class RandomNumberGenerator {
	
	
	public static void main(String args[]) {

		Random dice = new Random();
		
		int number;
		int average = 0;
		int counter=1;
		int counter2=0;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("How many times would you like to roll the dice? ");
		int input= scan.nextInt();
		
		for(counter=1; counter<=input; counter++) {
				number = 1+dice.nextInt(100);				
				average= average + number;
				System.out.print(number + " ");	
				counter2++;
				if(counter2>15) {
					System.out.println();
					counter2=counter2 - counter2;
				}
				
		}
			int average2= average/counter;
			System.out.println();
			System.out.println("The average of all your rolls is: " + average2);
			
	}
}
	//  ___A_B_
	//	1 |#|#| 
	//	2 |#|#|