package collection2;

 class Employee implements Comparable <Employee>
 {
int id;
String name;
int age;
int salary;
Employee(int id, String name,int age,int salary)
{
	this.id= id;
	this.name= name;
	this.age=age;
	this.salary=salary;
}
	public int compareTo(Employee e) 
	{
		if(salary == e.salary)
		{
		return 0;
		}
		else if(salary > e.salary)
			return 1;
		else
			return -1;
	}

	 
 }
 
 