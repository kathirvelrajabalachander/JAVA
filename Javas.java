import java.io.*;
class Javas{
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      System.out.println(System.getProperty(str));
      System.out.println(str.contains("java"));
      
}
}