import java.util.Scanner;
class extract{
String abb(String str){
str=" "+str;
char ch;String str1="";
int l=str.length();
try{
for(int i=0;i<l;i++)
{
ch=str.charAt(i);
if(ch==' ')
{
str1=str1+str.charAt(i+1);
str1=str1.toUpperCase();
}
}
}
catch(Exception e){
System.out.println("please enter your value");
}
return str1;
}
public static void main(String args[])
{String a,s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter you word");
s=sc.nextLine();
extract obj=new extract();
a=obj.abb(s);
System.out.println(a);
}
}