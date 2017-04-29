package sg.dbsys.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;

import sg.dbsys.dao.PersonDAO;
import sg.dbsys.dao.entity.Person;


public class PersonDAOImpl implements PersonDAO {

	private static final Logger logger = org.slf4j.LoggerFactory
			.getLogger(PersonDAOImpl.class);
	private SessionFactory sessionFactory;
//
//	
//	private HibernateTemplate hibernateTemplate;
//	
//	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//		this.hibernateTemplate = hibernateTemplate;
//	}
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	public void addPerson(Person p) {
		Session session = sessionFactory.getCurrentSession();

		org.hibernate.Transaction tr = session.beginTransaction();

		session.persist(p);
		
		tr.commit();
		logger.info("The person object has been saved");
	}

	public void updatePerson(Person p) {

	}

	public List<Person> listPersons() 
	{
		Session session = sessionFactory.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();

		Criteria criteria = session.createCriteria(Person.class);
		List<Person> persons = (List<Person>)criteria.list();

		tr.commit();
		return persons;
	}

	public Person getPersonById(int id) {
		return null;
	}

	public void removePerson(int id) {
	}

}
