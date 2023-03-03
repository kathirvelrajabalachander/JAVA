import java.io.*;

class FileStreamsTest {
    public static void main(String[] args) throws IOException {

            DataInputStream input = new DataInputStream(new FileInputStream("D:\\java\\text.txt"));
            DataOutputStream output = new DataOutputStream(new FileOutputStream("D:\\java\\text1.pdf"));

            String str;

            while ((str = input.readLine()) != null) {
               String u = str.toUpperCase();
               System.out.println(u);
               output.writeBytes(u + " ,");
            }

            input.close();
            output.close(); 
    }
}