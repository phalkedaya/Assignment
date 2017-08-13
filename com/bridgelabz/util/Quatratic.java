package com.bridgelabz.util;

public class Quatratic
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
double d=b*b-4*a*c;
if(d>0)
{
System.out.println("roots are real & unequal");
double root1=(-b+Math.sqrt(d))/(2*a);
double root2=(-b-Math.sqrt(d))/(2*a);
System.out.println(" first roots"+root1);
System.out.println("second roots"+root2);
}
else if(d==0)
{
System.out.println("roots are real & equal");
double root1=(-b+Math.sqrt(d))/(2*a);
System.out.println(root1);
}
else
{
System.out.println("roots are imaginary");
}
}
}
