package task;
import java.util.*;
public class EmployeeMain 
{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
ArrayList<Employee> e = new ArrayList<Employee>();
for(int i = 0;i<2;i++)
{
	System.out.println("enter id");
	int id = sc.nextInt();
	System.out.println("enter name");
	String name = sc.next();
	double salary = 0;
	Employee e1 = new Employee(id,name,salary);
	e.add(e1);
}
for(Employee x :e)
{
	System.out.println(x);
}
	}

}
