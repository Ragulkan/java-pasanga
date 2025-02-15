import java.util.*;

public class CheckValidDate {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String date=scan.nextLine();
    String[] str =date.split("/");
    int dd = Integer.parseInt(str[0]);
    int mm = Integer.parseInt(str[1]);
    int yy = Integer.parseInt(str[2]);


  
    if(yy>=1900 && yy<9999){
      if(mm>=1 && mm<=12){
        if((dd>=1 && dd<=31) && (mm==1 ||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12)){
          System.out.println("Valid input");
        }
        else if((dd>=1 && dd<=30) && (mm==4 ||mm==6||mm==5||mm==9||mm==11)){
          System.out.println("Valid inpit");
        }
        else if ((dd>=1 && mm<=28) && (mm==2)){
          System.out.println("valid input");
        }
        else if((dd>=1 && dd<=29) && ((yy%4==0 && yy%100!=0) ||(yy%400==0))){
          System.out.println("valid input");
        }
        else{
          System.out.println("invalid input ");
        }
      }
      else{
        System.out.println("invalid input");
      }
    }
    else{
      System.out.println("invalid input");
    }
    
  }
  
}
