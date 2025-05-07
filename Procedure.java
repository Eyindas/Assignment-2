public class Procedure {
	private String procedureName;
	private String procedureDate;
	private String practitionerName;
	private double procedureCharges;
	
	
	// this is the No-arg constructor
	public Procedure() {}
	
	
	//procedure name and date
	public Procedure(String procedureName, String procedureDate) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		
	}
	
	
	//all fields
	public Procedure(String procedureName, String procedureDate, String practitionerName,double procedureCharges) {
		
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practitionerName = practitionerName;
		this.procedureCharges = procedureCharges;
		
	}
	
	
	public String getProcedureName() {return procedureName;}
	public String getProcedureDate() {return procedureDate;}
	public String getPractitionerName() {return practitionerName;}
	public double getProcedureCharges() {return procedureCharges;}
	
	public void setProcedureName(String procedureName) {this.procedureName = procedureName;}
	public void setProcedureDate(String procedureDate) {this.procedureDate = procedureDate;}
	public void setPractitionerName(String practitionerName) {this.practitionerName = practitionerName;}
	public void setProcedureCharges(double procedureCharges) {this.procedureCharges = procedureCharges;}
	
	public String toString() {
		return("\n\tProcedure: " + procedureName +"\n\tProcedure Date: " + procedureDate + "\n\tPractitioner: " + practitionerName + "\n\tCharges: $" + String.format("%.2f",procedureCharges));
	}
	
	
}