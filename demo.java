import java.util.*;
class demo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num,f=0,l=0,i,j;
String s,str;
System.out.println("Enetr a number");
num=sc.nextInt();
s=String.valueOf(num);
l=s.length();
for(i=0;i<=l-1;i++)
{
for(j=i+1;j<=l;j++)
{
if(s.charAt(i)==s.charAt(j))
{
f++;
break;
}
}
}
System.out.println("frequency of letter:"+f);
}
}