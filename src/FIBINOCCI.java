import java.util.*;
public class FIBINOCCI {
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int n1=0;
        int n2=1;
       int sum=0;
        System.out.println(n1+" "+n2);

        for(int i=2;i<n;i++)
        {
            sum=n1+n2;
            System.out.println(" "+sum);
            n1=n2;
            n2=sum;
        }


    }
}
