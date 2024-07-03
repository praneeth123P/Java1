package collection2;
import java.util.*;
class nameComparator implements Comparator <Student1>
{
public int compare(Student1 s1, Student1 s2) {
	// TODO Auto-generated method stub
	return s1.name.compareTo(s2.name);
}
}
