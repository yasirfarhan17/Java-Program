class Array_pair{
public static void main(String args[]){
int arr[]={5,10,13,45,50,65};
int val=58;
int f=0,e=arr.length-1,sum=0;
       while(f< e)
       {
          sum = arr[f] + arr[e];
          if(sum > val)
          {
             e--;
          }
          else if(sum < val)
          {
             f++;
          }
          else if(sum == val)
          {
             System.out.println("("+arr[f] +"," + " "+ arr[e]+")");
             break;
          }
       }
   }
}
