import java.util.Arrays;

/**
 * Contains the logic for sorting the list of integers. This could implement different sorting algorithms
 * (e.g., bubble sort, merge sort) depending on your needs.
 */
public class Sorter {
    /**
     * Sorts the provided array of integers in ascending order.
     *
     * @param numbers an array of integers to be sorted
     * @return a sorted array of integers in ascending order
     */
    public int[] sort(int[] numbers) {
        // Sorting logic
        Arrays.sort(numbers);
        return numbers;
    }
}
