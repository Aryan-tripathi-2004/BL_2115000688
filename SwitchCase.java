import java.util.*;
class SwitchCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("press 1 for Addition");
        System.out.println("press 2 for Subtraction");
        System.out.println("press 3 for Multiplication");
        System.out.println("press 4 for Divide");
        System.out.println("press 5 to exit from the loop");

        int Operation = sc.nextInt();

        sc.close();

        while(Operation!=5){
            switch(Operation){
                case 1:
                    System.out.println("Sum of two numbers are :"+(num1+num2));
                    break;
                case 2:
                    System.out.println("Subtraction of two numbers are :"+(num1-num2));
                    break;
                case 3:
                    System.out.println("Multiplication of two numbers are :"+(num1*num2));
                    break;
                case 4:
                    System.out.println("Division of two numbers are :"+(num1/num2));
                    break;
                default:
                    System.out.println("Wrong Input..!!");
                
            }
        }
    }
}
