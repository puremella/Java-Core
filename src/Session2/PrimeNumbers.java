package Session2;

public class PrimeNumbers {

	/**
	 * PS: Generate prime number between 1 to 100 using for loop. 
	 */
	public static void main(String[] args) {

		for(int i=1; i<100; i++){
			int count=0, remainder=0; //variables initialized to zero.

			for (int j=1; j<i+1; j++){
				remainder = i%j; // finding the remainder 
				if(remainder==0) // if the remainder is equal to zero increment the count
					count++;
			}
			if(count==2) // if the loop count is equal to two then print the number as prime.
				System.out.print(i+" ");
		}

	}

}
