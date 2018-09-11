package jakey;

public class ArraysInMethods {
	public static void main(String[] args) {
		int jakey[]= {3,4,5,6,7};
		change(jakey);//this calls the method below
		
		for(int y:jakey) //This loop just loops through the array 'jakey' and sets y to whatever part of the array it's on
			System.out.println(y);
	}
	
	public static void change(int x[]) {
		for(int counter=0;counter<x.length;counter++) {
			x[counter]+=5;//this adds 5 to every integer in the array that gets called above
		}
	}
}
