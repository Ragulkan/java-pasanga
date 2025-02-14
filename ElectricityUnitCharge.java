import java.util.*;
public class ElectricityUnitCharge {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int currentUnit=scan.nextInt();
    double bill=0;
    if(currentUnit>=0){
      if(currentUnit<=50){
        bill+=currentUnit*0.50;
      }

    else{
      if(currentUnit>50 && currentUnit<=150){
        bill=50*0.50;
        bill+=(currentUnit-50)*0.75;
        if(currentUnit>150 && currentUnit<=250){
          bill+=(currentUnit-150)*1.20;
          if(currentUnit>250){
            bill+=(currentUnit-250)*1.50;
          }
        }
      }
    }
  }

    System.out.print((double)(bill*20)/100));
    scan.close();
    
  }
  
  
}
