//question number 2
package assigmentquestionofloop;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a number ");
       int a = sc.nextInt();
       int sum =0;
       for(int i=1;i<=a;i++){
         sum+=i;
         
       }
      System.out.println("the sum of the given number is sum "+ sum);
    }
}
