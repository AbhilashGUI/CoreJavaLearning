package AssignmentPrograms;

import java.util.*;

public class IterateHashMap {


    public static void main(String[] args)
    {

        Map<String,String> employee=new LinkedHashMap<>();
        employee.put("Name","Abhilash");
        employee.put("Role","TestEngineer");
        employee.put("Experience","4Years");
        employee.put("Location","Hyderabad");

        System.out.println("Employee details: ");

      for (Map.Entry<String,String> entry: employee.entrySet())
          System.out.println(entry.getKey() + " : "+entry.getValue());

    }
}