import java.util.Scanner;

public class Factorial {

public static void main (String[] args)
   {		
     int i,mul=1; 
		Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
     int number=sc.nextInt();
		    for (i = 1; i <=number; i++)
		    {
		    mul=mul*i;
          }
     System.out.println(mul);
		}
	}