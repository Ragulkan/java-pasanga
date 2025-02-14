import java.util.*;

public class Leapyear{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int year = scan.nextInt();
    if((year%4==0 && year%100!=0)|| (year%400==0)){
      System.out.println("A leap year");
    }
    else{
      System.out.println("not a leap year");
    } 
    
    System.out.println((double)(30*5)/100);
  }
}

