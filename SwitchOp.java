import java.util.Scanner;

public class SwitchOp {
    	public static void main(String args[]) {
       		Scanner sc = new Scanner(System.in);
        	System.out.print("수식 입력(수와 연산자 사이는 공백을 둘 것) : ");
       		int x = sc.nextInt();
        	char op = sc.next().charAt(0);
        	int y = sc.nextInt();
        	String answer = " ";

        	switch (op) {
        	   	case '+' : answer = Integer.toString(x+y); 
        	   	break;
        	   	case '-' : answer = Integer.toString(x-y);
        	   	break;
        	   	case '*' : answer = Integer.toString(x*y);
        	   	break;
        	   	case '/' : answer = Integer.toString(x/y);
        	   	break;
        	   	default : System.out.print("사칙연산자가 아닙니다.");
        	    }
        	    System.out.print(x+" "+op+" "+y+" "+" = "+answer);
      	}	
}
