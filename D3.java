import java.util.*;

class D3{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter array one size : ");
      int a = sc.nextInt();
      System.out.println("Enter second array size : ");
      int b = sc.nextInt();
      System.out.println("Enter second array size : ");
      int c = sc.nextInt();
      int x[][][] = new int[a][b][c];
       for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
               for(int k=0;k<c;k++){
              System.out.println("Enter the array values : ");
              x[i][j][k] = sc.nextInt();
                    }
                  }
              } 

       for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                for(int k=0;k<c;k++){
              System.out.print(x[i][j][k]+" ");
                    }
                System.out.println();
                  }
               System.out.println();
              } 
              
      }
}