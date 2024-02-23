public class type {
    public static void main(String args[])
    {
        // type casting for incompatible variables

//        int num=(int)(10.6777);
//        System.out.println(num);
//        // automatic type promotion in expressions
//        int a=266;
//        byte b=(byte)(a);
//        System.out.println(b);
//        // the output will be 266%256 because the maximum byte value is 256 and the variable b cannot store the value that is larger than its capacity
//
        int aa='g';
        System.out.println(aa);

        byte b=66;
        int a=99;
        short s=10;
        float f=888.33f;
        int i=899999;
        double d=111123.45;
        double result=(f*a)+(i/b)+(d*s);
        System.out.println(f*a);
        System.out.println(i/b);
        System.out.println(d*s);
        System.out.println(result);




    }
}
