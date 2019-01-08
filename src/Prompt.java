import java.util.Scanner;

public class Prompt {

    private final static String PROMPT="cal>";

    public void runPrompt(){
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();
        int month = 1;
        while (true){
            System.out.println("달을 입력해주세요.");
            System.out.print(PROMPT);
            month = scanner.nextInt();
            if (month == -1){
                break;
            }else if(month < 1 || month > 12){
                System.out.println("1 ~ 12월을 선택해주세요.");
                continue;
            }
            cal.printCalendar(2019, month);
        }

        //cal.printSampleCalendar();
        scanner.close();
    }
    public static void main(String[] args) {
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
