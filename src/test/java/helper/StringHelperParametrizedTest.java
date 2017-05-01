package helper;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringHelperParametrizedTest
{
    private StringHelper helper;
    private String actualInput;
    private String expectedOutput;

    @Rule
    public TestName testName = new TestName();

    public StringHelperParametrizedTest(String actualInput, String expectedOutput) {
        this.actualInput = actualInput;
        this.expectedOutput = expectedOutput;
    }

    @Before
    public void before(){
        helper = new StringHelper();
        System.out.println("-> '"+testName.getMethodName()+"'");
    }

    @Parameters
    public static Collection<String[]> testConditions(){
        String[][] conditions = {
                {"ASAFAW","SFAW"},
                {"DSGFAW","DSGFAW"},
                {"",""},
                {"AaAaAa","aAa"}
        };
        return Arrays.asList(conditions);
    }

    @Test
    public void testTruncateAInFirstHalf() throws Exception {
        assertEquals(expectedOutput, helper.truncateAInFirstHalf(actualInput));
    }
}
