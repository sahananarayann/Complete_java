
import java.util.*;
public class largets {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        //Q: find the largest of 2 numbers
        /*  assume a number a as largest, decide max number and check
        * if the next value is greater than max, then fix max */

        int max=a;
        if (b>max)
        {
            max=b;
        }

        if (c>max)
        {
            max=c;
        }

        System.out.println("the maximum number is " +  max);
    }


}
