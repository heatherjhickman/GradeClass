package hickman_exam2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

import hickman_exam2.GradeClass;

public class hickman_exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Author: Heather Hickman
		Class: CPT 236 H01 Intro to Java Programming
		Description: Exam 2
		Date written: 7/30/2019
		Date last updated: 7/30/2019
		Program name: hickman_exam2.java
		
		Program summary: Exam 2.
		For this program, you will be creating software that will allow someone to enter information about grades. Each person will have 4 grades
		that will need to be entered. The grades must be in the range of 0 to 100 inclusive. A class will need to be created named GradeClass that will
		have variables to handle the name and the 4 grades that will be entered. Appropriate constructors, accessors and mutators will also need to be
		created.
		
		There will be 3 total sets of names and grades that must be entered with objects created using the GradeClass. Once all the information is entered,
		you will then use the accessors to get the information from the objects you created and place that information in parallel arrays.
		You will then use a loop to output all the information from the arrays into a table with a header, then a column with the name, then the four
		grades, and finally calculate the average of the four grades for each user. The last row is the average of the columns of grades. Example below.
		
		Name	Grade1	Grade2	Grade3	Grade4	Average
		John	55		65		75		85		70
		Bob		90		90		90		90		90
		Jack	#		#		#		#		#
		Average	#		#		#		#		#
		
		Not only does the code have to be create, but you must also comment thoroughly at the top of the program with your name, class number, exam number,
		and date created. Also comment throughout the code what the tasks the create code will perform. No requirements document. */
		
		
		// CREATE SCANNER KEYBOARD
		Scanner keyboard = new Scanner(System.in);
				
		// CREATE OBJECTS FROM THE SaleClass CLASS
		GradeClass student1 = new GradeClass();
		GradeClass student2 = new GradeClass();
		GradeClass student3 = new GradeClass();
				
		// CREATE ARRAYS TO HOLD THE STUDENT NAMES AND THEIR GRADES
		String studentArray[] = new String[3];
		double gradeOneArray[] = new double[3];
		double gradeTwoArray[] = new double[3];
		double gradeThreeArray[] = new double[3];
		double gradeFourArray[] = new double[3];
				
		// INITIALIZE VARIABLES TO TEMPORARILY HOLD THE INPUTS
		String nameHolder = "";
		double gradeHolder = 0.0;
		
		
		
		// SET THE FIRST STUDENTS NAME (W/ INPUT VALIDATION)
		System.out.print("Please enter the name for student 1: ");
		nameHolder = keyboard.nextLine();
		
		if (nameHolder.equals("")) {
			System.out.print("You did not enter anything. Please type a name: ");
			nameHolder = keyboard.nextLine(); }
		
		else if (nameHolder.matches("[0-9]+")) {
			System.out.print("Your name must consist of only letters. Please type a name: ");
			nameHolder = keyboard.nextLine(); }
		
		student1.setName(nameHolder);

		
		// SET STUDENT 1'S GRADES
		// GRADE ONE
		do {
			System.out.print("Please enter the first grade for " + nameHolder + ": ");
			
			if (keyboard.hasNextDouble()) {
				gradeHolder = keyboard.nextDouble(); 
				student1.setGOne(gradeHolder);
				
				if (gradeHolder < 0 || gradeHolder > 100) {
					System.out.println("Your grade must be between 0-100(inclusive)."); }}
			
				else {
					System.out.println("You must enter a number, not letters.");
					keyboard.nextLine();}
			
		} while (gradeHolder < 0 || gradeHolder > 100);
		
		
		// GRADE TWO
		gradeHolder = 0.0;
		do {
			System.out.print("Please enter the second grade for " + nameHolder + ": ");
			
			if (keyboard.hasNextDouble()) {
				gradeHolder = keyboard.nextDouble();
				student1.setGTwo(gradeHolder);
				
				if (gradeHolder < 0 || gradeHolder > 100) {
					System.out.println("Your grade must be between 0-100(inclusive)."); }}
			
			else {
				System.out.println("You must enter a number, not letters.");
				keyboard.nextLine();}
			
		} while (gradeHolder < 0 || gradeHolder > 100);
		
		
		// GRADE THREE
		gradeHolder = 0.0;
		do {
			System.out.print("Please enter the third grade for " + nameHolder + ": ");
			
			if (keyboard.hasNextDouble()) {
				gradeHolder = keyboard.nextDouble();
				student1.setGThree(gradeHolder);
				
				if (gradeHolder < 0 || gradeHolder > 100) {
					System.out.println("Your grade must be between 0-100(inclusive)."); }}
			
			else {
				System.out.println("You must enter a number, not letters.");
				keyboard.nextLine();}
			
		} while (gradeHolder < 0 || gradeHolder > 100);

		
		// GRADE FOUR
		gradeHolder = 0.0;
		do {
			System.out.print("Please enter the fouth grade for " + nameHolder + ": ");
			
			if (keyboard.hasNextDouble()) {
				gradeHolder = keyboard.nextDouble();
				student1.setGFour(gradeHolder);
				
				if (gradeHolder < 0 || gradeHolder > 100) {
					System.out.println("Your grade must be between 0-100(inclusive)."); }}
			
			else {
				System.out.println("You must enter a number, not letters.");
				keyboard.nextLine();}
			
		} while (gradeHolder < 0 || gradeHolder > 100);
		
		
		
		// RESET KEYBOARD
		keyboard.nextLine();
		
		
		
		// SET THE SECOND STUDENTS NAME (W/ INPUT VALIDATION)
		System.out.print("\nPlease enter the name for student 2: ");
		nameHolder = keyboard.nextLine();
		
		if (nameHolder.equals("")) {
			System.out.print("You did not enter anything. Please type a name: ");
			nameHolder = keyboard.nextLine(); }
		
		else if (nameHolder.matches("[0-9]+")) {
			System.out.print("Your name must consist of only letters. Please type a name: ");
			nameHolder = keyboard.nextLine(); }
		
		student2.setName(nameHolder);

		
		// SET STUDENT 2'S GRADES
		// GRADE ONE
		do {
			System.out.print("Please enter the first grade for " + nameHolder + ": ");
			
			if (keyboard.hasNextDouble()) {
				gradeHolder = keyboard.nextDouble(); 
				student2.setGOne(gradeHolder);
				
				if (gradeHolder < 0 || gradeHolder > 100) {
					System.out.println("Your grade must be between 0-100(inclusive)."); }}
			
				else {
					System.out.println("You must enter a number, not letters.");
					keyboard.nextLine();}
			
		} while (gradeHolder < 0 || gradeHolder > 100);
		
		
		// GRADE TWO
		gradeHolder = 0.0;
		do {
			System.out.print("Please enter the second grade for " + nameHolder + ": ");
			
			if (keyboard.hasNextDouble()) {
				gradeHolder = keyboard.nextDouble();
				student2.setGTwo(gradeHolder);
				
				if (gradeHolder < 0 || gradeHolder > 100) {
					System.out.println("Your grade must be between 0-100(inclusive)."); }}
			
			else {
				System.out.println("You must enter a number, not letters.");
				keyboard.nextLine();}
			
		} while (gradeHolder < 0 || gradeHolder > 100);
		
		
		// GRADE THREE
		gradeHolder = 0.0;
		do {
			System.out.print("Please enter the third grade for " + nameHolder + ": ");
			
			if (keyboard.hasNextDouble()) {
				gradeHolder = keyboard.nextDouble();
				student2.setGThree(gradeHolder);
				
				if (gradeHolder < 0 || gradeHolder > 100) {
					System.out.println("Your grade must be between 0-100(inclusive)."); }}
			
			else {
				System.out.println("You must enter a number, not letters.");
				keyboard.nextLine();}
			
		} while (gradeHolder < 0 || gradeHolder > 100);

		
		// GRADE FOUR
		gradeHolder = 0.0;
		do {
			System.out.print("Please enter the fouth grade for " + nameHolder + ": ");
			
			if (keyboard.hasNextDouble()) {
				gradeHolder = keyboard.nextDouble();
				student2.setGFour(gradeHolder);
				
				if (gradeHolder < 0 || gradeHolder > 100) {
					System.out.println("Your grade must be between 0-100(inclusive)."); }}
			
			else {
				System.out.println("You must enter a number, not letters.");
				keyboard.nextLine();}
			
		} while (gradeHolder < 0 || gradeHolder > 100);
		
		
		
		// RESET KEYBOARD
		keyboard.nextLine();		

		
		
		// SET THE THIRD STUDENTS NAME (W/ INPUT VALIDATION)
		System.out.print("\nPlease enter the name for student 3: ");
		nameHolder = keyboard.nextLine();
		
		if (nameHolder.equals("")) {
			System.out.print("You did not enter anything. Please type a name: ");
			nameHolder = keyboard.nextLine(); }
		
		else if (nameHolder.matches("[0-9]+")) {
			System.out.print("Your name must consist of only letters. Please type a name: ");
			nameHolder = keyboard.nextLine(); }
		
		student3.setName(nameHolder);

		
		// SET STUDENT 3'S GRADES
		// GRADE ONE
		do {
			System.out.print("Please enter the first grade for " + nameHolder + ": ");
			
			if (keyboard.hasNextDouble()) {
				gradeHolder = keyboard.nextDouble(); 
				student3.setGOne(gradeHolder);
				
				if (gradeHolder < 0 || gradeHolder > 100) {
					System.out.println("Your grade must be between 0-100(inclusive)."); }}
			
				else {
					System.out.println("You must enter a number, not letters.");
					keyboard.nextLine();}
			
		} while (gradeHolder < 0 || gradeHolder > 100);
		
		
		// GRADE TWO
		gradeHolder = 0.0;
		do {
			System.out.print("Please enter the second grade for " + nameHolder + ": ");
			
			if (keyboard.hasNextDouble()) {
				gradeHolder = keyboard.nextDouble();
				student3.setGTwo(gradeHolder);
				
				if (gradeHolder < 0 || gradeHolder > 100) {
					System.out.println("Your grade must be between 0-100(inclusive)."); }}
			
			else {
				System.out.println("You must enter a number, not letters.");
				keyboard.nextLine();}
			
		} while (gradeHolder < 0 || gradeHolder > 100);
		
		
		// GRADE THREE
		gradeHolder = 0.0;
		do {
			System.out.print("Please enter the third grade for " + nameHolder + ": ");
			
			if (keyboard.hasNextDouble()) {
				gradeHolder = keyboard.nextDouble();
				student3.setGThree(gradeHolder);
				
				if (gradeHolder < 0 || gradeHolder > 100) {
					System.out.println("Your grade must be between 0-100(inclusive)."); }}
			
			else {
				System.out.println("You must enter a number, not letters.");
				keyboard.nextLine();}
			
		} while (gradeHolder < 0 || gradeHolder > 100);

		
		// GRADE FOUR
		gradeHolder = 0.0;
		do {
			System.out.print("Please enter the fouth grade for " + nameHolder + ": ");
			
			if (keyboard.hasNextDouble()) {
				gradeHolder = keyboard.nextDouble();
				student3.setGFour(gradeHolder);
				
				if (gradeHolder < 0 || gradeHolder > 100) {
					System.out.println("Your grade must be between 0-100(inclusive)."); }}
			
			else {
				System.out.println("You must enter a number, not letters.");
				keyboard.nextLine();}
			
		} while (gradeHolder < 0 || gradeHolder > 100);
		
		
		
		// ASSIGN NAMES AND SALES TO THE ARRAYS
		studentArray[0] = student1.getName();
		studentArray[1] = student2.getName();
		studentArray[2] = student3.getName();
				
		gradeOneArray[0] = student1.getGradeOne();
		gradeOneArray[1] = student2.getGradeOne();
		gradeOneArray[2] = student3.getGradeOne();
				
		gradeTwoArray[0] = student1.getGradeTwo();
		gradeTwoArray[1] = student2.getGradeTwo();
		gradeTwoArray[2] = student3.getGradeTwo();
				
		gradeThreeArray[0] = student1.getGradeThree();
		gradeThreeArray[1] = student2.getGradeThree();
		gradeThreeArray[2] = student3.getGradeThree();
		
		gradeFourArray[0] = student1.getGradeFour();
		gradeFourArray[1] = student2.getGradeFour();
		gradeFourArray[2] = student3.getGradeFour();
				
				

		// PRINT OUT TABLE HEADER
		System.out.print("\nName\t\tGrade1\t\tGrade2\t\tGrade3\t\tGrade4\t\tAverage\n");
				
		// IMPORT FORMATTER TO FORMAT DECIMALS TO 0.00 FORMAT
		NumberFormat formatter = new DecimalFormat("#0.00");
		
		
		// ADD THE AVERAGE (COLUMN) AND PRINT OUT THE STUDENTS NAMES AND GRADES IN A TABLE
		double average = 0;
		for(int i = 0; i < 3; i++) {
			average = (gradeOneArray[i] + gradeTwoArray[i] + gradeThreeArray[i] + gradeFourArray[i]) / 4;
			System.out.println(studentArray[i] + "\t\t" + gradeOneArray[i] + "\t\t" + gradeTwoArray[i] + "\t\t" + gradeThreeArray[i] + "\t\t"
								+ gradeFourArray[i] + "\t\t" + formatter.format(average)); }
				
		
		// ADD THE AVERAGE (ROW) AND PRINT OUT THE FINAL ROW
		double averageGrade1 = 0;
		double averageGrade2 = 0;
		double averageGrade3 = 0;
		double averageGrade4 = 0;
		double overallAverage = 0;
				
		averageGrade1 = (gradeOneArray[0] + gradeOneArray[1] + gradeOneArray[2]) /3;
		averageGrade2 = (gradeTwoArray[0] + gradeTwoArray[1] + gradeTwoArray[2]) /3;
		averageGrade3 = (gradeThreeArray[0] + gradeThreeArray[1] + gradeThreeArray[2]) /3;
		averageGrade4 = (gradeFourArray[0] + gradeFourArray[1] + gradeFourArray[2]) /3;
		overallAverage = (averageGrade1 + averageGrade2 + averageGrade3 + averageGrade4) / 4;
				
		System.out.print("Average\t\t" + formatter.format(averageGrade1) + "\t\t" + formatter.format(averageGrade2)
					+ "\t\t" + formatter.format(averageGrade3) + "\t\t" + formatter.format(averageGrade4) + "\t\t" + formatter.format(overallAverage));

	}

}
