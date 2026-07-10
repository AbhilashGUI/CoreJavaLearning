package CentricToAll10.OOPS.Accessmodifiers.Criminal;

import CentricToAll10.OOPS.Accessmodifiers.Police.Cop;

public class Thief {

    public static void main(String[] args)
    {
        Cop thief= new Cop(1);
        thief.CanIshoot2();  //It is allowing, since it is public
    }
}