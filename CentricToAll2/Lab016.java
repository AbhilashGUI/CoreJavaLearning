package CentricToAll2;

public class Lab016 {
    public static void main(String[] args) {
        //Unary operators : postfix ==>expr++, expr-- and prefix  ==>++expr,--expr

        /*int i = 10;//postfix
        int j = 10;//prefix
        System.out.println(i++);
        System.out.print(++j);*/

        /*int i1=12;//postfix
        int j1=8;//prefix
        System.out.println(i1--);
        System.out.print(--j1);*/

       int i2=45;
        int j2=54;
        System.out.println(i2++ + ++j2);  //45+55 =100
        System.out.println(--j2 - j2--);  //53-53=0
        System.out.println(j2++ - --i2);  //54-45+1=8
        System.out.println(++j2 + --i2);  //55+44=99









    }
}
