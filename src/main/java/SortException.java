/**
 * Custom exception class used to handle errors during sorting.
 */
public class SortException extends Exception {

    /**
     * Constructor for creating a SortException with a detailed message.
     *
     * @param message the error message to be displayed
     */

    String wrongSize = "\nthe number of arguments is either less then one or more then 10! try again\n";
    String parsingFailure = "\nthe parsing failed... try again\n";
    String noArgs = "\nyou got command line with no args... try again\n";

    public SortException(String message, boolean isWrongSize) {
        super(message);
        if (!isWrongSize) {
            System.out.print(noArgs);
        } else {
            System.out.print(wrongSize);
        }
    }

    public SortException(String message) {
        super(message);
        System.out.print(parsingFailure);
    }


}
