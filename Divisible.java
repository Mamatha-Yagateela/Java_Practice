import java.util.Scanner;
class Divisible
  {
    public static void main(String args[])
    {
      int num;
      System.out.println("enter the number:");
      Scanner sc=new Scanner(System.in);
      num = sc.nextInt();
      if((num%5==0)&&(num%11==0))
      {
         System.out.println("it is a divisible");
      }
      else
      {
         System.out.println("it is a non divisible");
      }
    }
  }