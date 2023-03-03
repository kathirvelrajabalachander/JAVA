import java.util.*;
class Marks{
   public static void main(String[] args){
    System.out.println("Enter the Marks : ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a <= 35){
     System.out.println("Grade C");
     }
    else if(a >35 && a <=60){
     System.out.println("Grade B");
     }
    else if(a > 60 && a <=85){
     System.out.println("Grade A");
     }
    else if(a >85 && a<=100){
     System.out.println("Grade A+");
     }
    else if(a >100){
     System.out.println("Invalid Marks");
     }
}
}