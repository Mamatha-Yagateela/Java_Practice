import java.util.Scanner;
class Sumofodd
{
  public static void main(String args[])
  { 
    int sum=0;
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array values ");
    //reading values from user
    for(int i=0;i<5;i++)
      {
        a[i]=sc.nextInt();
      }
    //Printing on to display
    System.out.println("The sum of even array values are ");
    for(int i=0;i<5;i++)
      {
        if(a[i]%2!=0)
        {
          sum=sum+a[i];
        }
      }
    System.out.println(sum);
  }
} 