package jakey;

public class IntroToArrays {
		public static void main(String[] args) {
			
			int jakey[]= new int[100];
			jakey[0]=100;
			int sum=0;
			
			
			System.out.println("Index\tValue");
			int jakey2[]= {1,2,3,4,5,6,7,8,9,10};	
			
			for(int counter=0;counter<jakey2.length;++counter) {
				System.out.println(counter+"\t"+jakey2[counter]);	
			}
			for(int counter=0;counter<jakey2.length;counter++) {
				sum+=jakey2[counter];
			}
			System.out.println("The sum of this array is: "+sum);
		}
}

