class Exception3{

   public static void main(String[] args){

    int a = 100/0;
    System.out.println(a);
    throw new ArithmeticException("0 cannot divide");
    
  }
}