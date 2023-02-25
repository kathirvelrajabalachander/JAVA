import java.util.*;

class Average{
   public static void main(String[] args){
      System.out.println("Enter the 5 Numbers");
      System.out.println("Enter 1st Number : ");
      Scanner sc = new Scanner(System.in);
      double a = sc.nextDouble();
      System.out.println("Enter 2nd Number : ");
      double b = sc.nextDouble();
      System.out.println("Enter 3rd Number : ");
      double c = sc.nextDouble();
      System.out.println("Enter 4th Number : ");
      double d = sc.nextDouble();
      System.out.println("Enter 5th Number : ");
      double e = sc.nextDouble();
      double avg = (a+b+c+d+e)/5;
      System.out.println(avg);
      
}
}