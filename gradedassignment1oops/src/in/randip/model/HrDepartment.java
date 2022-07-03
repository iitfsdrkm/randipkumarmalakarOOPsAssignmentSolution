package in.randip.model;

public class HrDepartment extends SuperDepartment {
	
	private String departmentActivity;

	public HrDepartment() {
		super();
		this.departmentName = "HR Department";
		this.todaysWork = "Fill today's worksheet and mark your attendance";
		this.workDeadline = "Complete by EOD";
		this.departmentActivity = "Team Lunch";
		
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

	public String doActivity() {
		return departmentActivity;
	}

}
