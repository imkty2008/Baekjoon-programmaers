import java.util.Scanner;

public class SwitchExam5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch(a) {
            case 1 : case 2 : case 3 : case 4:
                System.out.print("뉴미디어소프트웨어과");
                break;
            case 5 : case 6 :
                System.out.print("뉴미디어디자인과");
                break;
        }
    }
}
