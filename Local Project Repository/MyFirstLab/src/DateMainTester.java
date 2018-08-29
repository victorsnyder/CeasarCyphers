import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class DateMainTester {
 

    @Test
    public void testCorrectDates() {
        assertTrue("The combination 30/11/2000 should yield a true result", DateMain.isValidDate(2000, 11, 30));
        assertTrue("The combination 1/1/1999 should yield a true result", DateMain.isValidDate(1999, 1, 1));
    }


    @Test
    public void testMonthBoundaries() {
        assertTrue("The month 12 is a valid month this should return true.", DateMain.isValidDate(2012, 12, 30));
        assertFalse("The month 13 is an  invalid month this should return false.", DateMain.isValidDate(2011, 13, 15));
        assertTrue("The month 1 is a valid month this should return true.", DateMain.isValidDate(2001, 1, 1));
        assertFalse("The month 0 is an  invalid month this should return false.", DateMain.isValidDate(2002, 0, 10));
    }


    @Test
    public void testDayByMonths() {
        assertTrue("The month 12 has 31 days so this should return true.", DateMain.isValidDate(2015, 12, 31));
        assertFalse("The month 11 has 30 days so this should return false.", DateMain.isValidDate(2009, 11, 31));
        assertFalse("The month 2 has 28 or 29 days depending the year, this should return false.", DateMain.isValidDate(2018, 2, 30));
        assertTrue("The month 2 has 29 days when its a leap year and 2016 is a leap year so, this should return true.", DateMain.isValidDate(2016, 2, 29));
        assertFalse("The month 2 has 29 days when its a leap year and 2015 is not a leap year so, this should return true.", DateMain.isValidDate(2015, 2, 29));
    }

}    