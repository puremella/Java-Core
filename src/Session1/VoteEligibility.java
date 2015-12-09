package Session1;

public class VoteEligibility {


	public static void main(String[] args) {
		/* PS: Write a program to allow user to input his/her age. Then the program
		 has to show whether the person is eligible to vote or not. */

		//Declaring a variable 'age'
		int age=10;

		//checking if age is greater than 18
		if(age>18){
			
			// this block will be executed if age is greater than 18yrs.
			System.out.println("Your age is "+ age + " and you are eligible to vote");
			
		} else {
			
			//this block will be executed if age is leass than 18yrs.
			System.out.println("You are not eligible to vote");
		}
	}
}
