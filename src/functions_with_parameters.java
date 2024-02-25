public class functions_with_parameters {
    public static void main(String[] args) {
        int ans=sum3(20,40,0);
        System.out.println(ans);
        String message=greets("sahana");
        System.out.println(message);

    }

    static String greets(String name) {
        String out="hello"+name;
        return out;
    }

    static  int sum3(int a,int b,int c)

    {
        int sum=a+b+c;
        return sum;
    }


}
