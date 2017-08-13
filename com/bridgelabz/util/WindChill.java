package com.bridgelabz.util;

class WindChill
{
public static void main(String[] args)
  {
    double t,v,v1,w;
   /* Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of temprature:");
    t=sc.nextInt();
    System.out.println("Enter the value of velocity:");
    v=sc.nextInt();
   */
t=Double.parseDouble(args[0]);
v=Double.parseDouble(args[1]);
    v1=Math.pow(v,0.16);
    w=35.74+(0.6215*t)+((0.4275*t)-35.75)*v1;
    System.out.println(w);
    }
}