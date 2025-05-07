import java.util.Scanner;
public class PatientDriverApp
{
	public static void patientDisplay(Patient patient)
	
	{
		System.out.println(patient.toString());
	}
	public static void procedureDisplay(Procedure procedure)
	{
		System.out.println(procedure.toString());
	}
	public static double calculateTotalCharges(Procedure pro1, Procedure pro2,Procedure pro3)
	{
		return pro1.getProcedureCharges() + pro2.getProcedureCharges() + pro3.getProcedureCharges();
	}
	
	public static void main(String [] args)
	{
		
		//this scanner will read object from the keyboard
		Scanner keyboard = new Scanner(System.in); 
		
		
		//Asking information about the patient to the user
		System.out.println("Enter patient information: ");
		System.out.print("First Name: ");
		String firstName = keyboard.nextLine();
		System.out.print("Middle Name: ");
		String middleName = keyboard.nextLine();
		System.out.println("Last Name: ");
		String lastName = keyboard.nextLine();
		System.out.println("Street Adress: ");
		String streetAddress = keyboard.nextLine();
		System.out.println("City: ");
		String city = keyboard.nextLine();
		System.out.println("State: ");
		String state = keyboard.nextLine();
		System.out.println("Zip: ");
		String zip = keyboard.nextLine();
		System.out.println("Phone: ");
		String phone = keyboard.nextLine();
		System.out.println("Emergency Contact Name: ");
		String emergencyContactName = keyboard.nextLine();
		System.out.println("Emergency Contact Phone: ");
		String emergencyContactPhone = keyboard.nextLine();
		
		Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zip, phone, emergencyContactName, emergencyContactPhone);
		
		Procedure pro1 = new Procedure ("Physical Exam", "06/12/2023", "Dr. Adams", 3050.00);
		Procedure pro2 = new Procedure ("X-ray", "06/17/2023", "Dr. James", 4500.00);
		Procedure pro3 = new Procedure ("Blood Test", "06/24/2023", "Dr. koumba", 2565.00);
		
		System.out.println("Student Name: ");
		String studentName = keyboard.nextLine();
		System.out.println("M#: ");
		String Mnumber = keyboard.nextLine();
		System.out.println("Due date: ");
		String dueDate = keyboard.nextLine();
		
		
		//Displaying information about the patient and about the procedure
		patientDisplay(patient);
		procedureDisplay(pro1);
		procedureDisplay(pro2);
		procedureDisplay(pro3);
		
		
		//Displaying the total charges 
		double totalCharges = calculateTotalCharges(pro1, pro2, pro3);
		System.out.println("Total charges: $"+ String.format("%,.2f",totalCharges) + "\n");
		
		
		//Displaying information about the program
		System.out.println("Student Name: " + studentName + "\nM#: " + Mnumber + "\nDue date: " + dueDate);
		keyboard.close();
		
	}
	
}