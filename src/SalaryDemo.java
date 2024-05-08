import java.util.Scanner;
public class SalaryDemo
{
   public static void main(String[] args)
   {
      Employee[] staff = new Employee[3];
      staff[0] = new HourlyEmployee("Brown, Harry", 50);
      staff[1] = new SalariedEmployee("Smith, Sally", 104000); 
      staff[2] = new Manager("Taylor, Mary", 104000, 50);
      Scanner in = new Scanner(System.in);
      for (Employee e : staff)
      {
         System.out.print("Hours worked by " + e.getName() + ": ");
         int hours = in.nextInt();
         System.out.println("Salary: " + e.weeklyPay(hours));
      }
      in.close();
   }
}