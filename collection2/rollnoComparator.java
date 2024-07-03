package collection2;
import java.util.*;
class rollnoComparator implements Comparator <Student1>
{
	public int compare(Student1 s1, Student1 s2) 
	{
		if(s1.rollno == s2.rollno)
		{
			return 0;
		}
		else if(s1.rollno < s2.rollno)
			return 1;
		else
			return -1;
	}

}

