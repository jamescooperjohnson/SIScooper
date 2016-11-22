import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class sortbyClass2 implements Comparator<Student>
{
	
 public int compare(Student s1, Student s2)
 {
		return s1.getClass2().compareTo(s2.getClass2());
 }
}
