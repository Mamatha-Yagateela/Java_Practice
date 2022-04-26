import java.util.Scanner;
class PosorNeg
  {
    public static void main(String args[])
    {
      int num;
      System.out.println("enter the number:");
      Scanner sc=new Scanner(System.in);
      num = sc.nextInt();
      if(num<0)
      {
         System.out.println("number is negative");
      }
      else
      {
         System.out.println("number is positive");
      }
    }
  }