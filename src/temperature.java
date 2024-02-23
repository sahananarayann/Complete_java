
import java.util.*;
public class temperature {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("please enter the value of temperature in celcius:");
        float tempc=in.nextFloat();
        float tempf=(tempc*9/5)+32;
        System.out.println("the temperature in farenheit is "+ tempf);
    }
}
