package CentricToAll6;
import java.util.Scanner;
public class Lab111
{
    
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int [] marks=new int[6];
            System.out.println("Enter the marks of Hindi:");
            marks[0]=sc.nextInt();
            System.out.println("Enter the marks of Telugu:");
             marks[1]=sc.nextInt();
            System.out.println("Enter the marks of English:");
             marks[2]=sc.nextInt();
            System.out.println("Enter the marks of Maths:");
            marks[3]=sc.nextInt();
            System.out.println("Enter the marks of Science:");
            marks[4]=sc.nextInt();
            System.out.println("Enter the marks of SocialStudies:");
            marks[5]=sc.nextInt();

            for (int i = 0; i <= marks.length-1; i++)
            {
              if(marks[i]<35)
              {
                  System.out.println("You are Failed and secured marks = "+  marks[i]);

              }

            }
            
        }
    }

