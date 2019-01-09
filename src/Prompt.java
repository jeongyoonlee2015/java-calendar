import java.util.Scanner;

public class Prompt {
    /**
     *
     * @param week 요일 명
     * @return 0 ~ 6(0 = Sunday, 6 = Saturday)
     */
    public int parseDay(String week){
        if(week.equals("su")){
            return 0;
        }else if(week.equals("mo")){
            return 1;
        }else if(week.equals("tu")){
            return 2;
        }else if(week.equals("we")){
            return 3;
        }else if(week.equals("th")){
            return 4;
        }else if(week.equals("fr")){
            return 5;
        }else if(week.equals("sa")){
            return 6;
        }else
            return 0;
    }


    public void runPrompt(){
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();
        int month = 1;
        int year = 2019;
        int weekday = 0;


        while (true){
            System.out.println("\n\n년도를 입력해주세요.");
            System.out.print("YEAR>");
            year = scanner.nextInt();
            System.out.println("달을 입력해주세요.");
            System.out.print("MONTH>");
            month = scanner.nextInt();
            System.out.println("첫째 날의 요일을 입력하세요.(su, mo, tu, wd, th, fr, sa)");

            String str_weekday = scanner.next();
            weekday = parseDay(str_weekday);

            if (month == -1){
                break;
            }else if(month < 1 || month > 12){
                System.out.println("1 ~ 12월을 선택해주세요.");
                continue;
            }
            cal.printCalendar(year, month, weekday);
        }

        //cal.printSampleCalendar();
        scanner.close();
    }
    public static void main(String[] args) {
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
