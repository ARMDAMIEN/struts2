package fr.formation.inti.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.inti.dao.IEmployeeDao;
import fr.formation.inti.entity.Employee;

@Service
@Transactional
public class EmployeeService implements IEmployeeService {
	private final Log log = LogFactory.getLog(EmployeeService.class);
	
	@Autowired
	@Qualifier("dao")
	private IEmployeeDao dao;
	
//	@Autowired
	public EmployeeService(IEmployeeDao dao) {
		log.info("new EmployeeService");
		this.dao=dao;
	}

	@Override
	public Integer save(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public void update(Employee employee) {
		dao.update(employee);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public Employee findById(Integer id) {
		// TODO Auto-generated method stub

		return dao.findById(id);
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
	
		List<Employee> list = dao.findAll();
		return list;
	}

	public void setDao(IEmployeeDao dao) {
		this.dao = dao;
	}
	
	
	

}
