package java;
import java.util.*;
public class Absolute {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num1 = 20;
    int num2 = 150;
    int num3=num1+num2;
   
   
    if (num3<0){
      System.out.println(num3*-1);
    }
    else{
      System.out.println(num3);

    }
    int num4=num1-num2;
    if (num4<0){
      System.out.print(num4*-1);
    }
    else{
      System.out.print(num4);
    }
  }  
}
