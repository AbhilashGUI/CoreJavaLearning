package AssignmentPrograms;

public class Count1 {
    public static void main(String[] args) {
        //Develop a program that counts the number of characters, vowels and consonants in a given string using loops and conditions.

        String name = "Vemula Abhilash Sharma";
        int count = 0;
        int Vcount = 0;  //Vowel count
        int Ccount = 0;  //Consonant count

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ') //Excluding the space and counting the string length
            {
                count++;
            }

            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u')
                //Retrieving the selected data
            {
                Vcount++;
            }
            else if (name.charAt(i) > 'a' && name.charAt(i) < 'z')
                //Inclusion of Alphabets to fetch consonants
            {
                Ccount++;
            }

        }
            System.out.println("Total characters in the string are : " + count);
            System.out.println("Total vowels in the string are : " + Vcount);
            System.out.println("Total consonants in the string are : " + Ccount);

        }

    }












