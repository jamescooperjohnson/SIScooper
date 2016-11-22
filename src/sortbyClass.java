import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class sortbyClass implements Comparator<Student>
{
	
	public int compare(Student s1, Student s2)
{
	 	
	return s1.getClass1().compareTo(s2.getClass1());
}
 public int compare1(Student s1, Student s2)
 {
		return s1.getClass2().compareTo(s2.getClass2());
 }
 public int compare2(Student s1, Student s2)
 {
		return s1.getClass3().compareTo(s2.getClass3());
 }
}





