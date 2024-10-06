import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ArgumentParserTest {

    private String[] input;
    private int[] expectedOutput;
    private Class<? extends SortException> expectedException;

    public ArgumentParserTest(String[] input,
                              int[] expectedOutput,
                              Class<? extends SortException> expectedException) {
        this.input = input;
        this.expectedOutput = expectedOutput;
        this.expectedException = expectedException;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String[0], new int[0], SortException.class},
                {new String[]{"1"}, new int[]{1}, null},
                {new String[]{"8", "2", "10", "4", "5", "6", "7", "1", "-9", "3"}, new int[]{8, 2, 10, 4, 5, 6, 7, 1, -9, 3}, null},
                {new String[]{"8", "2", "10"}, new int[]{8, 2, 10}, null},
                {new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"}, new int[]{}, SortException.class},
                {new String[]{"1", "2", "3", "4", "5", "WW", "7", "8", "9", "10"}, new int[]{}, SortException.class},
                {new String[]{"1", "2", "ww"}, new int[]{}, SortException.class},
        });
    }

    @Test
    public void parseArguments() {
        try {
            int[] result = new ArgumentParser().parseArguments(input);
            assertArrayEquals(result, expectedOutput);
        } catch (SortException e) {
            if (expectedException != null) {
                assertTrue(expectedException.isInstance(e));
            } else {
                fail("Unexpected exception: " + e);
            }
        }
        finally {

        }

    }
}