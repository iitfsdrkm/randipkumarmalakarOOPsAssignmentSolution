package in.randip.model;

public class SuperDepartment {
	
	protected String departmentName;
	protected String todaysWork;
	protected String workDeadline;
	protected String todayHoliday;
	
	
	public SuperDepartment() {
		super();
		this.departmentName = "Super Department";
		this.todaysWork = "No Work as of now";
		this.workDeadline = "Nil";
		this.todayHoliday = "Today is not a Holiday";
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

	public String isTodayHoliday() {
		return todayHoliday;
	}


}



