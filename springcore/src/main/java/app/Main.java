package app;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entities.Employee;
import entities.sbu;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("empbean.xml");
		sbu sbu = (sbu) context.getBean("sbu");

		Scanner sc = new Scanner(System.in);
		System.out.print("Employee ID : 	");
		int id = sc.nextInt();

		List<Employee> eList = sbu.getEmplist()
			.stream()
			.filter(e -> e.getEmployeeId() == id)
			.collect(Collectors.toList());

		eList.forEach(e -> System.out.print("Employee Info:\n" +
				"Employee ID          : " + e.getEmployeeId() +
				"\nEmplpoyee NAME       : " + e.getEmployeeName() +
				"\nEmployee SALARY      : " + e.getSalary()));
	}

}
