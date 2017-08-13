class Sin1 
{
   public static int factorial(int anglex)
    {
      if(anglex==1)
      return 1;
      else
      return anglex=anglex*factorial(anglex-1);
      } 

    public static void main(String[] args)
      {
      double anglex=Integer.parseInt(args[0]);

      int copyofanglex=(int) X;

      anglex=anglex%(2*Math.PI);

    double sinval=anglex-Math.pow(anglex,3)/factorial(3) +Math.pow(anglex,5)/factorial(5)-Math.pow(anglex,7)/factorial(7);

System.out.println("sin "+copyofanglex+ "=" +sinval);
    
}
} 