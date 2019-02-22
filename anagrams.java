
import java.util.*;
class anagrams{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your words");
String str=sc.nextLine();
String str1=sc.nextLine();
int l=0,l1=0,c=0,c1=0;
char ch=' ',ch1=' ';
l=str.length();
l1=str1.length();
ArrayList arr=new ArrayList();

ArrayList arr1=new ArrayList();
//if(l==l1){
/*char[] arr=str.tocharArray();
Array.sort(arr);
System.out.println(Array.toString(arr));
char[] arr1=str1.tocharArray();
Array.sort(arr1);
System.out.println(Array.toString(arr1));
System.out.println(Arrays.equals(arr,arr1));**/
for(int i ='a';i<='z';i++){
c=0;
for(int j=0;j<l;j++){
ch=str.charAt(j);
if(ch==i){
c++;
}
}
arr.add(c);
}
for(int k ='a';k<='z';k++){
c1=0;
for(int m=0;m<l;m++){
ch1=str1.charAt(m);
if(ch1==k){
c1++;
}
}
arr1.add(c1);
}
System.out.println(arr);
System.out.println(arr1);
if(arr.equals(arr1))
{
System.out.println("Given number is anagrams");
}
else
System.out.println("Given words is not a anagrams");
}
}
