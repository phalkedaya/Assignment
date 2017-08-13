class BinaryRep
{
	public static void main(String[] args)
   	{
	 	//double  a=1*Math.pow(2,n)+1*Math.pow(2,n2)+1*Math.pow(2,n3)+1*Math.pow(2,n4);
	 	//System.out.prinln(a);
	//}
//}

	  int n=Integer.parseInt(args[0]);
    int i=0;
    int power=1;
   // System.out.println("power of 2 that are less than 2^"+n);
    while(i<=n)
     {
      System.out.println("1*"+"2^"+i + "+" +power);
      power=power*2;
      i=i+1;

}
}
}