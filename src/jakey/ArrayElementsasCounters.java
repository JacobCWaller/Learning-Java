package jakey;
import java.util.Random;
import java.util.Scanner;

public class ArrayElementsasCounters {
	public static void main(String[] args) {
	
		
	Scanner scan= new Scanner(System.in);	
	Random rand = new Random();	
		int freq[]=new int[7];
		
		System.out.println("How many times would you like to roll the dice? ");
		int input = scan.nextInt();
		
		for(int roll=1;roll<input;roll++) {
			++freq[1+rand.nextInt(6)];
		}
		System.out.println("Face\tFrequency");
		for(int face=1;face<freq.length;face++) {
			System.out.println(face+"\t"+freq[face]);
		}
	}
}
