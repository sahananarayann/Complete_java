import java.util.Scanner;

public class switch_Ex {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit=in.next();
        switch (fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("a sweet red fruit");
                break;
            case "orange":
                System.out.println("orange is round fruit");
                break;
            case "grapes":
                System.out.println("grapes are green in color");
                break;
            default:
                System.out.println("its not fruit enter valid fruit");






        }
    }
}
