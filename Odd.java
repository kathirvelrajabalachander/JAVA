import java.util.*;

class Odd{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b[] = new int[a];

     for(int i=0;i<a;i++){
        b[i] = sc.nextInt();
        }

     for(int i=0;i<a;i+=2){
        System.out.print(b[i]+" ");
        }
     
}
}