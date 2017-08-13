class Harmonic1
{
public static void main(String[] args)
 {
  int n=Integer.parseInt(args[0]);
  double sum=0;
  for(int i=1; i<=n;i++)
   {
     double harmonic=Math.pow(i,-1);
     sum=sum+harmonic;
    }
    System.out.println("sum is :"+sum);
 }
}