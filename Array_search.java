import java.util.*;
import java.math.*;
class Array_search{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
try{
int n=sc.nextInt();
BigInteger phone[]=new BigInteger[n];
String name[]=new String[n];
System.out.println("Enter a name & phone");
for(int i=0;i<n;i++){
name[i]=sc.next();
phone[i]= sc.nextBigInteger();
}
System.out.println("Enter a name to be search or phone number");
for(int i=0;i<n;i++){
String s=sc.next();
if(name[i].equals(s)){
System.out.println(name[i]+"="+phone[i]);
}
else{
System.out.println("Not found");
break;
}
}
}
catch(Exception e){
System.out.println("Please enter correct value");
}
}
}
