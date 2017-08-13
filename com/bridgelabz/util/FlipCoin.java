/*
  Print out Heads or Tails..
*/

class FlipCoin{

  public static void main(String args[]){
   

   n=Integer.parseInt(args[0])
   for(i=1; i<=n;i++)
   {
    if(Math.random() < 0.5)

     System.out.println("Heads");

  else

     System.out.println("Tails");

  }
 }