
package lab3swt.testDayInMonth;

import lab3swt.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class Lab3SWTTestDayinMonth {

    Lab3SWT test;

    public Lab3SWTTestDayinMonth() {
        test = new Lab3SWT();
    }

    @Test
    public void UTCID01() {
        int rs = test.checkMonth( "1", "2020");
        assertEquals(31, rs);
    }

     @Test
    public void UTCID02() {
        int rs = test.checkMonth( "2", "2021");
        assertEquals(28, rs);
    }
 @Test
    public void UTCID03() {
        int rs = test.checkMonth( "2", "2020");
        assertEquals(29, rs);
    }
    @Test
    public void UTCID04() {
        int rs = test.checkMonth( "3", "2020");
        assertEquals(31, rs);
    }
    @Test
    public void UTCID05() {
        int rs = test.checkMonth( "4", "10");
        assertEquals(30, rs);
    }
    @Test
    public void UTCID06() {
        int rs = test.checkMonth( "5", "2020");
        assertEquals(31, rs);
    }
    @Test
    public void UTCID07() {
        int rs = test.checkMonth( "6", "2020");
        assertEquals(30, rs);
    }
    @Test
    public void UTCID08() {
        int rs = test.checkMonth( "7", "2020");
        assertEquals(31, rs);
    }
    @Test
    public void UTCID09() {
        int rs = test.checkMonth( "8", "2021");
        assertEquals(31, rs);
    }
    @Test
    public void UTCID10() {
        int rs = test.checkMonth( "9", "2019");
        assertEquals(30, rs);
    }
    @Test
    public void UTCID11() {
        int rs = test.checkMonth( "10", "2020");
        assertEquals(31, rs);
    }
    @Test
    public void UTCID12() {
        int rs = test.checkMonth( "11", "2021");
        assertEquals(30, rs);
    }
    @Test
    public void UTCID13() {
        int rs = test.checkMonth( "12", "2000");
        assertEquals(31, rs);
    }
    @Test
    public void UTCID14() {
        int rs = test.checkMonth( null, "2019");
        assertEquals(0, rs);
    }
    @Test
    public void UTCID15() {
        int rs = test.checkMonth( "12", null);
        assertEquals(0, rs);
    }
    @Test
    public void UTCID16() {
        int rs = test.checkMonth( "abc", "3002");
        assertEquals(0, rs);
    }
    @Test
    public void UTCID17() {
        int rs = test.checkMonth( "1", "abc");
        assertEquals(0, rs);
    }
    @Test
    public void UTCID18() {
        int rs = test.checkMonth( "***", "10");
        assertEquals(0, rs);
    }
    @Test
    public void UTCID19 () {
        int rs = test.checkMonth( null, null);
        assertEquals(0, rs);
    }
    @Test
    public void UTCID20() {
        int rs = test.checkMonth( "abc", "abc");
        assertEquals(0, rs);
    }
    @Test
    public void UTCID21() {
        int rs = test.checkMonth( "***", "***");
        assertEquals(0, rs);
    }
    @Test
    public void UTCID22() {
        int rs = test.checkMonth( "1", null);
        assertEquals(0, rs);
    }
    @Test
    public void UTCID23() {
        int rs = test.checkMonth( "2", null);
        assertEquals(0, rs);
    }
    @Test
    public void UTCID24() {
        int rs = test.checkMonth( "3", null);
        assertEquals(0, rs);
    }
    @Test
    public void UTCID25() {
        int rs = test.checkMonth( "4", null);
        assertEquals(0, rs);
    }
    @Test
    public void UTCID26() {
        int rs = test.checkMonth( "5", null);
        assertEquals(0, rs);
    }
    @Test
    public void UTCID27() {
        int rs = test.checkMonth( "6", null);
        assertEquals(0, rs);
    }
    @Test
    public void UTCID28() {
        int rs = test.checkMonth( "7", null);
        assertEquals(0, rs);
    }
    @Test
    public void UTCID29() {
        int rs = test.checkMonth( "8", null);
        assertEquals(0, rs);
    }
    @Test
    public void UTCID30() {
        int rs = test.checkMonth( "9", null);
        assertEquals(0, rs);
    }
    @Test
    public void UTCID31() {
        int rs = test.checkMonth( "10", null);
        assertEquals(0, rs);
    }
    @Test
    public void UTCID32() {
        int rs = test.checkMonth( "11", null);
        assertEquals(0, rs);
    }
    @Test
    public void UTCID33() {
        int rs = test.checkMonth( "13","2020");
        assertEquals(0, rs);
    }
    @Test
    public void UTCID34(){
        int rs = test.checkMonth("0", "2020");
        assertEquals(0,rs);
    }
}