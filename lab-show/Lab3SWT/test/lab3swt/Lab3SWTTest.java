package lab3swt;

import org.junit.Test;
import static org.junit.Assert.*;

public class Lab3SWTTest {

    Lab3SWT test;

    public Lab3SWTTest() {
        test = new Lab3SWT();
    }

    @Test
    public void UTCID01() {
        boolean rs = test.checkDate("12", "12", "2012");
        assertEquals(true, rs);
    }

    @Test
    public void UTCID02() {
        boolean rs = test.checkDate("29", "2", "2020");
        assertEquals(true, rs);
    }

    @Test
    public void UTCID03() {
        boolean rs = test.checkDate("28", "2", "2021");
        assertEquals(true, rs);
    }

    @Test
    public void UTCID04() {
        boolean rs = test.checkDate(null, null, null);
        assertEquals(false, rs);
    }

    @Test
    public void UTCID05() {
        boolean rs = test.checkDate("nul", "12", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID06() {
        boolean rs = test.checkDate("29", null, "2020");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID07() {
        boolean rs = test.checkDate("28", "2", null);
        assertEquals(false, rs);
    }

    @Test
    public void UTCID08() {
        boolean rs = test.checkDate(null, null, "2021");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID09() {
        boolean rs = test.checkDate(null, "12", null);
        assertEquals(false, rs);
    }

    @Test
    public void UTCID10() {
        boolean rs = test.checkDate("28", null, null);
        assertEquals(false, rs);
    }

    @Test
    public void UTCID11() {
        boolean rs = test.checkDate("31", "1", "2020");
        assertEquals(true, rs);
    }

    @Test
    public void UTCID12() {
        boolean rs = test.checkDate("32", "1", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID13() {
        boolean rs = test.checkDate("28", "2", "2021");
        assertEquals(true, rs);
    }

    @Test
    public void UTCID14() {
        boolean rs = test.checkDate("29", "2", "2021");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID15() {
        boolean rs = test.checkDate("29", "2", "2020");
        assertEquals(true, rs);
    }

    @Test
    public void UTCID16() {
        boolean rs = test.checkDate("30", "2", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID17() {
        boolean rs = test.checkDate("31", "3", "2020");
        assertEquals(true, rs);
    }

    @Test
    public void UTCID18() {
        boolean rs = test.checkDate("32", "3", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID19() {
        boolean rs = test.checkDate("30", "4", "2020");
        assertEquals(true, rs);
    }

    @Test
    public void UTCID20() {
        boolean rs = test.checkDate("31", "4", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID21() {
        boolean rs = test.checkDate("31", "5", "2020");
        assertEquals(true, rs);
    }

    @Test
    public void UTCID22() {
        boolean rs = test.checkDate("32", "5", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void DFID23() {
        boolean rs = test.checkDate("30", "6", "2020");
        assertEquals(true, rs);
    }

    @Test
    public void DFID24() {
        boolean rs = test.checkDate("31", "6", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void DFID25() {
        boolean rs = test.checkDate("31", "7", "2020");
        assertEquals(true, rs);
    }

    @Test
    public void DFID26() {
        boolean rs = test.checkDate("32", "7", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void DFID27() {
        boolean rs = test.checkDate("31", "8", "2020");
        assertEquals(true, rs);
    }

    @Test
    public void DFID28() {
        boolean rs = test.checkDate("32", "8", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void DFID29() {
        boolean rs = test.checkDate("30", "9", "2020");
        assertEquals(true, rs);
    }

    @Test
    public void DFID30() {
        boolean rs = test.checkDate("31", "9", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void DFID31() {
        boolean rs = test.checkDate("31", "10", "2020");
        assertEquals(true, rs);
    }

    @Test
    public void DFID32() {
        boolean rs = test.checkDate("32", "10", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void DFID33() {
        boolean rs = test.checkDate("30", "11", "2022");
        assertEquals(true, rs);
    }

    @Test
    public void DFID34() {
        boolean rs = test.checkDate("31", "11", "2022");
        assertEquals(false, rs);
    }

    @Test
    public void DFID35() {
        boolean rs = test.checkDate("31", "12", "2022");
        assertEquals(true, rs);
    }

    @Test
    public void DFID36() {
        boolean rs = test.checkDate("32", "12", "2022");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID37() {
        boolean rs = test.checkDate("32", "13", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID38() {
        boolean rs = test.checkDate("12", "13", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID39() {
        boolean rs = test.checkDate("12", "0", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID40() {
        boolean rs = test.checkDate("abc", "12", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID41() {
        boolean rs = test.checkDate("12", "abc", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID42() {
        boolean rs = test.checkDate("12", "12", "abc");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID43() {
        boolean rs = test.checkDate("abc", "abc", "abc");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID44() {
        boolean rs = test.checkDate("abc", "abc", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID45() {
        boolean rs = test.checkDate("abc", "12", "abc");
        assertEquals(false, rs);
    }

    @Test
    public void UTCID46() {
        boolean rs = test.checkDate("12", "abc", "abc");
        assertEquals(false, rs);
    }
}
