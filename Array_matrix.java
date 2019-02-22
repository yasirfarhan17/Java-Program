class Array_matrix{
public static void main(String args[]){
int mat[][]={{6,7,8},{4,5,2},{1,9,3}};
int mat1[][]={{6,7,8},{4,5,2},{1,9,3}};
int sum=0;
int add[][]=new int[3][3];
for(int i=0;i<=2;i++){
for(int j=0;j<3;j++){
sum=mat[i][j]+mat1[i][j];
add[i][j]=sum;
System.out.print(add[i][j]+" ");
}
System.out.println();
}
}
}

							

							