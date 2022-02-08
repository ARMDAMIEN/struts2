package fr.formation.inti.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import fr.formation.inti.entity.Employee;

@Repository("dao")
public class EmployeeDao extends GenericDaoHibernate<Employee, Integer> implements IEmployeeDao {
private final static Log log = LogFactory.getLog(EmployeeDao.class);
	
	public EmployeeDao() {
		
		log.info("------------------------------ create new EmployeeDao" );
		
	}
	
	@PostConstruct
	public void postConstruct() {
		
	}
	
	@PreDestroy
	public void preDesrtuct() {
		
		
	}
//	public static EmployeeDao createInstance() {
//		log.info("create new employee Dao by factory method");
//		return new EmployeeDao();
//	}
}
