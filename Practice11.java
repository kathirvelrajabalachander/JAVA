import java.util.*;

class Practice11{

    public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
   int count = 0;
   int count1 = 0;

   for(int i=0;i<str.length();i++){
      if(str.charAt(i)!=' '){
      count++;
       }else if(str.charAt(i)==' '){
      count1++;
       }
    }
   System.out.println("Total number of letters : " + count);
   System.out.println("Total number of space : " + count1);
       }
}