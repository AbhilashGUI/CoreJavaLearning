package CentricToAll;

public class Lab005
{
    public static void main(String[] args)
    {
        //int is of 4bytes=32bits=2147483648
        //Assets earned during service =2147483647
        int assetvalue=2123000154;
        //assetvalue=2346987453;  Occurence of error due to the value exceeding
        System.out.println("Assetvalue is less than the int value " + assetvalue);
        int rewardsearned=29544820;
        System.out.println(assetvalue+ rewardsearned);  //Maximum value is shown

    }
}
