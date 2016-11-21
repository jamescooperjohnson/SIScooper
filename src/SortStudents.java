import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class SortStudents
	{

	public static ArrayList<Student> sortMenu(ArrayList<Student> List){
		
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
				//add sort by gpa
				CalcGPA.printClassGpa(List);
			}
			else if (choice == 3)
		    {
				//add sort by class
				ChangeGrade.printClassList(List);
			}
			
		
		return List;	
	}
	
}