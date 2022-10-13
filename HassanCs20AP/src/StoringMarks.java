import java.util.ArrayList;
import java.util.Collections;

public class StoringMarks {

	public static void main(String[] args) {
		ArrayList<String> studentName = new ArrayList<String>();
		Collections.addAll(studentName, "Quinn", "Simon", "Kosta", "Hassan", "Patrick", "Frank", "Sebastien");
		ArrayList<Integer> gradeNum = new ArrayList<Integer>();
		Collections.addAll(gradeNum, 10, 10, 11, 11, 11, 12, 12);
		ArrayList<Double> exam1 = new ArrayList<Double>();
		Collections.addAll(exam1, 90.0, 80.0, 87.0, 96.0, 50.0, 50.0, 77.0);
		ArrayList<Double> exam2 = new ArrayList<Double>();
		Collections.addAll(exam2, 80.0, 70.0, 79.0, 98.0, 30.0, 70.0, 45.0);
		ArrayList<Double> exam3 = new ArrayList<Double>();
		Collections.addAll(exam3, 50.0, 20.0, 39.0, 89.0, 80.0, 66.0, 50.0);
		System.out.println("Name Grade Exam1 Exam2 Exam3");

		for (int i = 0; i < 7; i++) {
			exam3.set(i, exam3.get(i) + 5.0);
//		    System.out.println( studentName.get(i) + " " + gradeNum.get(i)+ " " + exam1.get(i)+ " " + exam2.get(i)+ " " + exam3.get(i));
			 exam3.set(0,(double) 50.0+5.0);
			 exam3.set(1,(double) 20.0+5.0);
			 exam3.set(2,(double) 39.0+5.0);
			 exam3.set(3,(double) 89.0+5.0);
			 exam3.set(4,(double) 80.0+5.0);
			 exam3.set(5,(double) 66.0+5.0);
			 exam3.set(6,(double) 50.0+5.0);
			 System.out.println( studentName.get(i) + " " + gradeNum.get(i)+ " " +exam1.get(i)+ " " + exam2.get(i)+ " " + exam3.get(i));
		}				
		System.out.println("Grade 10's and 11's:");
		for (int i = 0; i < 7; i++) {
			if (gradeNum.get(i) == 10 || gradeNum.get(i) == 11) {
				System.out.println(studentName.get(i) + " " + gradeNum.get(i));
			}
		}
		System.out.println("Exam 1 grade less than 50%:");
		for (int i = 0; i < exam1.size(); i++) {
			if (exam1.get(i) <= 50) {
				System.out.println(studentName.get(i) + " " + exam1.get(i));
			}
		}
		double exam1a = 0;
		for(int i = 0; i < exam1.size(); i++) {
			exam1a += exam1.get(i);
		    }
		exam1a /= exam1.size();
		System.out.println("Exam 1 average:"+exam1a+"%");
		double exam2a = 0;
		for(int i = 0; i < exam2.size(); i++) {
			exam2a += exam2.get(i);
		    }
		exam2a /= exam2.size();
		System.out.println("Exam 2 average:"+exam2a+"%");
		double exam3a = 0;
		for(int i = 0; i < exam3.size(); i++) {
			exam3a += exam3.get(i);
		    }
		exam3a /= exam3.size();
		System.out.println("Exam 3 average:"+exam3a+"%");
	}
}
