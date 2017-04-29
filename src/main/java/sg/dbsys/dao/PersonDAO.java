package sg.dbsys.dao;

import java.util.List;

import sg.dbsys.dao.entity.Person;

public interface PersonDAO {
	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
}
