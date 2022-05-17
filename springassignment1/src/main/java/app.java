import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entities.Employee;
import entities.sbu;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("empbean.xml");
		Employee emp=(Employee) context.getBean("emp9");
		//System.out.println(emp);
		//Employee emp = (Employee)context.getBean("emp9");
		System.out.println("Employee Name :"+emp.getEmployeeName());
		System.out.println("Employee Salary:"+emp.getSalary());
		System.out.println("Employee ID:"+emp.getEmployeeId());
		System.out.println("Employee age:"+emp.getAge());
		System.out.println("Employee BusinessUnit:"+emp.getBusinessUnit());
		emp.getSbuDetails();
		Employee emp1 = (Employee)context.getBean("em1");
		Employee emp2 = (Employee)context.getBean("em2");
		System.out.println(emp1);
		System.out.println(emp2);
		
		
		
	}

}
