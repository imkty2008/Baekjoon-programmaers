import java.util.Scanner;

public class Absolute_Test {
        public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               System.out.print("정수 입력 : ");
	       int x = sc.nextInt();
	       int y = 0;
			
               if(x > 0) {
	           y = x;
	        } else {
		   y = x * (-1);
                }
		   System.out.println(x + "의 절대값은 " + y + "입니다.");
         }
}
