import java.util.*;
class  Loop{
   public static void main(String[] args){
    System.out.println("Enter the Number for Loop: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for(int j=0;j<=a;j++){
     System.out.println(j);  
}
    System.out.println("Enter the Number While Loop: ");
    int i = sc.nextInt();
    while(i<=a){
     System.out.println(i);
     i++;
}  
    do{
    i++;
     System.out.println(i);
 
}while(i<a);
}
}