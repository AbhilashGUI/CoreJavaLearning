package CentricToAll8;

public class Lab143 {
    public static void main(String[] args)
    {

      StringBuffer Threadsaftey=new StringBuffer("tnemnorivne dedaerht-itlum ni desu si tI");
      Threadsaftey.append(" ,refaS si tI");
      System.out.println(Threadsaftey.reverse());

      StringBuilder NotThreadSafety= new StringBuilder("tnemnorivne dedaerht elgnis ni dednemmoceR");
      NotThreadSafety.append(" ,retsaf si tI");
      NotThreadSafety.reverse();
      System.out.println(NotThreadSafety);

}
    }