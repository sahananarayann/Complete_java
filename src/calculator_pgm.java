import java.util.*;
public class calculator_pgm {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true)
        {
            char op=in.next().trim().charAt(0);
            if (op=='+'||op=='-'||op=='*'||op=='%'||op=='/')
            {
                int num1=in.nextInt();
                int num2=in.nextInt();
                if(op=='+')
                {
                    System.out.println(num1+num2);
                }
                if(op=='-')
                {
                    System.out.println(num1-num2);
                }
                if(op=='*')
                {
                    System.out.println(num1*num2);
                }
                if(op=='%')
                {
                    System.out.println(num1%num2);
                }
                if(op=='/')
                {
                    if(num2!=0)

                    System.out.println(num1/num2);
                }


            } else if (op=='x'||op=='X') {
                break;

            }

        }
    }
}
