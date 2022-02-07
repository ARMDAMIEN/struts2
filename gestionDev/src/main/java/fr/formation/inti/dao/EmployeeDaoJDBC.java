package fr.formation.inti.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import fr.formation.inti.entity.Employee;

@Repository
public class EmployeeDaoJDBC extends GenericDaoHibernate<Employee, Integer> implements IEmployeeDao {
private final Log log = LogFactory.getLog(EmployeeDaoJDBC.class);
	
	public EmployeeDaoJDBC() {
		
		log.info("------------------------------ create new EmployeeDao" );
		
	}
}
