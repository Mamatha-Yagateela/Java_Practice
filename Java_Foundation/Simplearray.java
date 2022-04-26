import java.util.Scanner;
class Simplearray
{
  public static void main(String args[])
  {
    int a[][]=new int[2][4];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array values ");
    //reading values from user
    for(int i=0;i<2;i++)
      {
        for(int j=0;j<4;j++)
          {
            a[i][j]=sc.nextInt();
            }
      }
    //Printing on to display
    System.out.println("The array values are ");
    for(int i=0;i<2;i++)
      {
        for(int j=0;j<4;j++)
       {
         System.out.print(a[i][j]+" ");
       }
        System.out.println();
      }
  }
}