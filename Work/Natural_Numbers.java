import java.util.Scanner;
public class Natural_Numbers
  {
    public static void main(String args[])
    {
       int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      int i=1;
      while(i<=n)
       {
         System.out.println(i);
         i++;
       }
    }
  }