import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException {	
		
		ArrayList<Student> StudentList = new ArrayList<Student>();

		StudentList = AoD.loadStudents(StudentList);
		
		StudentList = CalcGPA.calcGPA(StudentList);
		

		displayMenu(StudentList);

	}


	public static void displayMenu(ArrayList<Student> StudentList) throws FileNotFoundException {
		int menu = 0;
		
		ArrayList<Student> List = new ArrayList<Student>();
		
		List = StudentList;
		 
	  	
		System.out.println("MAIN MENU");
		
		System.out.println("What would you like to do: \n 1) Add or delete a student \n 2) Change student grades/schedule \n 3) Sort students");
	
		Scanner Input = new Scanner(System.in);
		menu = Input.nextInt(); 

		switch(menu){
	    case 1:
	    	List = AoD.addDelMenu(List);
	       break;
	    case 2:
	    	List = ChangeGrade.chgGrade(List);
	       break; 
	    case 3:
	    	List = SortStudents.sortMenu(List);
	    	break;
	   
		}
	 
	 
	}

}