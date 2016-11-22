import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Object;
import java.util.ArrayList;

public class AoD {

	
	public static ArrayList<Student> Students(ArrayList<Student> List) throws FileNotFoundException
	{
		
		String first = null;
		String last = null;
		String class1 = null;
		String class2 = null;
		String class3 = null;
		String grade1 = null;
		String grade2 = null;
		String grade3 = null;
		double gpa = 0.00;
		
		Scanner file = new Scanner( new File("studentInformation.txt"));
		
	    while (file.hasNextLine()) {
			first = file.next();
			last = file.next();
			class1 = file.next();
			grade1 = file.next();
			class2 = file.next();
			grade2 = file.next();
			class3 = file.next();
			grade3 = file.next();
			
			List.add(new Student(first, last, class1, grade1, class2, grade2, class3, grade3,0.00));
			
		}
		return List;
	    
	}
	public static void printList(ArrayList<Student> List)
	{
		for(int i = 1; i < List.size(); i++)   
		    System.out.println(i + " " + List.get(i).getFirst() + " " + List.get(i).getLast());
		
		System.out.println();
	}
	public static void pList(ArrayList<Student> List)
	{
		for(int i = 1; i < List.size(); i++)   
		    System.out.println(List.get(i).getFirst() + " " + List.get(i).getLast());
		
		System.out.println();
	}
	
	
	
	public static ArrayList<Student> aoD(ArrayList<Student> List) throws FileNotFoundException
	{
		int choice = 0;
		
		
			System.out.println("What would you like to do: \n 1) add a student \n 2) delete a student");
			Scanner userinput = new Scanner(System.in);
			choice = userinput.nextInt();
			
			if(choice ==1)
			{
				addStudent(List);
			}
			else if (choice == 2)
			{
				delStudent(List);
			}
			return List;
		}

	public static  ArrayList<Student> addStudent(ArrayList<Student> List) throws FileNotFoundException {
		String first = null;
		String last = null ;
		String class1 = null;
		String class2 = null ;
		String class3 = null;
		String grade1 = null;
		String grade2 = null; 
		String grade3 = null;
		
			Scanner input1 = new Scanner(System.in);
			System.out.println("What is the students first name?");
			first = input1.next();
			System.out.println("What is the students last name?");
			last = input1.next();
			System.out.println("What is the students first class? (BIO, ENG, ALG)");
			class1 = input1.next();
			System.out.println("What is the students second class?  (BIO, ENG, ALG)");
			class2 = input1.next();
			System.out.println("What is the students third class?  (BIO, ENG, ALG)");
			class3 = input1.next();
			
			List.add(new Student(first, last, class1, "No Grade", class2, "No Grade", class3, "No Grade", 0.00));
			
			System.out.println("Here is the new list of students");
			pList(List);
			System.out.println();
			
			return List;
			}

	public static  ArrayList<Student> delStudent(ArrayList<Student> List){
		
		printList(List);
		
		System.out.println("Enter the number of the student to delete.");
		Scanner userinput = new Scanner(System.in);
		int choice = userinput.nextInt();
	  
		List.remove(choice);
		
		System.out.println("Here is the new list of students");
		pList(List);
		System.out.println();
		
		return(List);
	}
}