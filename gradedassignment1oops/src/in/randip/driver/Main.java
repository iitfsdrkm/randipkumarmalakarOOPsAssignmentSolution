package in.randip.driver;

import in.randip.model.*;

public class Main {

	public static void main(String[] args) {

		HrDepartment hrOb1 = new HrDepartment();
		AdminDepartment adminOb1 = new AdminDepartment();
		TechDepartment techOb1 = new TechDepartment();

		System.out.println("Welcome to " + adminOb1.departmentName());
		System.out.println(adminOb1.getTodaysWork());
		System.out.println(adminOb1.getWorkDeadline());
		System.out.println(adminOb1.isTodayHoliday());

		System.out.println();

		System.out.println("Welcome to " + hrOb1.departmentName());
		System.out.println(hrOb1.doActivity());
		System.out.println(hrOb1.getTodaysWork());
		System.out.println(hrOb1.getWorkDeadline());
		System.out.println(hrOb1.isTodayHoliday());

		System.out.println();

		System.out.println("Welcome to " + techOb1.departmentName());
		System.out.println(techOb1.getTodaysWork());
		System.out.println(techOb1.getWorkDeadline());
		System.out.println(techOb1.getTechStackInformation());
		System.out.println(techOb1.isTodayHoliday());

	}

}
