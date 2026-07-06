package CentricToAll3;

public class Lab023
{
    public static void main(String[] args)
    {

        //Relational operators : < > <= >= 	== != instanceof
        //Are often used to get the boolean results


      int year=2021;
      int year2=2026;
      boolean output=year<year2;
      System.out.println(output);

      int one_kg=1000;
      int ten_kgs=10000;   //in grams
      boolean weightcheck1=one_kg<ten_kgs;
      boolean weightcheck2=one_kg>ten_kgs;
      boolean weightcheck3=one_kg==ten_kgs;
      boolean weightcheck4=ten_kgs<one_kg;
      boolean weightcheck5=ten_kgs>one_kg;

      System.out.println(weightcheck1);
      System.out.println(weightcheck2);
      System.out.println(weightcheck3);
      System.out.println(weightcheck4);
      System.out.println(weightcheck5);








    }
}
