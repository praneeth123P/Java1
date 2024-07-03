package task;
import java.util.*;
public class BookMain 
{
public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Book> b = new ArrayList <Book>();
b.add(new Book(101,"C PROGRAMMIMG","SJDN",300));
b.add(new Book(102,"PYTHON PROGRAMMIMG","DDNJ",500));
for(Book x : b)
{
	System.out.println(x);
}
}
}








