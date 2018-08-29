public class DateMain {

//    @SuppressWarnings("unused")
//    public static void main(String[] args) {
//        boolean dateTest1 = isValidDate(2000, 12, 31);
//        boolean dateTest2 = isValidDate(2012, 2, 30);
//        boolean dateTest3 = isValidDate(2017, 11, 31);
//
//    }
    
    /**
     * A method that validates the date of the object
     * Note: For help on what is a valid date refer to:
     * https://www.timeanddate.com/date/leapyear.html
     * Remember: Months 1, 3, 5, 7, 8, 10, 12 have 31 days
     *           Months 4, 6, 9, 11 have 30 days
     * Tip: The first if statement deserves a revision. (You could use the debugger to check it)
     * @return - a boolean
     */
        public static boolean isValidDate(int year, int month, int day) { //Incomplete Method
        if (month > 12 || month < 1 || day < 1 || day > 31 || year < 0)
            return false;
        if(day == 29 && month == 2) {
            if(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))
                return false;
            else 
                return true;
        } 
        if(day == 30) {
            if (month == 2)
            	return false;
        }    
        if(day == 31) {
            if (month == 2 || month == 4 || month == 6 || month== 9 || month==11)
            	return false;
        }
        return true;
    }
}