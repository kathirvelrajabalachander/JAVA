import java.util.*;

class Practice10{

   public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the first number : ");
   int a = sc.nextInt();
   System.out.println("Enter the second number : ");
   int b = sc.nextInt();

   if(a == b){
    System.out.println("The Given values are Equal");
      }else if(a > b){
    System.out.println("First number is greater than Second number");
      }else if(a < b){
    System.out.println("First number is less than Second number");
      }else{
    System.out.println("The Given Input is Invalid");
      }
 
    }
}