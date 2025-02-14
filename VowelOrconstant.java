import java.util.Scanner;
public class VowelOrconstant {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char[] vowel={'a','e','i','o','u','A','E','I','O','U'};
    char ch = scan.next().charAt(0);
 
    
    boolean found = false;
    for(char i : vowel){
      if(ch==i){
        found=true;
        
        
      }

    }
    if(found){
      System.out.print("Vowel");
    }
    else if(!Character.isLetter(ch)){
      System.out.print("Invalid input");
    }
    
    else {
      System.out.print("Consonants");
    }
  }
  }
  

