import java.util.Scanner;
class Array_merge
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int list1[] = new int[n1];
    for(int i = 0; i < n1; i++)
    {
      list1[i] = sc.nextInt();
    }
    int n2 = sc.nextInt();
    int list2[] = new int[n2];
    for(int i = 0; i < n2; i++)
    {
      list2[i] = sc.nextInt();
    }
    int list3[]= new int[n1+n2];
    int index_1 = 0, index_2 = 0, index_3 = 0;
    while(index_1 <= n1-1 && index_2 <= n2-1)
    {
      if(list1[index_1] < list2[index_2])
      {
        list3[index_3] = list1[index_1];
        index_3++;
        index_1++;
      }
      else
      {
        list3[index_3] = list2[index_2];
        index_3++;
        index_2++;
    	}
    }
    while(index_1 <= n1-1)
    {
      list3[index_3] = list1[index_1];
      index_3++;
      index_1++;
    }
    while(index_2 <= n2-1)
    {
      list3[index_3] = list2[index_2];
      index_3++;
      index_2++;
    }
    for (int index = 0; index<n1+n2; index++)
    {
      System.out.print(list3[index]+" ");
    }
  }
}
