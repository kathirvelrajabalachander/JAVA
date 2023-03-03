import java.util.*;

class Practice3{

    public static void main(String[] args){

      
      Scanner sc = new Scanner(System.in);
      System.out.println("+,-,/,*,%");
       System.out.println("Enter value operation : ");
       String c = sc.nextLine();
      System.out.println("Enter value A : ");
       int a = sc.nextInt();
       System.out.println("Enter value B : ");
       int b = sc.nextInt();
       int d;
       
      switch(c){
         case "+" :
               d = a + b;
               System.out.println("Addition of A and B is " + d);
               break;

         case "-" : 
                d = a - b;
               System.out.println("Subtraction of A and B is " + d);
               break;
   
         case "/" :
                d = a / b;
               System.out.println("Division of A and B is " + d);
               break;

         case "*" :
                d = a * b;
               System.out.println("Multiplication of A and B is " + d);
               break;

         case "%" :
               d = a % b;
               System.out.println("Modulus of A and B is " + d);
               break;

         default:
               System.out.println("Enter valid symbol or Integer ");
              }
       }
}