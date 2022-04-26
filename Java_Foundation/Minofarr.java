import java.util.Scanner;
class Minofarr
{
  public static void main(String args[])
  { 
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array values ");
    //reading values from user
    
    for(int i=0;i<5;i++)
      {
        a[i]=sc.nextInt();
      }
    //Printing on to display
    int min = a[0];
    System.out.println("The minimum number is ");
    for(int i=0;i<5;i++)
      {
        if(a[i]<min)
        {
          min=a[i];
           
        }
      }
   System.out.println(min);
  }
} 