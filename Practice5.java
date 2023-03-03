import java.util.*;

class Practice5{

   public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter value B : ");
   int a = sc.nextInt();
   System.out.println("Enter value B : ");
   int b = sc.nextInt();
   int temp = a;
   a = b;
   b = temp;
   System.out.println("Swapped values are : ");
   System.out.println(a);
   System.out.println(b);
}
}