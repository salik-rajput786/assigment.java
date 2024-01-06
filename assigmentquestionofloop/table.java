//question number 1
package assigmentquestionofloop;

import java.util.Scanner;

public class table {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int t = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int table = i * t;
            System.out.println(+t + "*" + i + "=" + table);// 1*2=2
        }
    }

}
