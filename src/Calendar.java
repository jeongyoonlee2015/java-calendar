public class Calendar{
    private static final int[] MAX_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year){ //윤년계산
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 != 0))
            return true;
        else
            return false;
    }

    public int getMaxDaysOfMonth(int year, int month) {
        if(isLeapYear(year)){
            return LEAP_MAX_DAYS[month];
        }else{
            return MAX_DAYS[month];
        }
    }

    public void printCalendar(int year, int month){
        System.out.printf("    <<%3d년%3d월>>\n", year, month);
        System.out.println("  일 월 화  수  목 금 토");
        System.out.println("---------------------");

        //get weekday automatically
        int weekday = getweekday(year, month, 1);
        for(int i = 0; i < weekday; i++){

            System.out.print("   ");
        }
        int maxDay = getMaxDaysOfMonth(year, month);
        int count = 7 - weekday;
        int delim = (count <7) ? count : 0;

         for(int i = 1; i <= count; i++) {
             System.out.printf("%3d", i);
         }
         System.out.println();

         count++;
         for(int i = count; i <= maxDay; i++) {
            System.out.printf("%3d", i);
            if (i % 7 == delim){
                System.out.println();
            }
             System.out.println();
             System.out.println();
         }
     }

    private int getweekday(int year, int month, int day) {
        //UTC 1970.Jan.01 Thursday

        int syear = 1970;
        final int STANDARD_WEEKDAY = 3; //UTC DATE is Thursday.

        int count = 0;
        for (int i = syear; i < year; i++){
            int delta = isLeapYear(i) ? 366 : 365;
            count += delta;
        }
        for (int i = 1; i < month; i++){
            int delta = getMaxDaysOfMonth(year, i);
            count += delta;
        }

        count += day;

        int weekday = (count + STANDARD_WEEKDAY) % 7;

        return weekday;
    }
    //Simple test
    public static void main(String[] args){
        Calendar c = new Calendar();
        System.out.println(c.getweekday(1970, 1, 1) == 3);
        System.out.println(c.getweekday(1971, 1, 1) == 4);
        System.out.println(c.getweekday(1972, 1, 1) == 5);
        System.out.println(c.getweekday(1973, 1, 1) == 0);

    }
}