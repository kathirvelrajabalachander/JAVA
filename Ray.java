import java.util.*;

class Ray{
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
     
      System.out.println("Enter the String size : ");
	int value = sc.nextInt();

      System.out.println("Enter the Integer size : ");
	int values = sc.nextInt();

      String[] str = new String[value];
      

      System.out.print("Enter values of the string : ");
      for(int i=0;i<str.length;i++){
         str[i] = sc.nextLine();
        }
      for(int j = 0; j<str.length; j++){
        System.out.println(str[j]);
        }

      int[] x = new int[value];
  
      System.out.println("Enter values of the integer: ");
      for(int i=0;i<x.length;i++){
         str[i] = sc.nextLine();
        }
       
      for(int k = 0; k<x.length; k++){
        System.out.println("Integer Values Are: " + str[k]);
        }
}
}