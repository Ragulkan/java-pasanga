import java.util.Scanner;
public class Main {
    Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Main obj = new Main();
//        obj.sum10();
//        obj.LeepYear();
//        obj.AddTwoNum();
//        obj.washingMachine();
//        obj.CorrectDateCheacking();
        obj.ElectricBills();
    }

    void sum10() {
        int n1 = scn.nextInt(), n2 = scn.nextInt();
        int num = n1 + n2;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.print("Odd");
        }
    }

    void LeepYear() {
        int num = scn.nextInt();
        if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
            System.out.println("Leep year");
        } else {
            System.out.println("Not Leep year");
        }
    }

    void AddTwoNum() {
        int num1 = scn.nextInt(), num2 = scn.nextInt();
        int Add = num1 + num2;
        int Sub = num1 - num2;

        if (Add < 0) {
            Add = Add * -1;
        }
        if (Sub < 0) {
            Sub = Sub * -1;
        }
        System.out.println(Add);
        System.out.print(Sub);
    }

    void washingMachine() {
        System.out.println("Enter the Loading Weight:");
        int num = scn.nextInt();

        if (num <= 2000 && num > 0) {
            System.out.println("Time Estimated:25 Min");
        } else if (num >= 2001 && num <= 4000) {
            System.out.println("Time Estimated:35 Min");
        } else if (num >= 4001 && num <= 7000) {
            System.out.println("Time Estimated:45 Min");
        } else if (num == 0) {
            System.out.println("Time Estimated:0 Min");
        } else if (num > 7000) {
            System.out.println("OVERLOADED");
        } else {
            System.out.println("INVALID INPUT");
        }
    }

    void CorrectDateCheacking() {
        String Vald = "Vaild" , InVald = "Invaild";

        String srt = scn.nextLine();
        String ary[] = new String[3];
        ary = srt.split("/");
        int dd = Integer.parseInt(ary[0]);
        int mm = Integer.parseInt(ary[1]);
        int yy = Integer.parseInt(ary[2]);

        if (yy >= 2000 && yy <= 3000) {
            if (mm >= 1 && mm <= 12) {
                if ((dd >= 1 && dd <= 31) && (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12)) {
                    System.out.print("Vaild");
                }
                if ((dd >= 1 && dd <= 30) && (mm == 4 || mm == 6 || mm == 9 || mm == 11)) {
                    System.out.println("Vaild");
                }
                if ((dd >= 1 && dd <= 28) && mm == 2) {
                    System.out.println("Vaild");
                }
                if ((dd == 29) && ((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0))) {
                    System.out.print("Vaild1");
                } else {
                    System.out.println("Invaild3");
                }
            } else {
                System.out.println("Invaild2");
            }
        } else {
            System.out.println("Invaild1");
        }
    }

    void ElectricBills(){
        double input = scn.nextInt();

        double ans =0;
        if(input>=0 && input<=50){
            ans = input *0.5;
        } else if (input>=51 && input<=150) {
            double dum = input - 50;
            ans = (50 *0.5) + (dum*0.75);
        }else if (input>=151 && input<=250) {
            double dum = input - 150;
            ans = (50 *0.5) + (100*0.75) + (dum*1.2);
        }else if (input>=251) {
            double dum = input - 250;
            ans = (50 *0.5) + (100*0.75) + (100*1.2) + (dum*1.5);
        }
       ans = ans+(ans*0.2) ;
        System.out.println(ans);
    }
}
















