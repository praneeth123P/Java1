package collection2;
import java.util.*;
class TestEmployee
{
public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Employee> e = new ArrayList <Employee>();
e.add(new Employee(101,"praneeth",22,9000000));
e.add(new Employee(102,"swami",22,700000));
e.add(new Employee(103,"joy",21,800000));
Collections.sort(e);
for(Employee x : e)
{
	System.out.println(+x.id +x.name +x.age +x.salary);
}

	}

}
