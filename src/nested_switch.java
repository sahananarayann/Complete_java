import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empid=in.nextInt();
        String department=in.next();

        switch (empid)
        {
            case 1:
                System.out.println("sahana");
                break;
            case 2:
                System.out.println("pushpa");
                break;
            case 3:
                System.out.println("yathish");
                break;
            case 4:
                System.out.println("appa");
                break;
            case 5:
                System.out.println("emp number 5");
                switch (department)
                {
                    case "It":
                        System.out.println("it department");
                        break;
                    case "management":
                        System.out.println("management department");
                        break;
                    default:
                        System.out.println("no department");

                }

        }
    }
}
