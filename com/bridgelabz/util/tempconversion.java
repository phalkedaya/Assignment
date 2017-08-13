/****************************************************************************** 
 *  Purpose: Accept names from user and print in reverse format.
 *
 *  @author  Daya Phalke
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

 /*
 *import statements
 */
import java.util.Scanner;
class tempconversion
{
public static void main(String args[])
   {
     float fh,cl;
    
     Scanner in=new Scanner(System.in);
     System.out.printf("enter the temprature value of fahrenheit\n");
     fh=in.nextFloat();
     cl=5*(fh-32)/9;
     System.out.printf("celsius=" + cl);

     System.out.printf("\n\nenter the temprature value of Celsius ");
     cl=in.nextFloat();
     fh=(cl*9/5)+32;
     System.out.printf("fahrenheit=" + fh);
    }
}