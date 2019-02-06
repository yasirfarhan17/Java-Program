import java.util.Scanner;
class array_challeng
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number you want to enter");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]==42)
break;
else
System.out.println(a[i]);
}
}
}