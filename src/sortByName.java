import java.util.Comparator;

public class sortByName implements Comparator<Student>
{
public int compare(Student s1, Student s2)
{
	return s1.getLast().compareTo(s2.getLast());
}
}
