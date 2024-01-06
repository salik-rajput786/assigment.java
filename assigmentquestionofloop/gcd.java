package assigmentquestionofloop;

import java.util.Scanner;

public class gcd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number ");
    int a = sc.nextInt();
    System.out.println("enter a number ");
    int b = sc.nextInt();
       
   
    int hcf = 0;//to store hcf value 
    for(int i =1; i<=a|| i<=b; i++){
        if (a%i==0 && b%i==0 ) {
            hcf=i;
        } 
          
        }
           System.out.println("hcf is "+hcf);
    }
  }    

