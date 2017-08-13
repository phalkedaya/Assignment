package com.bridgelabz.util;
class DayOfWeek
{
public static void main(String[] args)
  {
    int m,y,d;
double m0,d0,x;
    
    d=Integer.parseInt(args[0]);
    //System.out.println("Enter the day");
    m=Integer.parseInt(args[1]);
   // System.out.println("Enter the month");
    y=Integer.parseInt(args[2]);
    //System.out.println("Enter the year");
    
   double y0=y-(14-m)/12;
    x=y0-y0/4-y0/100+y0/400;
    m0=m+12*((14-m)/12)-2;
    
    d0=(int)((d+x+(31*m0)/12)%7);
    System.out.println(d0);
 
 /*  if(d==0)
{
    System.out.println("sunday");}
if(d==1)
{  System.out.println("monday");}
if(d==2)
{  System.out.println("tuesday");}
else if(d==3)
{  System.out.println("wednesday");}
else if(d==4)
{  System.out.println("Thusrday");}
else if(d==5)
{   System.out.println("sunday");*/


  

   
  }
}
    
    
