import java.util.*;
class IfExample{
public static void main(String[] args){
    System.out.println("Enter the names");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the First name : ");
    int str1 = sc.nextInt();
    System.out.println("Enter the Second name : ");
    int str2 = sc.nextInt();
    if(str1 == str2){
       if{
      System.out.println("Equal");
     } else if(str1 >= 123){
      System.out.println("greater than or equal to second number");
     }
}
     else{
       System.out.println("Not equal");
     }
}
}