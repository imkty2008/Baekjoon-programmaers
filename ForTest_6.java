import java.util.Scanner;

public class ForTest_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = 0;

        System.out.print("10개의 정수를 입력하세요:");
      
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt(); 
          
            if (num % 3 == 0 || num % 5 == 0) {
                x++;
            }
        }
        System.out.println("3 또는 5의 배수 개수: " + x);
    
        scanner.close();
    }
}
