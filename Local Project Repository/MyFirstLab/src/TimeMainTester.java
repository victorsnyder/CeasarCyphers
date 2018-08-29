import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TimeMainTester {

    @Test
    public void testHourValidation() {
         assertTrue("In military time 10 is a valid hour, this should return true.", TimeMain.isValidTime(10, 14, 39));
         assertFalse("In military time 24 is not a valid hour, this should return false.", TimeMain.isValidTime(24, 0, 0));
         assertTrue("In military time 0 is a valid hour, this should return true.", TimeMain.isValidTime(0, 0, 0));
         assertFalse("In military time -1 is not a valid hour, this should return false.", TimeMain.isValidTime(-1, 1, 3));
     
    }   

    @Test
    public void testMinuteValidation() {
         assertTrue("In military time 14 is a valid minute value, this should return true.", TimeMain.isValidTime(10, 14, 39));
         assertFalse("In military time 60 is not a valid minute value, this should return false.", TimeMain.isValidTime(23, 60, 0));
         assertTrue("In military time 0 is a valid minute value, this should return true.", TimeMain.isValidTime(0, 0, 0));
         assertFalse("In military time -1 is not a valid minute value, this should return false.", TimeMain.isValidTime(1, -1, 3));
    }
    
    @Test
    public void testSecondValidation() {
         assertTrue("In military time 39 is a valid second value, this should return true.", TimeMain.isValidTime(10, 14, 39));
         assertFalse("In military time 60 is not a valid second value, this should return false.", TimeMain.isValidTime(23, 59, 60));
         assertTrue("In military time 0 is a valid second value, this should return true.", TimeMain.isValidTime(0, 0, 0));
         assertFalse("In military time -3 is not a valid second value, this should return false.", TimeMain.isValidTime(1, 1, -3));
    }
}
