import java.util.Scanner;
public class even
{
public static void main(String args[])
{
Scanner Scn=Scanner(System.in);
System.out.println("enter a which as even number");
int num=Scn.nextInt();
if(num %2==0)
System.out.println(num+"is even");
else
System.out.println(num+"is odd");
}
}
