import java.util.*;
class Array_repeat
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
int arr1[]=new int[5];
int arr2[]=new int[100];
int c=0;
System.out.println("Enter an arrya");
for(int i=0;i<5;i++){
arr[i]=sc.nextInt();
}
System.out.println("Enter an arrya");
for(int i=0;i<5;i++){
arr1[i]=sc.nextInt();
}
for(int i=0;i<5;i++){
for(int j=0;j<i;j++){
if(arr[i]!=arr1[j])
{
arr2[c]=arr[j];
c++;
}
}
}
for(int k=0;k<10;k++){
System.out.println("Ater eliminating:"+arr2[k]);
}
}
}
