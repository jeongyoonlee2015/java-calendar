import java.util.Scanner;
public class Sum {
    //두 수의 합 구하기
    public static void main(String[] args){
        //input: keyboard
        //output: Display Sum
        int a, b;
        Scanner scanner = new Scanner(System.in); //System.in : keyboard
        String s1, s2;
        System.out.println("두 수를 입력해주세요.");
        s1 = scanner.next();
        s2 = scanner.next();
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        //System.out.println(a + " , " + b);
        //System.out.println("두 수의 합은 " + (a + b) + "입니다.");
        System.out.printf("두 수 %d와 %d의 합은 %d입니다.", a, b, a + b);
        scanner.close();//문을 닫아줘야함.
    }
}
