package lab4swt;

import org.junit.Test;
import static org.junit.Assert.*;

public class Lab4SWTTest {

    Lab4SWT test;

    public Lab4SWTTest() {
        test = new Lab4SWT();
    }

    @Test
    public void DFID19() {
        int rs = test.checkMonth("2", "2020");
        assertEquals(29, rs);
    }

    @Test
    public void DFID20() {
        int rs = test.checkMonth("2", "2021");
        assertEquals(28, rs);
    }

    @Test
    public void DFID21() {
        int rs = test.checkMonth("3", "2021");
        assertEquals(31, rs);
    }

    @Test
    public void DFID22() {
        int rs = test.checkMonth("4", "2021");
        assertEquals(30, rs);
    }

    @Test
    public void DFID23() {
        int rs = test.checkMonth("12", "2021");
        assertEquals(31, rs);
    }

    @Test
    public void DFID24() {
        int rs = test.checkMonth(null, "2021");
        assertEquals(0, rs);
    }

    @Test
    public void DFID25() {
        int rs = test.checkMonth("7", null);
        assertEquals(0, rs);
    }

    @Test
    public void DFID26() {
        int rs = test.checkMonth(null, null);
        assertEquals(0, rs);
    }
}
