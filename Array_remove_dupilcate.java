import java.util.Scanner;
class Array_remove_dupilcate
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] =new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
      
       remove_duplicate_element(arr_size, arr);
   }
   public static void remove_duplicate_element(int arr_size, int arr[])
   {
       for(int index1 = 0; index1 < arr_size; index1++)
       {
           for(int index2 = index1 + 1; index2 < arr_size; index2++)
           {
               if(arr[index1] == arr[index2])
               {
                   for(int index3 = index2; index3 < arr_size - 1; index3++)
                   {
                       arr[index3] = arr[index3 + 1];
                   }
                   arr_size--;
                   index2--;
               }
           }
       }
       for(int index = 0; index < arr_size; index++)
       {
           System.out.print(arr[index] + " ");
       }
   }
}
