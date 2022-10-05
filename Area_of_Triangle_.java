import java.util.Scanner;
class area {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        float s=(float)(a+b+c)/2;
        float ar=(float)Math.sqrt((s)*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",ar);
    }
}