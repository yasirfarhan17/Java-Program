class Dimond_pattern
{
  public static void main(String args[])
  {
    int p=1;
    //Try out your code here
    for(int i=1;i<4;i++){
      for(int space=1;space<=4-i;space++){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
      System.out.print("* ");
    }
       System.out.println("\n");
    }
    for(int i=1;i<=4;i++){
      for(int space=1;space<=i-1;space++){
        System.out.print(" ");
      }
      for(int j=1;j<=4-(i-1);j++){
    System.out.print("* ");
      }
      System.out.println("\n");
    }
  }
}