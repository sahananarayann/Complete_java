public class swap {
    public static void main(String[] args) {
        //int a=10;
        //int b=20;
        /*System.out.println("before swapping");
        System.out.println(a+"   "+b);

        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping");
        System.out.println(a+ " " +b);*/
        swap(10,20);
    }
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }

}
