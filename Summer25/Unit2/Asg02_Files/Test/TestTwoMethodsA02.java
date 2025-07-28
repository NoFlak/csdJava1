import java.io.*;


public class TestTwoMethodsA02 {
	public static boolean testsIsRightTri(PrintWriter outputStream)
	{
        int count = 0;
        int expectedCount = 7;
        
        outputStream.print("\r\n----Tests for isRightTri()----------------------------------------\r\n");

        //*** Test 1 ***//
        //3, 4, 5
       if(TwoMethodsA02.isRightTri(9, 12, 15)) {
       	outputStream.printf("%-50s%-10s\n", "isRightTri() TEST 01",  "PASSED");
       	count++;
       }
       else {
       	outputStream.printf("%-50s%-10s\n", "isRightTri() TEST 01",  "FAILED");
       }
  
       //*** Test 2 ***// 
       // 4, 5, 3
       if(TwoMethodsA02.isRightTri(12, 15, 9)) {
       	outputStream.printf("%-50s%-10s\n", "isRightTri() TEST 02",  "PASSED");
       	count++;
       }
       else {
       	outputStream.printf("%-50s%-10s\n", "isRightTri() TEST 02",  "FAILED");
       }
       
       //*** Test 3 ***//     
       if(TwoMethodsA02.isRightTri(15, 12, 9)) {
       	outputStream.printf("%-50s%-10s\n", "isRightTri() TEST 03",  "PASSED");
       	count++;
       }
       else {
       	outputStream.printf("%-50s%-10s\n", "isRightTri() TEST 03",  "FAILED");
       }
       
       //*** Test 4 ***//     
       if(TwoMethodsA02.isRightTri(9, 15, 12)) {
       	outputStream.printf("%-50s%-10s\n", "isRightTri() TEST 04",  "PASSED");
       	count++;
       }
       else {
       	outputStream.printf("%-50s%-10s\n", "isRightTri() TEST 04",  "FAILED");
       }
       
       //*** Test 5 ***//     
       if(TwoMethodsA02.isRightTri(15, 9, 12)) {
       	outputStream.printf("%-50s%-10s\n", "isRightTri() TEST 05",  "PASSED");
       	count++;
       }
       else {
       	outputStream.printf("%-50s%-10s\n", "isRightTri() TEST 05",  "FAILED");
       }
       
       //*** Test 6 ***//     
       if(TwoMethodsA02.isRightTri(12, 9, 15)) {
       	outputStream.printf("%-50s%-10s\n", "isRightTri() TEST 06",  "PASSED");
       	count++;
       }
       else {
       	outputStream.printf("%-50s%-10s\n", "isRightTri() TEST 06",  "FAILED");
       }
       
       //*** Test 7 ***//     
       if(!TwoMethodsA02.isRightTri(12, 13, 15)) {
       	outputStream.printf("%-50s%-10s\n", "isRightTri() TEST 07",  "PASSED");
       	count++;
       }
       else {
       	outputStream.printf("%-50s%-10s\n", "isRightTri() TEST 07",  "FAILED");
       }
        if (count==expectedCount) return true;
        else return false;
	}
	
	public static boolean testsToll520Bridge(PrintWriter outputStream)
	{
        int count = 0;
        int expectedCount = 10;
        
        outputStream.print("\r\n----Tests for toll520Bridge()----------------------------------------\r\n");

        //*** Test 1 ***//  
        if(TwoMethodsA02.toll520Bridge(5, 20, "aa")==-1) {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 01",  "PASSED");
        	count++;
        }
        else {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 01",  "FAILED");
        }
        
        //*** Test 2 ***//  
        if(TwoMethodsA02.toll520Bridge(5, 65, "am")==-1) {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 02",  "PASSED");
        	count++;
        }
        else {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 02",  "FAILED");
        }
        
        //*** Test 3 ***//  
        if(TwoMethodsA02.toll520Bridge(15, 15, "am")==-1) {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 03",  "PASSED");
        	count++;
        }
        else {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 03",  "FAILED");
        }
        
        //*** Test 4 ***//  
        if(TwoMethodsA02.toll520Bridge(12, 0, "am")==1.25
        		&& TwoMethodsA02.toll520Bridge(12, 1, "am")==1.25
        		&& TwoMethodsA02.toll520Bridge(4, 59, "am")==1.25
        		&& TwoMethodsA02.toll520Bridge(3, 35, "am")==1.25) {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 04",  "PASSED");
        	count++;
        }
        else {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 04",  "FAILED");
        }
        
        //*** Test 5 ***//  
        if(TwoMethodsA02.toll520Bridge(5, 0, "am")==1.4 
        		&& TwoMethodsA02.toll520Bridge(5, 1, "am")==1.4
        		&& TwoMethodsA02.toll520Bridge(7, 59, "am")==1.4 
        		&& TwoMethodsA02.toll520Bridge(6, 03, "am")==1.4) {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 05",  "PASSED");
        	count++;
        }
        else {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 05",  "FAILED");
        }
        
        //*** Test 6 ***//  
        if(TwoMethodsA02.toll520Bridge(8, 0, "am")==2.05 
        		&& TwoMethodsA02.toll520Bridge(10, 59, "am")==2.05 
        		&& TwoMethodsA02.toll520Bridge(9, 15, "am")==2.05) {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 06",  "PASSED");
        	count++;
        }
        else {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 06",  "FAILED");
        }
        
        //*** Test 7 ***//  
        if(TwoMethodsA02.toll520Bridge(11, 0, "am")==2.65 
        		&& TwoMethodsA02.toll520Bridge(4, 59, "pm")==2.65 
        		&& TwoMethodsA02.toll520Bridge(3, 55, "pm")==2.65) {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 07",  "PASSED");
        	count++;
        }
        else {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 07",  "FAILED");
        }
        
        //*** Test 8 ***//  
        if(TwoMethodsA02.toll520Bridge(6, 0, "pm")==2.05 
        		&& TwoMethodsA02.toll520Bridge(8, 59, "pm")==2.05 
        		&& TwoMethodsA02.toll520Bridge(6, 15, "pm")==2.05) {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 08",  "PASSED");
        	count++;
        }
        else {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 08",  "FAILED");
        }
        
        //*** Test 9 ***//  
        if(TwoMethodsA02.toll520Bridge(9, 0, "pm")==1.4 
        		&& TwoMethodsA02.toll520Bridge(10, 59, "pm")==1.4 
        		&& TwoMethodsA02.toll520Bridge(9, 3, "pm")==1.4) {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 09",  "PASSED");
        	count++;
        }
        else {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 09",  "FAILED");
        }
        
        //*** Test 10 ***//  
        if(TwoMethodsA02.toll520Bridge(11, 0, "pm")==1.25 
        		&& TwoMethodsA02.toll520Bridge(11, 59, "pm")==1.25 
        		&& TwoMethodsA02.toll520Bridge(11, 40, "pm")==1.25) {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 10",  "PASSED");
        	count++;
        }
        else {
        	outputStream.printf("%-50s%-10s\n", "toll520Bridge() TEST 10",  "FAILED");
        }
        
        if (count==expectedCount) return true;
        else return false;
	}
}

