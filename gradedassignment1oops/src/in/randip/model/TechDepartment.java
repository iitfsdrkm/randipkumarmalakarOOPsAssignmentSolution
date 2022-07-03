package in.randip.model;

public class TechDepartment extends SuperDepartment {
	
	private String deptTechStackInformation;

	public TechDepartment() {
		super();
		this.departmentName = "Tech Department";
		this.todaysWork = "Complete coding of module 1";
		this.workDeadline = "Complete by EOD";
		this.deptTechStackInformation = "Core Java";
		
	}
	
	
	public String departmentName() {
		return departmentName;
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}

	public String getTechStackInformation() {
		return deptTechStackInformation;
	}

}
