class Array_mat_mult{
public static void main(String args[]){
int arr[][]={{1,3},{7,8}};
int arr1[][]={{2,1},{5,3}};
int sum[][]=new int[2][2];
int result=0;
for(int i=0;i<arr.length;i++){
int c=0,p=0;
for(int j=0;j<arr1[i].length;j++){
for(int k = 0; k < arr[i].length; k++){
 sum[i][j] = (arr[i][k] * arr1[k][j]);
//System.out.print(arr1[i][j]);
}
System.out.print(sum[i][j]+" ");
}
System.out.println();
}
}
}
