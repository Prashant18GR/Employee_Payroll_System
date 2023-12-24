package com.luv2code.eps.EmployeePayrollsystem;

import com.luv2code.eps.EmployeePayrollsystem.dao.EmployeeDAO;
import com.luv2code.eps.EmployeePayrollsystem.entity.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeePayrollsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePayrollsystemApplication.class, args);}
		@Bean
				public CommandLineRunner commandLineRunner(EmployeeDAO employeeDAO){
			return runner -> {

				createEmployee(employeeDAO);

				//readEmployee(employeeDAO);

				//updateEmployee(employeeDAO);

				//deleteEmployee(employeeDAO);
			};
		}

	private void deleteEmployee(EmployeeDAO employeeDAO) {
		int employeeId=23;
		System.out.println("Deleting Employee with Id: "  + employeeId);
		employeeDAO.delete(23);

	}

	private void updateEmployee(EmployeeDAO employeeDAO) {
		int employeeId=8;//here i am giving choice for updation
		System.out.println("Getting student with Id "+ employeeId);

		Employee myemployee= employeeDAO.findById(employeeId);

		System.out.println("Updating employee....");

		//now i am changing name by updating simple using getter setter
		// here for my personal understanding

		myemployee.setSalary(77000);
		employeeDAO.update(myemployee);

		//All SET displaying the student

		System.out.println("Updated Student is : " + myemployee);
	}

	private void readEmployee(EmployeeDAO employeeDAO) {
		//create
		System.out.println("Creating a new employee object...");
		Employee tempEmployee10= new Employee("Vicky","SDE1" ,"Noida",50000);

		//save
		System.out.println("Saving the employee....");
		employeeDAO.save(tempEmployee10);

		//Display id of saved employee
		int theId= tempEmployee10.getid();
		System.out.println("Saved employee. Generated id " + theId);

		//retrieve employee based on id
		System.out.println("Retrieving employee with id " + theId);
		Employee myemployee= employeeDAO.findById(theId);

		//display
		System.out.println("Found the employee"+ myemployee);


	}

	private void createEmployee(EmployeeDAO employeeDAO) {
		System.out.println("Creating a new employee object...");
		Employee tempEmployee= new Employee("Prashant","SDE" ,"Noida",50000);
		Employee tempEmployee1= new Employee("Kriti","UIUX","Gurugram",60000);
		Employee tempEmployee2= new Employee("Amit","SAP","Gurugram",55000);
		Employee tempEmployee3= new Employee("Shivank","Manager","Mumbai",69000);
		Employee tempEmployee4= new Employee("Nikhil","Manager","EYDelhi",85000);
		Employee tempEmployee5= new Employee("Arun","Trainee","Bangalore",30000);
		Employee tempEmployee6= new Employee("Yashwant","Clerk","Mysore",54000);
		Employee tempEmployee7= new Employee("Pushp","Consultant","Mysore",90000);
		Employee tempEmployee8= new Employee("Vijay","ASE","Noida",44000);
		Employee tempEmployee9= new Employee("Sandeep","SSE","HYD",98000);

		System.out.println("Saving the employee....");
		employeeDAO.save(tempEmployee);
		employeeDAO.save(tempEmployee1);
		employeeDAO.save(tempEmployee2);
		employeeDAO.save(tempEmployee3);
		employeeDAO.save(tempEmployee4);
		employeeDAO.save(tempEmployee5);
		employeeDAO.save(tempEmployee6);
		employeeDAO.save(tempEmployee7);
		employeeDAO.save(tempEmployee8);
		employeeDAO.save(tempEmployee9);




		System.out.println("Saved employee. Generated id " + tempEmployee.getid());
		System.out.println("Saved employee. Generated id " + tempEmployee1.getid());
		System.out.println("Saved employee. Generated id " + tempEmployee2.getid());
		System.out.println("Saved employee. Generated id " + tempEmployee3.getid());
		System.out.println("Saved employee. Generated id " + tempEmployee4.getid());
		System.out.println("Saved employee. Generated id " + tempEmployee5.getid());
		System.out.println("Saved employee. Generated id " + tempEmployee6.getid());
		System.out.println("Saved employee. Generated id " + tempEmployee7.getid());
		System.out.println("Saved employee. Generated id " + tempEmployee8.getid());
		System.out.println("Saved employee. Generated id " + tempEmployee9.getid());


	}
}





