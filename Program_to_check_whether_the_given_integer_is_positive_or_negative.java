import java.util.Scanner;
class area {
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if (a<0)
            System.out.println("Negative Number");
        else
            System.out.println("Positive Number");
        
    }
}