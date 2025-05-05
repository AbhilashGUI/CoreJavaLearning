package CentricToAll8;

public class Lab143 {
    public static void main(String[] args)
    {
      StringBuffer Threadsaftey=new StringBuffer("tnemnorivne dedaerht-itlum ni desu si tI");
      Threadsaftey.append(" ,refaS si tI");
      Threadsaftey.reverse();
      System.out.println(Threadsaftey);

      StringBuilder NotThreadSafety= new StringBuilder("tnemnorivne dedaerht elgnis ni dednemmoceR");
      NotThreadSafety.append(" ,retsaf si tI");
      System.out.println(NotThreadSafety.reverse());

}
    }