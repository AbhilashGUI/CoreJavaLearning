package AssignmentPrograms;

public class CountVC {

    public static void main(String[] args) {

        String name = "abhilash sharma vemula";

        int count=0;
        int vcount=0;
        int ccount=0;

        for (int i=0;i<name.length();i++)
        {
            if (name.charAt(i) !=' ')
            {
                count++;
            }
            if (name.charAt(i)=='a'|| name.charAt(i)=='e'|| name.charAt(i)=='i'|| name.charAt(i)=='o' || name.charAt(i)=='u')
            {
                vcount++;
            }
            else if (name.charAt(i)>='a' && name.charAt(i)<='z')
            {
                ccount++;
            }
        }

        System.out.println("Total characters in the String are :"+count);
        System.out.println("Total vowels in the String are :"+vcount);
        System.out.println("Total constants in the String are :"+ccount);

        }



    }

