import java.util.*;

class Practice32{

   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Gmail ID : ");
      String str = sc.nextLine();
      
      if(str.endsWith("@gmail.com") == true){
      System.out.println(str +" " +"This Gmail ID is Valid");
       }else{
      System.out.println(str + " " +"is an Invalid Gmail ID");
       }  
   }
}