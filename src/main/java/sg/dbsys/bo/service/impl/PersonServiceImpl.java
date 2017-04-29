package sg.dbsys.bo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import sg.dbsys.bo.service.PersonService;
import sg.dbsys.dao.PersonDAO;
import sg.dbsys.dao.entity.Person;

public class PersonServiceImpl implements PersonService {

	PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	
	@Transactional
	public void addPerson(Person p) 
	{
		personDAO.addPerson(p);
	}

	public void updatePerson(Person p) {
		// TODO Auto-generated method stub

	}

	public List<Person> listPersons() {
		
		
		return personDAO.listPersons();
	}

	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removePerson(int id) {
		// TODO Auto-generated method stub

	}

}
