
import java.util.*;
public class conditional_ex {
    public static void main(String[] args) {
        //loops example
        // Qn print hello world 5 times

        /*
        for (initialization; condition; increment / decrement)
         */

       for (int num = 1; num <= 5; num++) {
            System.out.println(num + " hello world");
       }
        Scanner in =new Scanner(System.in);
        int n= in.nextInt ();
        for (int i = 1; i < n; i++) {
            System.out.println(i);

        }

        int num=1;
        while(num<=10)
        {
            System.out.println(num);
            num=num+2;
        }

// for loop when u know how many times the loop will run
        // while loop when u dont know how many times the loop is going to run
        //do while loop

        int n1=1;
        do
        {
            System.out.println("hello world");
        }while(n1!=4);
    }

}
