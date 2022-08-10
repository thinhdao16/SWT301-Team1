
package lab4swt;

import org.junit.Test;
import static org.junit.Assert.*;

public class Lab4SWTTestDayInMonth {

    Lab4SWT test;

    public Lab4SWTTestDayInMonth() {
        test = new Lab4SWT();
    }

    @Test
    public void DFID02() {
        boolean rs = test.checkDate(null, null, null);
        assertEquals(false, rs);
    }

    @Test
    public void DFID06() {
        boolean rs = test.checkDate("-1", "5", "2060");
        assertEquals(false, rs);
    }

    @Test
    public void DFID07() {
        boolean rs = test.checkDate("0", "0", "2009");
        assertEquals(false, rs);
    }

    @Test
    public void DFID08() {
        boolean rs = test.checkDate("33", "3", "2000");
        assertEquals(false, rs);
    }

    @Test
    public void DFID09() {
        boolean rs = test.checkDate("30", "13", "2000");
        assertEquals(false, rs);
    }

    @Test
    public void DFID11() {
        boolean rs = test.checkDate("abc", "10", "2020");
        assertEquals(false, rs);
    }

    @Test
    public void DFID14() {
        boolean rs = test.checkDate("1.111", "4", "2009");
        assertEquals(false, rs);
    }

    @Test
    public void DFID15() {
        boolean rs = test.checkDate("29", "2", "2022");
        assertEquals(false, rs);
    }

    @Test
    public void DFID16() {
        boolean rs = test.checkDate("19", "4", "1899");
        assertEquals(true, rs);
    }

    @Test
    public void DFID17() {
        boolean rs = test.checkDate("30", "2", "2000");
        assertEquals(false, rs);
    }

    @Test
    public void DFID18() {
        boolean rs = test.checkDate("31", "4", "2022");
        assertEquals(false, rs);
    }

}
