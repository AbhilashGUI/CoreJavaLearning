package AssignmentPrograms;

public class Fizzbuzz
{
    //Fizz buzz
    /*Write a program that prints numbers from 1 to 100. For multiples of 3 print "FIZZ" and multiples of 5 print "BUZZ"
    and Multiples of 3 and 5 print "FIZZBUZZ" */

        public static void main(String[] args)
        {
          for(int i=0;i<=100;i++)
          {
              if(i%3==0 && i%5==0)
              {
                  System.out.println( i + "-->" + " Fizzbuzz ");
              }
              else if (i%3==0)
              {
               System.out.println(i + "-->" +" Fizz ");
              }
              else if (i%5==0)
              {
                System.out.println(i + "-->" + " Buzz ");
              }
              else
              {
                  System.out.println(i);
              }
          }

          System.out.println("---End of the program--");

        }
}