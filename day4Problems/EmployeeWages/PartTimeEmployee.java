package day4Problems.EmployeeWages;

public class PartTimeEmployee {
	int empwagehrs;
	int emphrs=0;
	int prsnt_full_time=1;
	int prsnt_part_time=0;
	public void PartTime(int empwagehrs) {
		this.empwagehrs = empwagehrs;
		int empattendance = (int) Math.floor(Math.random()*10)%3;
		if(empattendance==prsnt_full_time)
		{
			emphrs=10;
		}
		else
			if(empattendance==prsnt_part_time)
		{
			emphrs=8;
		}
			else
			{
			emphrs=0;	
			}
	emphrs+=emphrs;
	int dailyempwages=emphrs*empwagehrs;
	System.out.println("Daily Employees Wages : " +dailyempwages);
	}
public static void main(String[] args) {
	PartTimeEmployee part = new PartTimeEmployee();
	part.PartTime(20);
}

}
