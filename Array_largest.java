import java.util.*;
class Array_largest{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int arr[]={12,3,22,33,85,10};
int result=0;
int c=0;
System.out.println("Enter a number");
int n=sc.nextInt();
for(int i=0;i<arr.length-1;i++){
if(arr[i]>arr[i+1]){
result=arr[i];
c++;
}
else if(arr[i+1]>arr[i]){
result=arr[i];
c++;
}
System.out.println(c);
}
if(c==n){
System.out.println(c);
}
}
}
