package helper;

import static org.junit.Assert.*;

public class StringHelperTest {
    @org.junit.Test
    public void testTruncateAInFirstHalf_even() throws Exception {
        StringHelper helper = new StringHelper();
        assertEquals("SFAW", helper.truncateAInFirstHalf("ASAFAW"));
        assertEquals("DSGFAW", helper.truncateAInFirstHalf("DSGFAW"));
        assertEquals("", helper.truncateAInFirstHalf(""));
        assertEquals("aAa", helper.truncateAInFirstHalf("AaAaAa"));
    }

    @org.junit.Test
    public void testTruncateAInFirstHalf_odd() throws Exception {
        StringHelper helper = new StringHelper();
        assertEquals("SAAW", helper.truncateAInFirstHalf("ASAAW"));
        assertEquals("DGFAW", helper.truncateAInFirstHalf("DGFAW"));
        assertEquals("", helper.truncateAInFirstHalf(""));
        assertEquals("aAaA", helper.truncateAInFirstHalf("AaAaAaA"));
    }

}