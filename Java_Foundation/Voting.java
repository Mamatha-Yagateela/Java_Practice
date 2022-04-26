import java.util.Scanner;
class Voting
  {
    public static void main(String args[])
    {
      int age;
      System.out.println("enter the age of person:");
      Scanner sc=new Scanner(System.in);
      age = sc.nextInt();
      if(age>=18)
      {
         System.out.println("person is elegible for voting");
      }
      else
      {
         System.out.println("person is not eligible for voting");
      }
    }
  }