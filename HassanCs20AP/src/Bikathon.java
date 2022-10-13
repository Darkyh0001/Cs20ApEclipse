import java.util.ArrayList;
import java.util.Collections;

public class Bikathon {

	public static void main(String[] args) {
		ArrayList<String> studentName = new ArrayList<String>();
		Collections.addAll(studentName, "Quinn ", "Simon ", "Kosta ", "Hassan ", "Patrick ", "Frank ", "Sebastien ",
				"Dilshaan ", "Omar ", "Jacky ");
		ArrayList<Double> studentAmount = new ArrayList<Double>();
		Collections.addAll(studentAmount, 236.0, 497.0, 335.0, 40.0, 240.0, 785.0, 145.0, 942.0, 608.0, 422.0);
		ArrayList<Boolean> studentForm = new ArrayList<Boolean>();
		Collections.addAll(studentForm, true, false, true, true, true, true, true, false, true, true);
		System.out.println("Name | Donations($)| Form");
		for (int i = 0; i < studentName.size(); i++) {
			System.out.println(studentName.get(i) + " " + studentAmount.get(i) + " " + studentForm.get(i));
		}
		double totalAmount = 0;
		for (int i = 0; i < studentAmount.size(); i++) {
			totalAmount += studentAmount.get(i);
		}
		System.out.println("Total raised by team: $" + totalAmount);
		System.out.println("The average raised per student is $" + totalAmount / studentAmount.size());
		int numStudents = 0;
		for (int i = 0; i < studentAmount.size(); i++) {
			if (studentAmount.get(i) <= 120.0) {
				numStudents++;
			}
		}
		System.out.println("The number of students less than minimum amount is:" + numStudents);
		if (numStudents >= 2) {
			System.out.println("Living Room Location:  Closet");
		} else {
			System.out.println("You are not gonna be in the closet :)");
		}
		for (int i = 0; i < studentForm.size(); i++) {
			if (!studentForm.get(i)) {
				System.out.println(studentName.get(i) + ": Did not return the form");
			}
		}

		int highestAmount = 0;
		int goldenFans = 0;
		for (int i = 0; i < studentAmount.size(); i++) {
			if (studentAmount.get(i) > studentAmount.get(highestAmount)) {
				highestAmount = i;
			}
			if (studentAmount.get(i) >= 500) {
				goldenFans += studentAmount.get(i);
			}
		}
		System.out.println(studentName.get(highestAmount) + "collected the most donations for an amount of $"
				+ studentAmount.get(highestAmount));
		System.out.println("The golden fan amount is $"+goldenFans);
	}

}
