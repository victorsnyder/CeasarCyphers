public class TimeMain {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        boolean timeTest1 = isValidTime(10, 14, 39);
        boolean timeTest2 = isValidTime(24, 0, 0);
        boolean timeTest3 = isValidTime(12, 60, 45);
    }
    
    /**
     * A method that validates the time given in military hour
     * @return - a boolean
     */
    public static boolean isValidTime(int hour, int minute, int second) { // Correct Method
        if (hour < 0 || hour >= 24) {
            return false;
        }
        if (minute < 0 || minute >= 60) {
            return false;
        }
        if (second < 0 || second >= 60) {
            return false;
        }
        return true;
    }
 }
