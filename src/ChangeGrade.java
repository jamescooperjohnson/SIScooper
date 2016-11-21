import java.util.ArrayList;
import java.util.Scanner;

public class ChangeGrade
{
	public static void printClassList(ArrayList<Student> List)
	{
		for(int i = 0; i < List.size(); i++)   
		    System.out.println(i + " " + List.get(i).getFirst() + " " + List.get(i).getLast() + " " 
		                         + List.get(i).getClass1() + " " + List.get(i).getGrade1() + " " 
		    		             + List.get(i).getClass2() + " " + List.get(i).getGrade2() + " " 
		                         + List.get(i).getClass3() + " " + List.get(i).getGrade3() 
		                      );
		    		           
	}
	
    public static ArrayList<Student> chgGrade(ArrayList<Student> List){
        int choice = 0;
        
		
			System.out.println("What would you like to do: \n 1) Change Grade \n 2) Switch Classes");
			Scanner input = new Scanner(System.in);
			choice = input.nextInt();
			
			if(choice ==1)
			{
				List = gradeChange(List);
			}
			else if(choice == 2)
			{
				//add change class
			}
			
		
		
		return List;	
    }
    
	
	public static ArrayList<Student> gradeChange(ArrayList<Student> List)
	{
		int Student = 0;
		int Class = 0;
		String newGrade = null;
				
		printClassList(List);
		
		System.out.println("Enter the student number who's grade you want to change");
		Scanner userInput = new Scanner(System.in);
		Student = userInput.nextInt();
		
		
			System.out.println("What class grade would you like to change?");
			System.out.println("1" + " " + List.get(Student).getClass1() + " " + List.get(Student).getGrade1());
			System.out.println("2" + " " + List.get(Student).getClass2() + " " + List.get(Student).getGrade2());
			System.out.println("3" + " " + List.get(Student).getClass3() + " " + List.get(Student).getGrade3());
			Scanner Input1 = new Scanner(System.in);
			Class = Input1.nextInt();
			
		
		System.out.println("Enter new grade");
		Scanner Input2 = new Scanner(System.in);
		newGrade = Input2.next();
		
		if(Class == 1)
		{
			List.get(Student).setG1(newGrade.toUpperCase());
		}
		else if(Class == 2)
		{
			List.get(Student).setG2(newGrade.toUpperCase());
		}
		else if (Class == 3)
		{
			List.get(Student).setG3(newGrade.toUpperCase());
		}
		
		List = CalcGPA.calcGPA(List);
		
		System.out.println(List.get(Student).getFirst() + " " + List.get(Student).getLast() + " " 
                + List.get(Student).getClass1() + " " + List.get(Student).getGrade1() + " " 
	             + List.get(Student).getClass2() + " " + List.get(Student).getGrade2() + " " 
                + List.get(Student).getClass3() + " " + List.get(Student).getGrade3() );
		
		return List;
	}

	}
	

