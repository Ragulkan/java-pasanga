// you have two numbers and your task is to write a program that adds them together and check if their totally divided by two
// you have numbers and your task is to write a program that adds them together and check if their totally divided by 100

import java.util.*;

public class SumCheck {
  void  two(int num1,int num2){
    int num3= (num1+num2)%2;
    if (num3==0){
      System.out.println("EVEN");
    }
    else{
      System.out.println("No the number is not divided by 2");
    }

  }
  void  hundread(int num4){
    int num3= num4%100;
    if (num3==0){
      System.out.println("yes divisible by 100");
    }
    else{
      System.out.println("No the number is not divided by 100");
    }

  }
  void  twentyseven(int num5){
    int num3= num5%27;
    if (num3==0){
      System.out.println("yes divisible by 27");
    }
    else{
      System.out.println("No the number is not divided by 27");
    }

  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num4 = scan.nextInt();
    int num5 = scan.nextInt();

    SumCheck obj = new SumCheck();
    obj.two(num1,num2);
    obj.hundread(num4);
    obj.twentyseven(num5);

  }
  
  
}

