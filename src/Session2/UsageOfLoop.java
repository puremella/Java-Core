package Session2;

public class UsageOfLoop {

    // PS: usage of loop
	
	public static void main(String[] args) {
		
		int count = 10; // variable for loop iteration
		
		for (int i=1; i<count; i++){
			if (i<=5){
				for (int j=1; j<i+1; j++){ // first "for" loop incrementing
					System.out.print(j);
				}
				System.out.println();
			} // end of first "if" statement
			if (i>=5){
				int k = count-i;
				for (int j=1; j<k; j++){ // second "for" loop decrementing
					System.out.print(j);
				}
				System.out.println();
				
			} // end of 2nd "if" statement 
			
		}// end of for loop
		
	} // end of method

}// End of class
