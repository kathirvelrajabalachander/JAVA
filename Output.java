import java.io.*;

public class Output {

    public static void main(String[] args) throws IOException{
        ByteArrayOutputStream output = new ByteArrayOutputStream(12);

        System.out.println("Enter the Characters ");

        while (output.size() != 10){
            output.write(System.in.read());
        }

        byte b[] = output.toByteArray();
        System.out.println("print the content");
        for(int x=0;x<b.length;x++){
            System.out.println((char)b[x] + " ");
        }
        System.out.println("  ");

        int c;

        ByteArrayInputStream input = new ByteArrayInputStream(b);

        System.out.println("converting characters to upper case ");
        for(int y=0;y<1;y++){
            while((c = input.read()) != -1){
                System.out.println(Character.toUpperCase((char)c));
            }
            input.reset();
        }
    }
    
}
