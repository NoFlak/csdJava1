import java.io.*;

public class TestTwoMethodsA03 {

	/**
	 * A set of tests for getLagrestDigit() method
	 */
	public static boolean testGetLargestDigit(PrintWriter outputStream) {

        int count = 0;
        int expectedCount = 4;
        
		outputStream.println("\r\n----Tests for getLargestDigit()-------------------------------------------------------\r\n");
		
		// Test 1 //
		if (TwoMethodsA03.getLargestDigit(0) == 0 
				&& TwoMethodsA03.getLargestDigit(9) == 9) {			
			outputStream.printf("%-80s%-10s\n", "getLargestDigit() TEST 01 - single digit positive argument",  "PASSED");
			count++;
		}
		else {
			outputStream.printf("%-80s%-10s\n", "getLargestDigit() TEST 01 - single digit positive argument",  "FAILED");
		}

		// Test 2 //
		if (TwoMethodsA03.getLargestDigit(-5) == 5) {
			outputStream.printf("%-80s%-10s\n", "getLargestDigit() TEST 02 - single digit negative argument",  "PASSED");
			count++;
		}
		else {
			outputStream.printf("%-80s%-10s\n", "getLargestDigit() TEST 02 - single digit negative argument",  "FAILED");
		}

		// Test 3 //
		if (TwoMethodsA03.getLargestDigit(9881) == 9 
				&& TwoMethodsA03.getLargestDigit(12348) == 8
				&& TwoMethodsA03.getLargestDigit(33) == 3) {
			outputStream.printf("%-80s%-10s\n", "getLargestDigit() TEST 03 - multiple digit positive argument",  "PASSED");
			count++;
		}
		else {
			outputStream.printf("%-80s%-10s\n", "getLargestDigit() TEST 03 - multiple digit positive argument",  "FAILED");	
			
		}

		//  Test 4 //
		if (TwoMethodsA03.getLargestDigit(-5565) == 6 
				&& TwoMethodsA03.getLargestDigit(-9881) == 9 
				&& TwoMethodsA03.getLargestDigit(-12348) == 8
				&& TwoMethodsA03.getLargestDigit(-33) == 3) {
			outputStream.printf("%-80s%-10s\n", "getLargestDigit() TEST 04 - multiple digit negative argument",  "PASSED");
			count++;
		}
		else {
			outputStream.printf("%-80s%-10s\n", "getLargestDigit() TEST 04 - multiple digit negative argument",  "FAILED");	
		}

        if (count==expectedCount) return true;
        else return false;
	}

	public static boolean testFractionSum(PrintWriter outputStream) {
		
        int count = 0;
        int expectedCount = 3;
		outputStream.println("\r\n----Tests for fractionSum()-----------------------------------------------------------\r\n");
		//  Test 1 //
		if (TwoMethodsA03.fractionSum(-55).equals("") && TwoMethodsA03.fractionSum(0).equals("")) {
			outputStream.printf("%-80s%-10s\n", "fractionSum() TEST 01 - argument less than 1",  "PASSED");
			count++;
		}
		else {
			outputStream.printf("%-80s%-10s\n", "fractionSum() TEST 01 - argument less than 1",  "FAILED");
		}

		//  Test 2 //
		
		if (TwoMethodsA03.fractionSum(1).equals("2/1 = 2.00000")) {
			outputStream.printf("%-80s%-10s\n", "fractionSum() TEST 02 - argument 1",  "PASSED");
			count++;
		}
		else {
			outputStream.printf("%-80s%-10s\n", "fractionSum() TEST 02 - argument 1",  "FAILED");
		}

		//  Test 3 //
		if (TwoMethodsA03.fractionSum(2).equals("2/1 + 3/2 = 3.50000")
				&& TwoMethodsA03.fractionSum(3).equals("2/1 + 3/2 + 4/3 = 4.83333")
				&& TwoMethodsA03.fractionSum(6).equals("2/1 + 3/2 + 4/3 + 5/4 + 6/5 + 7/6 = 8.45000")
				&& TwoMethodsA03.fractionSum(10).equals("2/1 + 3/2 + 4/3 + 5/4 + 6/5 + 7/6 + 8/7 + 9/8 + 10/9 + 11/10 = 12.92897")) {
			
		
			outputStream.printf("%-80s%-10s\n", "fractionSum() TEST 03 - argument other than 1",  "PASSED");
			count++;
		}
		else {
			outputStream.printf("%-80s%-10s\n", "fractionSum() TEST 03 - argument other than 1",  "FAILED");
		}

        if (count==expectedCount) return true;
        else return false;
	}


}
