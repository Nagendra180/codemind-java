import java.util.Scanner;
class area {
    public static void main(String args[])
    {
        double a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        System.out.format("%.2f",a*b);
    }
}