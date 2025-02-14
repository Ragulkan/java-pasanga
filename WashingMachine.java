import java.util.*;
public class WashingMachine {
  public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.print("Enter the weight: ");
    int weight= scan.nextInt();
    if (weight>0 && weight<=2000){
      System.out.println("the estimated time: 25minutes");
    }
    else if (2000<weight  && weight<=4000){
      System.out.println("the estimated time: 35 minutes");
    }
   else  if (weight>4000 && weight<=7000){
      System.out.println("the estimated time: 45 minutes");
    }
    else if(weight==0){
      System.out.println("the estimated time : 0 minutes");
    }
    else if(weight>7000){
      System.out.println("OVER LOADED");
    }
    else{
      System.out.println("INVALID INPUT");
    }

  }
  
}
