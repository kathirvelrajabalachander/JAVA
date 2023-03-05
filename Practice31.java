import java.util.*;

class Practice31{

   public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int[] arr = new int[a];
   int x = arr[0];

   for(int i=0;i<a;i++){
      arr[i] = sc.nextInt();  
    }

   for(int i=0;i<a;i++){
      if(arr[i] > x){
      x = arr[i]; 
     }
     
    }
     System.out.println(x);

    for(int i=0;i<a;i++){
      if(arr[i] < x){
      x = arr[i]; 
     }
     
    }
     System.out.println(x);
  }
}