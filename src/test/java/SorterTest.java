import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class SorterTest {

    private int[] input;
    private int[] expectedOutput;

    public SorterTest(int[] input, int[] expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{1}, new Sorter().sort(new int[]{1})},
                {new int[]{1, 2, 3}, new Sorter().sort(new int[]{3, 2, 1})},
                {new int[]{1, 2, 3, 4334, 888888, 9999999}, new Sorter().sort(new int[]{9999999, 888888, 3, 2, 4334, 1})},
                {new int[]{-3, -3, -3, -2, 0, 42, 42}, new Sorter().sort(new int[]{42, -3,  0, -3, -3, -2, 42})},
                {new int[]{-3, -3, -3, -2, 0, 42, 42, 89, 99, 11000}, new Sorter().sort(new int[]{99, 89, 11000, 42, -3,  0, -3, -3, -2, 42})},

        });
    }

    @Test
    public void sort() {
        assertArrayEquals("sorted from the last", expectedOutput, input);
    }
}