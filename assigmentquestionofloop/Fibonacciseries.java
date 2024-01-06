package assigmentquestionofloop;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int a = sc.nextInt();
        int num1 =0;
        int num2 =1;
        int num3 = 0;
        System.out.print(num1+"," +num2);
        System.out.print(",");
        for(int i =2; i<=a;i++){
            num3=num1+num2;
            System.out.print(num3+",");
           
            num1=num2;
            num2=num3;
            
        }
     
         
        
    }
}
