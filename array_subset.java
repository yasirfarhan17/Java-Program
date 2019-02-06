import java.util.*;
class array_subset{
public static void main(String args[]){
int arr[]=new int[6];
int sum=0,sum1=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter an array");
for(int i=0;i<6;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<6;i++){
for(int j=i+1;j<6;j++){
System.out.print("("+arr[i]+","+arr[j]+")");
}
System.out.println("\n");
}
}
}