import java.io.*;
import java.lang.*;
class primeno
{
public static void main(String[] args)
  {
    int i,ctr=0;
    int no=5;
    for(i=1;i<no;i++)
     {
        for(no=i;no>=1;no--)
          {
            if(i%no==0)
              {
                ctr++;
              }
             if(ctr==2)
              {
                System.out.println("prime no");
              }
           }
      }  
   }
}



