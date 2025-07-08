/**
 * @author Brent Barrows
 * DynamicArray: A flexible, resizable array for integers.
 * Behaves a lot like JavaScript's Array or Java's ArrayList, but built from scratch.
 * No ArrayList or java.util.Arrays tricks allowed.
 */

public class DynamicArray {
    // Internal storage for the numbers. Only use this array, no fancy stuff.
    private int[] numbers;
    // How many slots are actually filled with real data (not just zeros).
    private int count;

    /**
     * No-argument constructor.
     * Starts with a small array of size 3, and nothing in it yet.
     */
    public DynamicArray() {
        numbers = new int[3];
        count = 0;
    }

    /**
     * Constructor with a starting capacity.
     * If you try to start with a negative size, that's not allowed.
     * @param capacity how big to make the starting array
     * @throws IllegalArgumentException if capacity < 0
     */
    public DynamicArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity can't be negative.");
        }
        numbers = new int[capacity];
        count = 0;
    }

    /**
     * Copy constructor.
     * Makes a deep copy of another DynamicArray.
     * @param other the DynamicArray to copy
     * @throws IllegalArgumentException if other is null
     */
    public DynamicArray(DynamicArray other) {
        if (other == null) {
            throw new IllegalArgumentException("Can't copy from null.");
        }
        numbers = new int[other.numbers.length];
        for (int i = 0; i < other.count; i++) {
            numbers[i] = other.numbers[i];
        }
        count = other.count;
    }

    /**
     * How many real elements are in the array right now?
     * @return number of filled slots
     */
    public int getSize() {
        return count;
    }

    /**
     * How big is the actual array (not just the filled part)?
     * @return capacity of the array
     */
    public int getCapacity() {
        return numbers.length;
    }

    /**
     * Get a copy of the whole internal array (including empty slots).
     * @return a new array with all the data (and empty spots)
     */
    public int[] getArray() {
        int[] copy = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            copy[i] = numbers[i];
        }
        return copy;
    }

    /**
     * Get just the filled part of the array as a new array.
     * @return a new array with only the real data
     */
    public int[] toArray() {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = numbers[i];
        }
        return result;
    }

    /**
     * Add a new number to the end.
     * If we're out of room, double the array size.
     * @param num the number to add
     */
    public void push(int num) {
        if (count == numbers.length) {
            resize(numbers.length == 0 ? 1 : numbers.length * 2);
        }
        numbers[count] = num;
        count++;
    }

    /**
     * Remove and return the last number.
     * Shrink the array if it's way too big for the data.
     * @return the number removed
     * @throws RuntimeException if the array is empty
     */
    public int pop() {
        if (count == 0) {
            throw new RuntimeException("Array is empty");
        }
        int value = numbers[count - 1];
        count--;
        if (numbers.length >= 4 && numbers.length >= count * 4) {
            resize(numbers.length / 2);
        }
        return value;
    }

    /**
     * Get the number at a specific spot.
     * @param index where to look
     * @return the number at that spot
     * @throws IndexOutOfBoundsException if index is out of range
     */
    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Illegal index");
        }
        return numbers[index];
    }

    /**
     * Find the first spot where a number appears.
     * @param key the number to look for
     * @return index of the first match, or -1 if not found
     */
    public int indexOf(int key) {
        for (int i = 0; i < count; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Add a number at a specific spot, shifting everything else over.
     * Double the array if needed.
     * @param index where to insert
     * @param num the number to add
     * @throws IndexOutOfBoundsException if index is out of range
     */
    public void add(int index, int num) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Illegal index");
        }
        if (count == numbers.length) {
            resize(numbers.length == 0 ? 1 : numbers.length * 2);
        }
        for (int i = count; i > index; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[index] = num;
        count++;
    }

    /**
     * Remove and return the number at a specific spot, shifting everything else over.
     * Shrink the array if it's way too big for the data.
     * @param index where to remove
     * @return the number removed
     * @throws IndexOutOfBoundsException if index is out of range
     */
    public int remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Illegal index");
        }
        int value = numbers[index];
        for (int i = index; i < count - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        count--;
        if (numbers.length >= 4 && numbers.length >= count * 4) {
            resize(numbers.length / 2);
        }
        return value;
    }

    /**
     * Is the array empty?
     * @return true if nothing is in the array
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Show the array as a string, like [1, 2, 3]
     * @return string version of the filled part of the array
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < count; i++) {
            sb.append(numbers[i]);
            if (i < count - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Check if this array and another are the same (element by element).
     * Doesn't care about capacity, just the data.
     * @param other the DynamicArray to compare
     * @return true if they're the same
     */
    public boolean equals(DynamicArray other) {
        if (other == null || this.count != other.count) return false;
        for (int i = 0; i < count; i++) {
            if (this.numbers[i] != other.numbers[i]) return false;
        }
        return true;
    }

    // Helper: resize the internal array to a new capacity.
    private void resize(int newCapacity) {
        int[] newNumbers = new int[newCapacity];
        for (int i = 0; i < count; i++) {
            newNumbers[i] = numbers[i];
        }
        numbers = newNumbers;
    }
}
