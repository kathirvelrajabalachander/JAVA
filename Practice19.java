import java.util.*;
class Practice19{
   public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number1 : ");
      int a = sc.nextInt();
      System.out.println("Enter the Number2 : ");
      int b = sc.nextInt();

      while(b!=0){

        int c = a & b;
        a = a^b;
        b = c<<a;
      }      
        System.out.println(a);
}
}