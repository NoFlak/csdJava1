/**
* Class for handling long integer values with various mathematical operations
* @author Brent Barrows
*/
public class LongInteger {
    // Private field to store the long value
    private long value;
    
    /**
     * Constructor with long parameter
     * @param value the long value to store
     */
    public LongInteger(long value) {
        this.value = value;
    }
    
    /**
     * Convert to long value
     * @return the stored long value
     */
    public long toLong() {
        return value;
    }
    
    /**
     * Check if stored value is even
     * @return true if value is even, false otherwise
     */
    public boolean isEven() {
        return (value % 2) == 0;
    }
    
    /**
     * Check if stored value is odd
     * @return true if value is odd, false otherwise
     */
    public boolean isOdd() {
        return (value % 2) != 0;
    }
    
    /**
     * Check if stored value is prime
     * @return true if value is prime, false otherwise
     */
    public boolean isPrime() {
        if (value <= 1) return false;
        if (value == 2) return true;
        if (value % 2 == 0) return false;
        
        for (long i = 3; i <= Math.sqrt(value); i += 2) {
            if (value % i == 0) return false;
        }
        return true;
    }
    
    /**
     * Static method to check if a value is even
     * @param value number to check
     * @return true if value is even, false otherwise
     */
    public static boolean isEven(long value) {
        return (value % 2) == 0;
    }
    
    /**
     * Static method to check if a value is odd
     * @param value number to check
     * @return true if value is odd, false otherwise
     */
    public static boolean isOdd(long value) {
        return (value % 2) != 0;
    }
    
    /**
     * Static method to check if a value is prime
     * @param value number to check
     * @return true if value is prime, false otherwise
     */
    public static boolean isPrime(long value) {
        if (value <= 1) return false;
        if (value == 2) return true;
        if (value % 2 == 0) return false;
        
        for (long i = 3; i <= Math.sqrt(value); i += 2) {
            if (value % i == 0) return false;
        }
        return true;
    }
    
    /**
     * Check if stored value equals given long value
     * @param other value to compare with
     * @return true if values are equal, false otherwise
     */
    public boolean equals(long other) {
        return this.value == other;
    }
    
    /**
     * Check if stored value equals another LongInteger's value
     * @param other LongInteger to compare with
     * @return true if values are equal, false otherwise
     */
    public boolean equals(LongInteger other) {
        return this.value == other.value;
    }
    
    /**
     * Parse string into long value without using standard parsing methods
     * @param str string to parse
     * @return parsed long value
     * @throws IllegalArgumentException if string is invalid or value overflows
     */
    public static long parseLong(String str) throws IllegalArgumentException {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Empty string");
        }
        
        // Handle negative numbers
        boolean isNegative = str.charAt(0) == '-';
        int startIndex = isNegative ? 1 : 0;
        
        // Check if string has only '-'
        if (isNegative && str.length() == 1) {
            throw new IllegalArgumentException("Invalid number format");
        }
        
        long result = 0;
        for (int i = startIndex; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("Invalid character in number");
            }
            
            // Check for overflow before multiplying
            if (result > Long.MAX_VALUE / 10) {
                throw new IllegalArgumentException("Number too large");
            }
            
            result = result * 10 + (c - '0');
            
            // Check for overflow after adding digit
            if (result < 0) {
                throw new IllegalArgumentException("Number too large");
            }
        }
        
        // Handle negative numbers and check for underflow
        if (isNegative) {
            if (-result > 0) {
                throw new IllegalArgumentException("Number too small");
            }
            result = -result;
        }
        
        return result;
    }
}
