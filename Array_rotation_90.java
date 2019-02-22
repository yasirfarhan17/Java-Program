class Array_rotation_90{
public static void main(String args[]){
int arr[][]={{1,3},{7,8}};
int arr1[][]=new int[2][2];
for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
arr1[i][j]=arr[j][i];
}
}
for(int i=0;i<2;i++){
for(int j=1;j>=0;j--){
System.out.print(arr1[i][j]+" ");
}
System.out.println();
}
}
}