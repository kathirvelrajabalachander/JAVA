import java.util.*;

class Prism{
   public static void main(String[] args){
     System.out.println("Enter the values");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Base edge : ");
     double a = sc.nextDouble();
     System.out.println("Enter the Height : ");
     double b = sc.nextDouble();
     double Area = 5*a*b;
     System.out.println(Area);
}
}