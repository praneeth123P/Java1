package oops;

public class employee {
int id;
String name;
String company;
double salary;
employee(int id,String name,String company,double salary)
{
	this.id=id;
	this.name=name;
	this.company=company;
	this.salary=salary;
}

void display(int id,String name,String company,double salary)
{
	System.out.println(+id  +name  +company  +salary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee e1 = new employee(101,"praneeth swami","infosys",900000);
e1.display(101,"praneeth swami","infosys",9000000);

	}

}

