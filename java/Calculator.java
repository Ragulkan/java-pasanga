package java;
import java.util.*;
public class Calculator {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int num1=scan.nextInt();//5
    scan.nextLine();
    String operation=scan.nextLine();//+
    int num2=scan.nextInt();
    switch (operation) {
      case "+":
      System.out.print(num1+num2);
        
        break;
      case "-":
      System.out.println(num1-num2);
      break;
      case "*":
      System.out.println(num1*num2);
      break;

      case "%":

      System.out.println(num1%num2);
      break;
    
      default:
      System.out.println("enter valid input");
        break;
    }
  }

  
}
