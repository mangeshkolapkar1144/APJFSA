package Javaprogram;

public class NarrowCasting {

	public static void main(String[] args) {

		// bigger  data type
		double doubleA = 11.8;

		// Narrow casting double to integer  
		int intA = (int) doubleA;

		//printing double value
		System.out.println(" double value: " + doubleA);

		//printing integer value
		System.out.println(" Narrowed integer value: " + intA);
	}
}


/*  double value: 11.8
    Narrowed integer value: 11
 */
