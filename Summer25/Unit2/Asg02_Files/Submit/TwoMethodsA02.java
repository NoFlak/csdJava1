/**
* @author Brent Barrows
* Help from https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
* & https://www.w3schools.com/java/java_methods_param.asp
* & format help from https://www.geeksforgeeks.org/java/format-specifiers-in-java/
*/
public class TwoMethodsA02
 {

  
    /**
     * Method checks if a triangle with given lengths of sides is a right triangle
     * @param a triangle side squared plus,
     * @param b triangle side squared equals,
     * @param c triangle side
     * @return true if the triangle is right, false if it is not
     */
    public static boolean isRightTri(int a, int b, int c)
    {
        int a2 = a*a;
        int b2 = b*b;
        int c2 = c*c;
        return  (a2 + b2 == c2) ||
                (a2 + c2 == b2) ||
                (b2 + c2 == a2);
    }
    /**
     * The method takes hour, minute, and "am", "pm" components of the time stamp of the moment when car crosses the bridge and calculates the toll rate.
     * If any of the time stamp components are invalid, -1 is being returned as an error code.
     * @param hour hour component of the time stamp 
     * @param min minute component of the time stamp
     * @param amPm either string "am" or "pm", component of the time stamp
     * @return the toll rate  
     */
    public static double toll520Bridge(int hour, int min, String amPm)
    {
        /* Validate input and error handling using assignment suggested method insted of "am" || "Am" || "aM" || "AM" but this gives me an idea for a email firewall tool/url-checker-prechecker based on frequently--
         used scammer alternatives using alternate letterings would be even better if point to a honeypot for any files dumped. Although its a pretty common sounding tool that I am sure plenty of security techs have built up with already.*/
    if (hour < 1 || hour > 12 || min < 0 || min > 59 || 
        (!amPm.equalsIgnoreCase("am") && !amPm.equalsIgnoreCase("pm"))) {
        return -1;
    }

    // Convert to minutes since midnight in 24-hour format 
    int totalMinutes = (hour % 12) * 60 + min;
    if (amPm.equalsIgnoreCase("pm")) {
        totalMinutes += 12 * 60;
    }

    // Now time to figure out the toll based on time ranges this seemed like easiest way to handle problem altough curious what others came up with after reviewing the code examples.
    if ((totalMinutes >= 0 && totalMinutes <= 299) ||     // Midnight–4:59 am
        (totalMinutes >= 1380 && totalMinutes <= 1439)) {  // 11:00 pm–11:59 pm
        return 1.25;
    }
    else if ((totalMinutes >= 300 && totalMinutes <= 479) ||   // 5:00–7:59 am
             (totalMinutes >= 1260 && totalMinutes <= 1319)) { // 9:00–10:59 pm
        return 1.40;
    }
    else if ((totalMinutes >= 480 && totalMinutes <= 659) ||   // 8:00–10:59 am
             (totalMinutes >= 1080 && totalMinutes <= 1259)) { // 6:00–8:59 pm
        return 2.05;
    }
    else if (totalMinutes >= 660 && totalMinutes <= 1079) {    // 11:00 am–5:59 pm
        return 2.65;
    }

    // marker value for error handling
    return -1;
    }


    public static void testIsRightTri()
    {
    	System.out.println("\r\n----Tests for isRightTri()------------------------------------------------------------\r\n");
    	
         // Test 1 //
        if(isRightTri(3, 4, 5)) {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 01 -- isRightTri(3, 4, 5) - right triangle",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 01 -- isRightTri(3, 4, 5) - right triangle",  "FAILED");
        }
   
        // Test 2 //     
        if(isRightTri(4, 5, 3)) {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 02 -- isRightTri(4, 5, 3) - right triangle",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 02 -- isRightTri(4, 5, 3) - right triangle",  "FAILED");
        }
        
        // Test 3 //     
        if(isRightTri(5, 4, 3)) {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 03 -- isRightTri(5, 4, 3) - right triangle",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 03 -- isRightTri(5, 4, 3) - right triangle",  "FAILED");
        }
        
        // Test 4 //     
        if(isRightTri(3, 5, 4)) {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 04 -- isRightTri(3, 4, 5) - right triangle",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 04 -- isRightTri(3, 4, 5) - right triangle",  "FAILED");
        }
        
        // Test 5 //     
        if(isRightTri(5, 3, 4)) {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 05 -- isRightTri(5, 3, 4) - right triangle",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 05 -- isRightTri(5, 3, 4) - right triangle",  "FAILED");
        }
        
        // Test 6 //     
        if(isRightTri(4, 3, 5)) {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 06 -- isRightTri(4, 3, 5) - right triangle",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 06 -- isRightTri(4, 3, 5) - right triangle",  "FAILED");
        }
        
        // Test 7 //     
        if(!isRightTri(4, 4, 5)) {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 07 -- isRightTri(4, 4, 5) - NOT rigth trianlge",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 07 -- isRightTri(4, 4, 5)  - NOT rigth trianlge",  "FAILED");
        }
    }
    
    public static void testToll520Bridge()
    {
    	System.out.println("\r\n----Tests for toll520Bridge()---------------------------------------------------------\r\n");
    	
        // Test 1 //  
        if(toll520Bridge(5, 20, "aa") == -1) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 01 -- incorrect range of amPm argument must return -1",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 01 -- incorrect range of amPm argument must return -1",  "FAILED");
        }
        
        // Test 2 //  
        if(toll520Bridge(5, 65, "am") == -1) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 02 -- incorrect range of minutes argument must return -1",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 02 -- incorrect range of minutes argument must return -1",  "FAILED");
        }
        
        // Test 3 //  
        if(toll520Bridge(15, 15, "am") == -1) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 03 -- incorrect range of hours argument must return -1",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 03 -- incorrect range of hours argument must return -1",  "FAILED");
        }
        
        // Test 4 //  
        if(toll520Bridge(12, 0, "am")==1.25
        		&& toll520Bridge(12, 1, "am")==1.25
        		&& toll520Bridge(4, 59, "am")==1.25
        		&& toll520Bridge(3, 35, "am")==1.25) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 04 -- calls that must return 1.25",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 04 -- calls that must return 1.25",  "FAILED");
        }
        
        // Test 5 //  
        if(toll520Bridge(5, 0, "am")==1.4 
        		&& toll520Bridge(5, 1, "am")==1.4
        		&& toll520Bridge(7, 59, "am")==1.4 
        		&& toll520Bridge(6, 03, "am")==1.4) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 05 -- calls that must return 1.40 in am",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 05 -- calls that must return 1.40 in am",  "FAILED");
        }
        
        // Test 6 //  
        if(toll520Bridge(8, 0, "am")==2.05 
        		&& toll520Bridge(10, 59, "am")==2.05 
        		&& toll520Bridge(9, 15, "am")==2.05) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 06 -- calls that must return 2.05 in am",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 06 -- calls that must return 2.05 in am",  "FAILED");
        }
        
        // Test 7 //  
        if(toll520Bridge(11, 0, "am")==2.65 
        		&& toll520Bridge(4, 59, "pm")==2.65 
        		&& toll520Bridge(3, 55, "pm")==2.65) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 07 -- calls that must return 2.65",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 07 -- calls that must return 2.65",  "FAILED");
        }
        
        // Test 8 //  
        if(toll520Bridge(6, 0, "pm")==2.05 
        		&& toll520Bridge(8, 59, "pm")==2.05 
        		&& toll520Bridge(6, 15, "pm")==2.05) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 08 -- calls that must return 2.05 in pm",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 08 -- calls that must return 2.05 in pm",  "FAILED");
        }
        
        // Test 9 //  
        if(toll520Bridge(9, 0, "pm")==1.4 
        		&& toll520Bridge(10, 59, "pm")==1.4 
        		&& toll520Bridge(9, 3, "pm")==1.4) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 09 -- calls that must return 1.40 in pm",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 09 -- calls that must return 1.40 in pm",  "FAILED");
        }
        
        // Test 10 //  
        if(toll520Bridge(11, 0, "pm")==1.25 
        		&& toll520Bridge(11, 59, "pm")==1.25 
        		&& toll520Bridge(11, 40, "pm")==1.25) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 10 -- calls that must return 1.25 in pm",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 10 -- calls that must return 1.25 in pm",  "FAILED");
        }
    }
        
 
     /** Method main()contains all the tests 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        testIsRightTri();
        System.out.println("\n--------------------------------------------------------\n");
        testToll520Bridge();
        
    }    
}
