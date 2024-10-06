/**
 * Responsible for parsing the command-line arguments and converting them into a list or array of integers.
 * This class would also handle validation (e.g., checking that there are no more than ten arguments).
 */
public class ArgumentParser {

    /**
     * Parses the command-line arguments into an integer array.
     *
     * @param args an array of command-line arguments to be parsed
     * @return an array of integers for sorting
     * @throws IllegalArgumentException if the input is not valid integers
     */


    public int[] parseArguments(String[] args) throws SortException {
        // Parsing logic
        if (args.length < 1 || args.length > 10) {
            throw new SortException("Parsing failed on size!", true);
        }
        int[] parsedArray = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                parsedArray[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                throw new SortException("Something went wrong during parsing... Try again!");
            }
        }
        return parsedArray;
    }
}
