import java.util.*;
public class UpperOrLower {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    char ch = scan.next().charAt(0);
    if ((ch>='A') && (ch<='Z')){
      System.out.println("uppercase");

    }
    else if(ch>='a'  && ch<='z'){
      System.out.println("Lowercase");
    }
    else{
      System.out.println("invalid input");
    }


    
  }
  
}
