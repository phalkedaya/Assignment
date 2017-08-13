package com.bridgelabz.util;

import java.util.Scanner;

 class BMI
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    double weight=0;
    double height=0;
     double bMI=0;
    System.out.println("enter ur weight in pounds: ");
    weight=sc.nextDouble();
    System.out.println("enter ur height in Inches: ");
    height=sc.nextDouble();

    bMI=(weight/(height*height));
   
    System.out.println(" Body mass index is: " + bMI);
    System.out.println("bmi values");
      System.out.println("underweight: under 18.5");
      System.out.println("normal : 18.5 -24.9");
  System.out.println("bmi overweight: 25-29.9");
  System.out.println("obese : 30 or over");
 

 }
}