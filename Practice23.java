import java.util.*;

class Practice23{

   public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int [] arr = new int[a];
   

   for(int i=0;i<a;i++){
      arr[i] = sc.nextInt();
    }
    int b =arr[0]; 
    arr[0] = arr[a-1];
    arr[a-1] = b;

    for(int i=0;i<a;i++){
      System.out.println(arr[i]);
    }
  }
}