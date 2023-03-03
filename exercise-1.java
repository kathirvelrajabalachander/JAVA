package home;

public class First{
   static{
      System.out.println("Hello World!");
}
   public static void main(String[] args){
      byte a = 1;
      short b = 14;
      int c = 14;
      long d = 888888l;
      float e = 14.44f;
      double f = 100.34444444444d;
      char g = 'A';
      boolean h = (b == c);
    System.out.println(a + b + c + d + e + g + h);
    First obj1 = new First(); 
}
}