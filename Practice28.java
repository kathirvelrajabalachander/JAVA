import java.util.*;

class Practice28{

  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the String : ");
   String str = sc.nextLine();
   System.out.println("Enter the character you want to remove : ");
   char a = sc.next().charAt(0);
   String str1 = Character.toString(a);
   System.out.println(str.replaceAll(str1," "));
   System.out.println(str);
   
   }
}