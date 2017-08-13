class Harmonic3
{
public static void main(String[] args)
 {
  int n=Integer.parseInt(args[0]);
  double har=0;
  for(int i=1; i<=n;i++)
   {
     har=har+Math.pow(i,-1);
     System.out.println(har+"=");
    }
for(int i=1; i<=n;i++)
   {
     
     System.out.println("1/" +i+ "+");
    }
    
}  }