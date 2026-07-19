package CentricToAll13.Multithreading.Generics;

public class Lab240 {
    //Note: Generics are widely used in API Automation
    //Finding out the maximum number using compareto() method, for which we have to use comparable interface which can compare all datatypes

    public static <Generic extends Comparable<Generic>> Generic Maximumof(Generic a, Generic b, Generic c)
        //Note: Here the Generic in the diamond operator is a customised class

    {
        Generic Max=a;

        if(b.compareTo(Max)>0)
        {
            Max=b;
        }
        if(c.compareTo(Max)>0)
        {
            Max=c;
        }
        return c;

    }
        public static void main(String[] args)
        {
            System.out.println(Maximumof("Abhilash","Ajay","Aditya"));
            System.out.println(Maximumof('V','W','K'));
            System.out.println(Maximumof(22.3f,63.3f,45.4f));
            System.out.println(Maximumof(66,77,88));
        }


       }