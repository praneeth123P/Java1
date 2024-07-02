package oops;

public class student1 {
int id;
String name;
String village;
void student1(int id,String name,String village)
{
	id = id;
	name= name;
	village = village;
}
void display(int id , String name,String village)
{
	System.out.println(+id +name +village);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
student1 s1 = new student1();
s1.id = 101;
s1.name = "praneeth swami";
s1.village ="anandapuram";
s1.display(101,"praneeth swami","anandapuram");
	}
}
