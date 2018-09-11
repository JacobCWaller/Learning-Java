package jakey;

import java.util.Scanner;
public class PickAShapeLoops {
public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);
	System.out.println("What shape would you like to pick?");
	System.out.println("1. Staircase.");
	System.out.println("2. Square.");
	System.out.println("3. Pyramid.");
	System.out.println("4. Diamond.");
	int input= scan.nextInt();
	if(input==1) {
		staircase(input);
	}if(input == 2) {
		square(input);
	}if(input == 3) {
		pyramid(input);
	}if(input == 4) {
		diamond(input);
	}if(input >= 5) {
		System.out.println("That's not an available Number.");
	}
	}		


public static void staircase(int x) {
	for(int i=0;i<=5;i++) { //Row
		for(int y=0;y<=i;y++) { //Column
		System.out.print("#");
		}
		System.out.println();
	}
}
public static void square(int x) {
	for(int i=1;i<=4;i++) {
		for(int y=1;y<=8;y++) {
		System.out.print("#");
		}
		System.out.println();
	}
}
public static void pyramid(int x) {				//	#
	for(int i=1;i<=7;i++) {						// ###
		for(int y=0;y<=i;y+=3) {				//#####
			System.out.print("\t");				// ###
		}										//  #
		System.out.println("#");
	}
}
public static void diamond(int x) {
	
}
}