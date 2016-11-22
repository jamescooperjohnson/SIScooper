import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class SortStudents
	{

	private static final ArrayList<Student> StudentList = null;

	public static ArrayList<Student> sortMenu(ArrayList<Student> List) throws FileNotFoundException{
		
		int choice = 0;
        
		
			System.out.println("What would you like to do: \n 1) Sort by Last Name \n 2) Sort by GPA \n 3) Sort BY Class");
			Scanner input = new Scanner(System.in);
			choice = input.nextInt();
			
			if(choice ==1)
			{
				Collections.sort(List, new sortByName());			
				AoD.pList(List);
			}
			else if(choice == 2)
			{
				Collections.sort(List, new sortByGpa());
				CalcGPA.printClassGpa(List);
			}
			else if (choice == 3)
		    {
				
				System.out.println();
				System.out.println("Sorted by Class 1:");
				System.out.println();
				Collections.sort(List, new sortbyClass());
				ChangeGrade.pList(List);
				System.out.println();
				System.out.println("Sorted by Class 2:");
				System.out.println();
				Collections.sort(List, new sortbyClass2());
				ChangeGrade.pList(List);
				System.out.println();
				System.out.println("Sorted by Class 3:");
				System.out.println();
				Collections.sort(List, new sortbyClass3());
				ChangeGrade.pList(List);
			}
			
		
		return List;	
	}

	
	
}