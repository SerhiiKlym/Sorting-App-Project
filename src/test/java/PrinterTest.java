import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PrinterTest {

    private String input;
    private String expectedOutput;

    public PrinterTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"[1]", new Printer().print((new int[]{1}))},
                {"[7, 9, 23]", new Printer().print((new int[]{7, 9, 23}))},
                {"[-111, -2, 2223, 6900]", new Printer().print((new int[]{-111, -2, 2223, 6900}))},
                {"[-111, -2, 2223, 6900, -111, -2, 2223, 6900, -111, -2, 2223, 6900]", new Printer().print((new int[]{-111, -2, 2223, 6900, -111, -2, 2223, 6900, -111, -2, 2223, 6900}))},
        });
    }


    @Test
    public void print() {
        assertEquals("The strings should be equal", expectedOutput, input);
    }
}