import java.util.Scanner;
import java.util.LinkedList;

public class linked_list{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
LinkedList<Integer> list=new LinkedList();
for(int i=0;i<n;i++){
int value=scan.nextInt();
list.add(value );
}
int Q=scan.nextInt();
for(int i=0;i<=Q;i++)
{
String action=scan.next();
if(action.equals("Insert")){
int index=scan.nextInt();
int value=scan.nextInt();
list.add(index,value);
}
else{//Delete
int index=scan.nextInt();
list.remove(index);
}
}
scan.close();
for(Integer num:list){
System.out.println(num+" ");
}
}
}