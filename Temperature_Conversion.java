import java.util.Scanner;
class area {
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.format("%.2f",((float)(9*a)/5+32));
    }
}