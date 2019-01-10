package testCalendar;

import java.util.Scanner;

public class Prompt {
    public void printMenu(){
        System.out.println("+----------------------+");
        System.out.println("| 1. 일정 등록    ");
        System.out.println("| 2. 일정 검색    ");
        System.out.println("| 3. 달력 보기    ");
        System.out.println("| h. 도움말 q. 종료");
        System.out.println("+----------------------+");

    }
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
        printMenu();

        Scanner scanner = new Scanner(System.in);

        Calendar cal = new Calendar();

        while (true){
            System.out.println("명령(1, 2, 3, h, q)");
            String cmd = scanner.next();
            if(cmd.equals("1")){
                cmdRegister();
            }else if(cmd.equals("2")){
                cmdSearch();
            }else if(cmd.equals("3")){
                cmdCal(scanner, cal);
            }else if(cmd.equals("h")){
                printMenu();
            }else if(cmd.equals("q")){
                break;
            }
            System.out.println("Thank you. Bye!");
            scanner.close();
        }
    }

    private void cmdCal(Scanner s, Calendar c) { //Call by reference

        int month = 1;
        int year = 2019;

        System.out.println("\n\n년도를 입력해주세요.");
        System.out.print("YEAR> ");
        year = s.nextInt();

        System.out.println("달을 입력해주세요.");
        System.out.print("MONTH> ");
        month = s.nextInt();


        if(month < 1 || month > 12){
            System.out.println("1 ~ 12월을 선택해주세요.");
            return;//메소드를 종료하려면
        }
        c.printCalendar(year,month);
    }

    private void cmdSearch() {
    }
    
    private void cmdRegister() {
    }
//    public static void main(String[] args) {
//    Prompt p = new Prompt();
//    p.runPrompt();
    }

