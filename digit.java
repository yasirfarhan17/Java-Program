import java.util.*;
class digit{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int max=0;
while(n>0){
int rem=n%10;
n=n/10;
if(rem>max)
{
max=rem;
}
}
System.out.println(max);
}
}
