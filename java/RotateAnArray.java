package java;
import java.lang.reflect.Array;
import java.util.*;

public class RotateAnArray{

  String rotate(int[] num,int rotate){
    int[] num1=Arrays.copyOfRange(num, rotate, num.length);
    int[] num2=Arrays.copyOfRange(num, 0,rotate);
    int[] rotated=new int[num.length];

    System.arraycopy(num1, 0, rotated, 0, num1.length);
    System.arraycopy(num2, 0, rotated,num1.length, num2.length);
    return Arrays.toString(rotated);

  }
   void rotateAnString(String str){
    String[] str1 = str.split(" ");
    Collections.reverse(Arrays.asList(str1));
    String reveString = String.join(" ",str1);
    System.out.print(reveString);

  }
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = scan.nextInt();
    
    
    int[] array = new int[size];
    for(int i = 0;i<size;i++){
      System.out.print("Enter the"+i+"element: ");
      array[i]=scan.nextInt();
    }
    int rotate = scan.nextInt();
    RotateAnArray rotate1=new RotateAnArray();
    System.out.print(rotate1.rotate(array, rotate));
    System.out.println();
    String str = "welcome to java";
    rotate1.rotateAnString(str);
    
  }
}