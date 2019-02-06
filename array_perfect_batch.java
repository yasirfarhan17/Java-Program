import java.util.*;
class array_perfect_batch{
public static void main(String args[]){
int arr[]=new int[6];
int sum=0,sum1=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter an array");
for(int i=0;i<6;i++){
arr[i]=sc.nextInt();
}
sum=arr[0]+arr[1]+arr[2];
for(int j=3;j<6;j++){
sum1=sum1+arr[j];
}
if(sum==sum1){
System.out.println("Perfect batch");
}
else
System.out.println("Not a perfect Batch");
}
}