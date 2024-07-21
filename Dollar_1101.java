import java.util.Scanner;

public class Dollar_1101 {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	     	System.out.println("원화를 입력하세요(단위:원) :");
		    double x = sc.nextInt();
	    	    double y = x / 1260;
		    double z = (int)(y * 100 + 0.5) / 100.0;
		    System.out.println(m+"원은 $"+z+"입니다.");
	  }
}
		
