package com.bridgelabz.util;
/* Calculating the Carloan.
*/

import java.util.*;
class CarLoan
{


public static void main(String[] args)
{
  Double r;
 Double p=Double.parseDouble(args[0]);
 Double R=Double.parseDouble(args[1]);
 Double y=Double.parseDouble(args[2]);

Double n=12*y;
r=R/(12*100);
Double n1=Math.pow((1+r),(-n));


Double payment=(p*r/(1-n1));


System.out.println(payment);
}
}