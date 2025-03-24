package CentricToAll6;
import java.util.Scanner;
public class Lab111
{
    
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int [] score= new int[5];
            System.out.println("Project delivery");
            score[0]=sc.nextInt();
            System.out.println("Process excellence");
            score[1]=sc.nextInt();
            System.out.println("Skill development");
            score[2]=sc.nextInt();
            System.out.println("Self discipline");
            score[3]=sc.nextInt();
            System.out.println("Soft skills");
            score[4]=sc.nextInt();

            for (int i=0;i<=score.length-1;i++)
            {
                System.out.println(score[i]);

              }

            }
            
        }


