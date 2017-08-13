/****************************************************************************** 
 *  Purpose: Accept year from user and print year is leap year or not.
 *
 *  @author  Daya Phalke
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

 /*
 *import statements
 */
public class LeapYear{

  public static void main(String args[]){

  int year=Integer.parseInt(args[0]);

   boolean isLeapYear;

  /*divisible by 4*/
  isLeapYear=(year % 4 == 0);

   /*divisible by 4 and not 100*/
  isLeapYear=isLeapYear && (year % 100 != 0);

   /*divisible by 4 and not 100 unless divisible by 400*/
  isLeapYear =isLeapYear || (year % 400 == 0);

    System.out.println(isLeapYear);
      }

   }