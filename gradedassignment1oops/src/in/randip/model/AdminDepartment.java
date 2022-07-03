package in.randip.model;

public class AdminDepartment extends SuperDepartment {
	
	public AdminDepartment() {
		super();
		this.departmentName = "Admin Department";
		this.todaysWork = "Complete your documents Submission";
		this.workDeadline = "Complete by EOD";
		
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

}
