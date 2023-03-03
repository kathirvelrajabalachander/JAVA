import java.io.*;
class File{
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str;
      System.out.println("Enter the text : ");
      System.out.println("Enter '.' to quit");
      do{
          str = br.readLine();
          System.out.println(str);
        }while(!str.contains("."));
}
}