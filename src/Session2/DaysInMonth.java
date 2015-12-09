package Session2;

public class DaysInMonth {

	/**
	 * PS: Write a program to print total number of days in the given month.
	 */
	public static void main(String[] args) {
		// variable i is declared with a value.
		
		int i=10;
		// using switch to find the total number of days in a month
		
		switch (i){
		case 1: System.out.println("Total number of days in January is 31"); break;
		case 2: System.out.println("Total number of days in February is 28"); break;
		case 3: System.out.println("Total number of days in March is 31"); break;
		case 4: System.out.println("Total number of days in April is 30"); break;
		case 5: System.out.println("Total number of days in May is 31"); break;
		case 6: System.out.println("Total number of days in June is 30"); break;
		case 7: System.out.println("Total number of days in July is 31"); break;
		case 8: System.out.println("Total number of days in August is 31"); break;
		case 9: System.out.println("Total number of days in September is 30"); break;
		case 10: System.out.println("Total number of days in October is 31"); break;
		case 11: System.out.println("Total number of days in November is 30"); break;
		case 12: System.out.println("Total number of days in December is 31"); break;
		default: System.out.println("Invalid number. Please enter a number between 1 & 12"); // in all other cases.
	
		}

	}

}
