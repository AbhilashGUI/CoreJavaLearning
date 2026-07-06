package CentricToAll3;

public class Lab031
{
    public static void main(String[] args)
    {
        String Firstname="Abhilash";
        String Middlename="Sharma";
        String Surname="Vemula";

        //Using concat() method for connecting strings as a whole

        String FM=Firstname.concat(Middlename);
        String SF=Surname.concat(Firstname);
        String MS=Middlename.concat(Surname);
        String SMF=Firstname.concat(Middlename).concat(Surname);
        System.out.println(FM);
        System.out.println(SF);
        System.out.println(MS);
        System.out.println(SMF);



    }
}
