package CentricToAll2;

public class Lab016 {
    public static void main(String[] args) {
        //Unary operators : postfix==>expr++, expr-- and prefix==>++expr,--expr

        int i=12;
        int j=14;
        System.out.println(i++);  //prints and later gets incremented
        System.out.println(i);
        System.out.println(++j);  //gets incremented and printed


        int k=15;
        int l=17;
        System.out.println(k--);
        System.out.println(k);
        System.out.println(--l);


       int m=65;
       int n=78;
       System.out.println(m++ + m++);
       System.out.println(n-- - n--);
       System.out.println(++m - --n);
       System.out.println(m-- + n--);






    }
}
