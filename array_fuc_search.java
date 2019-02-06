import java.util.*;
class array_fuc_search
{
  public static void search(int arr[],int s){
      boolean match=false;
    for(int i=0;i<10;i++){
      if(s==arr[i])
      {
        match=true;
      }
    }
    if(match==true){
        System.out.println("Found");
    }
      else
        System.out.println("Not found");
  }
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[10];
    System.out.println("Enter an array");
    for(int i=0;i<10;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter an element to be search");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
   search(arr,a);
     search(arr,b);
       search(arr,c);
  }
}