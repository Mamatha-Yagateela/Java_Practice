import java.util.Scanner;
class Noofdigits{
  public static void main(String args[])
  {
    int n,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a number : ");
    n=sc.nextInt();
    while(n!=0)
      {
        n=n/10;
        count++;
      }
    System.out.println(count);
  }
}