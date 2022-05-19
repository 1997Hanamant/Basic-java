import java.util.Scanner;
class whileloop
{
public static void main(String args[])
{
//int i=0;
//while(i<10){
	//i++;
//System.out.println("Big");
//}
//int n;
//Scanner scan=new Scanner(System.in);
//System.out.println("enter a number");
//int number=scan.nextInt();
//while(number>=5){
	//number++;
	//System.out.println(number);
//}
int sum=0;
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number");
int number=scan.nextInt();
while(number<=10){
	sum+=number;
	System.out.println(sum);
}
}
}

