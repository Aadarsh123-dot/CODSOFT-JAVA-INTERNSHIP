package Student_grade_calculator;
import java.util.Scanner;

class Marks {
	double sub1, sub2, sub3, tmarks;
	Scanner sc = new Scanner(System.in);

	Marks() {
		System.out.print("Enter the Marks in Subject 1: ");
		sub1 = sc.nextDouble();
		System.out.print("Enter the Marks in Subject 2: ");
		sub2 = sc.nextDouble();
		System.out.print("Enter the Marks in Subject 3: ");
		sub3 = sc.nextDouble();
		tmarks = sub1 + sub2 + sub3;

	}

	void display1() {
		if (sub1 > 100 || sub2 > 100 || sub3 > 100) {
			System.out.println("Error!!...Enter Marks of each subject out 100 :( :( :( ");
		} else {
			System.out.println("Total Marks obtained: " + tmarks + "/300");
		}
	}
}

class Avg_Percent extends Marks {
	double avg;

	Avg_Percent() {
		avg = tmarks / 3;
	}

	void display2() {
		if (sub1 > 100 || sub2 > 100 || sub3 > 100) {
			System.out.println();
		} else {
			System.out.println("Average Percentage obtained is: " + avg);
		}

	}
}

class Grades extends Avg_Percent {
	void display3() {
		if (sub1 > 100 || sub2 > 100 || sub3 > 100) {
			System.out.println();
		}else if (avg >= 85) {
			System.out.println("Grade: A+");
		} else if (avg < 85 && avg >= 75) {
			System.out.println("Grade Obtained: A");
		} else if (avg < 75 && avg >= 65) {
			System.out.println("Grade Obtained: B");
		} else if (avg < 65 && avg >= 50) {
			System.out.println("Grade Obtained: C");
		} else if (avg < 50 && avg >= 40) {
			System.out.println("Grade Obtained: D");
		} else {
			System.out.println("Failed in Exam....Better Luck Next Time!!");
		}

	}
}

public class Student_Grade_Calculator {
	public static void main(String[] args) {
		Grades Std = new Grades();
		Std.display1();
		Std.display2();
		Std.display3();


	}
}

