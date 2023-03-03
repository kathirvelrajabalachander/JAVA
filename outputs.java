//package for access io files
import java.io.*;

//Everything in java is a class and it should have name. while naming ,no space between names.  

public class Outputs {

    //main function ,program starts with main function then goes to other methods.

    public static void main(String[] args) throws IOException{ //it handles the exception .if any error occured 

         // ByteArrayOutputStream -to outputs bytecode
         //output - object name
         //new - creating new object
         //12 - size  

        ByteArrayOutputStream output = new ByteArrayOutputStream(12); 

        //while loop iterate until condition equals to 10

        while (output.size() != 10){

            //the below line reads input 

            output.write(System.in.read());
        }

        //assign toByteArray method to b and convert individual byte values into arrays 

        byte b[] = output.toByteArray();

        //print the following statement

        System.out.println("print the content");

        //for loop will iterate until x less than b.length

        for(int x=0;x<b.length;x++){

            //print byte into char

            System.out.print((char)b[x] + " ");
        }

        //print space

        System.out.println("  ");

        //declare integer c

        int c;

        //ByteArrayInputStream - get input code
        //input - object name
        //new - creating new object
        //b - we take the value as we already initialized 

        ByteArrayInputStream input = new ByteArrayInputStream(b);

        //print the statement

        System.out.println("converting characters to upper case ");

        //for loop will iterate until y less than 1

        for(int y=0;y<1;y++){

            //it will read input for c
            //-1 indicates end of file

            while((c = input.read()) != -1){

                //it will convert int into uppercase characters

                System.out.print(Character.toUpperCase((char)c));
            }

            //it will refresh the process

            input.reset();
        }
    }
    
}