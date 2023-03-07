class Exception1{

   public static void main(String[] args){

    try{
         int a = 100/0;
    }
    catch(Exception e){
      System.out.println(e);
    }
     finally {  
      System.out.println("finally block is executed where it contains exception or not");  
    } 
  }
}