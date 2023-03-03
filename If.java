import java.util.*;
class IfExample{
public static void main(String[] args){
    System.out.println("Enter the names");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the First names : ");
    String str1 = sc.nextLine();
    System.out.println("Enter the Second names : ");
    String str2 = sc.nextLine();
    if(str1 == str2){
    System.out.println("Equal");
     }
    else{
      System.out.println("Not equal");
     }
}
}