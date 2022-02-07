package fr.formation.inti.service;

import java.util.List;

import fr.formation.inti.dao.IUserDao;
import fr.formation.inti.dao.UserDao;
import fr.formation.inti.entity.User;

public class UserService implements IUserService{
	private IUserDao dao ;
	
	public UserService() {
		dao = new UserDao();
	}

	public User findByLoginAndPassword(String login, String password) {
		dao.beginTransaction();
		User user = dao.findByLoginAndPassword(login, password);
		dao.commitTransaction();
		return user;
	}

	public Integer ajouterUser(User user) {
		dao.beginTransaction();
		Integer id = dao.save(user);
		dao.commitTransaction();
		return id;
	}
	
	public static void main(String[] args) {
		IUserService service = new UserService();
		
		service.findByLoginAndPassword("root", "123456");
	}

	@Override
	public Integer save(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findById(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rollBackTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
