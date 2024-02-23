import java.util.*;
public class alphabet_casecheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch=in.next().trim().charAt(0);
        if (ch>='a' &&  ch<='z')
        {
            System.out.println("the given charecter is lowercase");
        }

        else {
            System.out.println("the given charecter is not lower case ");
        }
    }
}
