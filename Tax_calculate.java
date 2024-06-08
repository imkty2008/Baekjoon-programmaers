import java.util.Scanner;

public class Tax_calculate {
             public static void main(String args[]) {
                       Scanner sc = new Scanner(System.in);
                              int salary = sc.nextInt();
                              if(salary < 20000000) {
                                System.out.print(salary * 0.05);
                            } else if(salary > 20000000 && salary <= 40000000) {
                                System.out.print(salary * 0.15);
                            } else if(salary > 40000000 && salary <= 80000000) {
                                System.out.print(salary * 0.25);
                            } else if(salary > 80000000) {
                                 System.out.print(salary * 0.4);
                            }
              }
}
