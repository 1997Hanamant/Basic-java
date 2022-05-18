class bitwiseOperatorDemo
{
public static void main(String args[])
{
// bitwise OR(!) 

//int a=10;
//int b =20;

//System.out.println((a<b)|(a>b--));
//System.out.println(a);
//System.out.println(b);

//bit wise AND(&&)

//int x=35;
//int y=50;

//System.out.println((x>y++)&(x>y--));
//System.out.println(x);
//System.out.println(y);

int a=20;
int b=90;

System.out.println((a<b)||(a==b++)|(a!=b));
System.out.println((a>=b)&&(a<=b--)&(++a<b++));
System.out.println((a==b++)|(++a>=b)||(a==b));
System.out.println((a!=--b)&&(a>b++)&(++a!=b));
System.out.println(a);
System.out.println(b);

//int a=12;
//int b=8;

//System.out.println("a&b:"+(a&b));
//System.out.println("a|b:"+(a|b));
//System.out.println("a^b:"+(a^b));
//System.out.println("~a:"+(~a));


}

}

