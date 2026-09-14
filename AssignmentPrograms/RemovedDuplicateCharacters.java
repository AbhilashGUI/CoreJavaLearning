package AssignmentPrograms;

public class RemovedDuplicateCharacters {

    public static void main(String[] args)
    {

        String name="EffortNeverDies";
        String result=" ";

        for (int i=0;i<name.length();i++) {
            char currentchar = name.charAt(i);

            if (result.indexOf(currentchar) == -1) {
                result = result + currentchar;
            }
        }
            System.out.println("Original String: "+name);
            System.out.println("After removing the duplicate characters: "+result);
        }
    }
