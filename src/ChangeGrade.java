import java.util.ArrayList;
import java.util.Scanner;

public class ChangeGrade
{
	public static void printClassList(ArrayList<Student> List)
	{
		for(int i = 1; i < List.size(); i++)   
		    System.out.println(i + " " + List.get(i).getFirst() + " " + List.get(i).getLast() + " " 
		                         + List.get(i).getClass1() + " " + List.get(i).getGrade1() + " " 
		    		             + List.get(i).getClass2() + " " + List.get(i).getGrade2() + " " 
		                         + List.get(i).getClass3() + " " + List.get(i).getGrade3() 
		                      );
		    		           
	}
	public static void pList(ArrayList<Student> List)
	{
		for(int i = 0; i < List.size(); i++)   
		    System.out.println(List.get(i).getFirst() + " " + List.get(i).getLast() + " " 
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
				
				List = classChange(List);
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
	
	private static ArrayList<Student> classChange(ArrayList<Student> List) {
		// TODO Auto-generated method stub
		int Student = 0;
		
		printClassList(List);
		
		System.out.println("Enter the student number whose class you want to change.");
		Scanner userInput = new Scanner(System.in);
		Student = userInput.nextInt();
		
		System.out.println("Which class would you like to transfer the student out of?");
		System.out.println("Period 1:" + " " + List.get(Student).getClass1());
		System.out.println("Period 2:" + " " + List.get(Student).getClass2());
		System.out.println("Period 3:" + " " + List.get(Student).getClass3());
		Scanner Input1 = new Scanner(System.in);
		int out = Input1.nextInt();
		
		System.out.println("Which class would you like to transfer the student into?");
		System.out.println("Period 1:" + " " + List.get(Student).getClass1());
		System.out.println("Period 2:" + " " + List.get(Student).getClass2());
		System.out.println("Period 3:" + " " + List.get(Student).getClass3());
		Scanner Input11 = new Scanner(System.in);
		int in = Input11.nextInt();
		
		if (out==1 && in==2) {
			String hold=List.get(Student).getClass2();
			List.get(Student).setC2(List.get(Student).getClass1());
			List.get(Student).setC1(hold);
		}
		if (out==1 && in==3) {
			String hold=List.get(Student).getClass3();
			List.get(Student).setC3(List.get(Student).getClass1());
			List.get(Student).setC1(hold);
		}
		if (out==2 && in==1) {
			String hold=List.get(Student).getClass1();
			List.get(Student).setC1(List.get(Student).getClass2());
			List.get(Student).setC2(hold);
		}
		if (out==3 && in==1) {
			String hold=List.get(Student).getClass3();
			List.get(Student).setC3(List.get(Student).getClass1());
			List.get(Student).setC1(hold);
		}
		if (out==2 && in==3) {
			String hold=List.get(Student).getClass3();
			List.get(Student).setC3(List.get(Student).getClass2());
			List.get(Student).setC2(hold);
		}
		if (out==3 && in==2) {
			String hold=List.get(Student).getClass3();
			List.get(Student).setC3(List.get(Student).getClass2());
			List.get(Student).setC2(hold);
		}
		System.out.println("New schedule: ");
		System.out.println("Period 1: "+List.get(Student).getClass1());
		System.out.println("Period 2: "+ List.get(Student).getClass2());
		System.out.println("Period 3: "+ List.get(Student).getClass3());
		
		return List;
	}
	

	}

