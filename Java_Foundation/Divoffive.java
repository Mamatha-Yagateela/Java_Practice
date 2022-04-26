import java.util.Scanner;
class Divoffive
{
  public static void main(String args[])
  { 
    int count=0;
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array values ");
    //reading values from user
    for(int i=0;i<5;i++)
      {
        a[i]=sc.nextInt();
      }
    //Printing on to display
    System.out.println("The number of negative numbers ");
    for(int i=0;i<5;i++)
      {
        if(a[i]%5==0)
        {
           System.out.println(a[i]);
        }
      }
   
  }
} 