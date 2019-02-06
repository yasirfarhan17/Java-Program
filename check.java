import java.util.*;
import java.util.Scanner.*;
public class check {
    public static String getDay(String day, String month, String year) 
    { 
        Calendar cal = Calendar.getInstance(); 
        cal.set(Integer.parseInt(day)-2,Integer.parseInt(month)-2,Integer.parseInt(year)-1);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); 
        String Day[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};    
        return(Day[dayOfWeek-1]); 
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String day1,month1,year1;
        System.out.println("Enetr dd/mm/yyyy:");
       day1=sc.next();month1=sc.next(); year1=sc.next();
        System.out.println(getDay(day1,month1,year1));
    }
}