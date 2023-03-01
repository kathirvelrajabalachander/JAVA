import java.util.*;

class D2{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter array one size : ");
      int a = sc.nextInt();
      System.out.println("Enter second array size : ");
      int b = sc.nextInt();
      int x[][] = new int[a][b];
      int count = 0;
       for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
              System.out.println("Enter the array values : ");
              x[i][j] = sc.nextInt();
                  }
              } 

       for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
              System.out.print(x[i][j]+" ");
                  }
              } 
              System.out.println();

      }
}