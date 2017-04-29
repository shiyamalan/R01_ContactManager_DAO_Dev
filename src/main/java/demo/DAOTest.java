package demo;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sg.dbsys.bo.service.PersonService;
import sg.dbsys.dao.entity.Person;

public class DAOTest {

	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bean_configuration.xml");
		PersonService employeeService = ctx.getBean("personServiceImpl", PersonService.class);
		
		
		createEmployee(employeeService);
		//getEmployeeById(employeeService);
		
		fetchAllEmployeesInfo(employeeService);
		
		//employeeService.updateEmployeeEmailById("Jimmy.s100@yahoo.com", 2);
		//employeeService.deleteEmployeeById(13);
		ctx.close();
	}

	private static void fetchAllEmployeesInfo(PersonService personService) {
		List<Person> personList = personService.listPersons();
		for (Person person : personList) {
			System.out.println(person.getId()+"\t"+person.getName()+"\t"+person.getCountry());
		}
	}

	private static void createEmployee(PersonService personService) {
		Person person = new Person();
		
		person.setName("Vinay");
		person.setCountry("Sri Lanka");
		
		personService.addPerson(person);
	}
	
}
