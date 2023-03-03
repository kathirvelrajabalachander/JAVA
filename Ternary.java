import java.util.*;
class Ternary{
   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number : ");
     int a = sc.nextInt();
     System.out.println("Enter the number : ");
     int b = sc.nextInt();
     String c = (a == b)? "Equal":"Not Equal";
     System.out.println(c);
}
}