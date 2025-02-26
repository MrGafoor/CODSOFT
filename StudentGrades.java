import java.util.Scanner;
public class StudentGrades{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.print("Enter your English subject marks : ");
		int Eng=sc.nextInt();
		System.out.println();
		System.out.print("Enter your Hindi subject marks : ");
		int Hin=sc.nextInt();
		System.out.println();
		System.out.print("Enter your Mathametics subject marks : ");
		int Math=sc.nextInt();
		System.out.println();
		System.out.print("Enter your Physics subject marks : ");
		int Phy=sc.nextInt();
		System.out.println();
		System.out.print("Enter your Biology subject marks : ");
		int Bio=sc.nextInt();
		System.out.println();
		System.out.print("Enter your Social subject marks : ");
		int Social=sc.nextInt();
		System.out.println();
		float totalSubjects=6;
		
		float TotalMarks=Eng+Hin+Math+Phy+Bio+Social; //Total marks
		System.out.println("==>Your results are:");
		System.out.println();
		System.out.println("--- Your total marks are : "+ TotalMarks+" ---");

		float AverageValue=AverageMarks(TotalMarks,totalSubjects);

		Grades(AverageValue);
		
		
	}
	public static float AverageMarks(float TotalMarks,float totalSubjects){
		float Average=TotalMarks/(totalSubjects);
		System.out.println();
		System.out.println("--- The Average marks are: "+Average+" ---");
	return Average;
	}


	public static void Grades(float AverageValue){
		System.out.println();
		if(AverageValue>=90){
			System.out.println("--- You Secured 'S' Grade ---");
		}else if(AverageValue<90&& AverageValue>=80){
			System.out.println("--- You Secured 'A+' Grade ---");
		}else if(AverageValue<80&& AverageValue>=70){
			System.out.println("--- You Secured 'A' Grade ---");
		}else if(AverageValue<70&& AverageValue>=60){
			System.out.println("--- You Secured 'B+' Grade ---");
		}else if(AverageValue<60&& AverageValue>=50){
			System.out.println("--- You Secured 'B' Grade ---");
		}else if(AverageValue<50&& AverageValue>=40){
			System.out.println("--- You Secured 'C' Grade ---");
		}else{
			System.out.println("--- You Secured 'F' Grade, and You are failed to promote for next year..! ---");
		}
	}
}