/**
 * The main class of the Sorting App.
 * This class serves as the entry point for the application.
 * It takes command-line arguments, parses them, and calls the sorter
 * to order the numbers before printing the results.
 * <p>
 * Usage:
 * java App 3 1 4 5
 * <p>
 * Output:
 * 1 3 4 5
 */
public class App {
    /**
     * The main method which serves as the application's entry point.
     * It processes the command-line arguments, invokes the sorting mechanism,
     * and outputs the sorted integers.
     *
     * @param args an array of integers passed as command-line arguments
     */
    public static void main(String[] args) throws SortException {
        if (args == null) {
            throw new SortException("no args... Try again!", false);
        }
        ArgumentParser argumentParser = new ArgumentParser();
        Sorter sorter = new Sorter();
        Printer printer = new Printer();
        System.out.println(printer.print(sorter.sort(argumentParser.parseArguments(args))));
    }
}
