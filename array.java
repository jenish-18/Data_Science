import java.util.Scanner;
public class array {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter size of array :");
        int n=scan.nextInt();
        int[] num=new int[n];
        System.out.println("enter number");
        for(int i=0;i<n;i++)
        {
            num[i]=scan.nextInt();
        }
        System.out.println("entered numbers are");
        for(int i=0;i<n;i++)
        {
            System.out.println(num[i]);
        }
        
    }
}
