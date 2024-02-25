import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        //q:take input of two numbers and print the output
        sum();


    }
    static void sum()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number1");
        int num1=in.nextInt();
        System.out.println("enter number2");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println(sum);



    }
}
