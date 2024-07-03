package collection2;
import java.util.*;
import java.io.*;
public class TestStudent1
{
public static void main(String[] args) 
{
	ArrayList <Student1> s  = new ArrayList <Student1>();
	s.add(new Student1(101,"praneeth","WISTM ENGG COLLEGE",100));
	s.add(new Student1(102,"purandahr aditya","ANITS ENGG COLLEGE",95));
	s.add(new Student1(103,"joy","RAGHU ENGG COLLEGE",80));
	
	Collections.sort(s,new nameComparator());
	for(Student1 x : s)
	{
		System.out.println(+x.rollno +x.name +x.collegename +x.marks);
	}
	Collections.sort(s,new rollnoComparator());
	for(Student1 x : s)
	{
		System.out.println(+x.rollno +x.name +x.collegename +x.marks);
	}
	
	

	}

}
