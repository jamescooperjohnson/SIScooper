import java.util.ArrayList;


public class CalcGPA {
	public static void printClassGpa(ArrayList<Student> List)
	{
		for(int i = 0; i < List.size(); i++)
		{
		    System.out.print(" " + List.get(i).getFirst() + " " + List.get(i).getLast() + " ");
		    System.out.println(List.get(i).getGpa());
		}   
		
	}
	
	public static ArrayList<Student> calcGPA(ArrayList<Student> List)
	{
		int classtot = 3;
		double class1 = 0.0;
		double class2 = 0.0;
		double class3 = 0.0;
		double sumClass = 0.0;
		double grPtAv = 0.0;
		
		for(int i=0; i < List.size(); i++)
		{
			class1 = convertGrade(List.get(i).getGrade1());
			class2 = convertGrade(List.get(i).getGrade2());
			class3 = convertGrade(List.get(i).getGrade3());
			
			sumClass = class1 + class2 + class3;
			
			grPtAv = (sumClass/classtot);
			double GPAr = Math.round(grPtAv* 100.0) / 100.0;
			List.get(i).setGpa(GPAr);		
			

		}
		
		return List;
	}
	
	public static double convertGrade(String grade)
	{
		double gpanum = 0.0;
		
		switch (grade){
		case "A+": gpanum = 4.30;
				   break;
		case "A" : gpanum = 4.00;
		           break;
		case "A-": gpanum = 3.70;
		           break;
		case "B+": gpanum = 3.4;
		           break;
		case "B" : gpanum = 3.00;
		           break;
		case "B-": gpanum = 2.70;
		           break;
		case "C+": gpanum = 2.40;
		           break;
		case "C" : gpanum = 2.00;
		           break;
		case "C-": gpanum = 1.70;
		           break;
		case "D+": gpanum = 1.40;
		           break;
		case "D" : gpanum = 1.00;
		           break;
		case "D-": gpanum = 0.70;
		           break;
		case "F": gpanum = 0.00;
				           break;
		}
		
		return gpanum;
	}
}