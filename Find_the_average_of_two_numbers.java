import java.util.Scanner;
class area {
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        float c=(float)(a+b)/2;
        System.out.format("%.4f",c);
    }
}