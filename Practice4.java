import java.util.*;

class Practice4{

   public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter five numbers : ");
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();
   int d = sc.nextInt();
   int e = sc.nextInt();

   int avg = (a+b+c+d+e)/5;
   System.out.println(avg);
}
}