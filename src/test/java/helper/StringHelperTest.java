package helper;

import org.junit.*;
import org.junit.rules.TestName;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StringHelperTest {
    private StringHelper helper;

    @Rule
    public TestName testName = new TestName();

    @BeforeClass
    public static void beforeClass(){
        System.out.println("StringHelperTest start.");
    }

    @Before
    public void before(){
        helper = new StringHelper();
        System.out.println(">> before test '"+testName.getMethodName()+"'");
    }

    @After
    public void after(){
        //TODO
        System.out.println("<< after test '"+testName.getMethodName()+"'");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("StringHelperTest end.");
    }

    @Test
    public void testTruncateAInFirstHalf_even() throws Exception {
        assertEquals("SFAW", helper.truncateAInFirstHalf("ASAFAW"));
        assertEquals("DSGFAW", helper.truncateAInFirstHalf("DSGFAW"));
        assertEquals("", helper.truncateAInFirstHalf(""));
        assertEquals("aAa", helper.truncateAInFirstHalf("AaAaAa"));
    }

    @Test
    public void testTruncateAInFirstHalf_odd() throws Exception {

        assertEquals("SAAW", helper.truncateAInFirstHalf("ASAAW"));
        assertEquals("DGFAW", helper.truncateAInFirstHalf("DGFAW"));
        assertEquals("", helper.truncateAInFirstHalf(""));
        assertEquals("aAaA", helper.truncateAInFirstHalf("AaAaAaA"));
    }

    @Test
    public void testIsHalfIsSame() throws Exception {
        assertTrue(helper.isHalfIsSame("ABAB"));
        assertTrue(helper.isHalfIsSame("AbCdAbCd"));
        assertFalse(helper.isHalfIsSame("Aa"));
        assertFalse(helper.isHalfIsSame("ABab"));
        assertFalse(helper.isHalfIsSame("ABCAB"));
    }

    @Test
    public void testArrayRandSimple(){
        int[] aActual = {1,3,5,2,4,6};
        Arrays.sort(aActual);
        int[] aExpected = {1,2,3,4,5,6};
        assertArrayEquals(aExpected,aActual);
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerException(){
        String test = null;
        test.length();
    }

}