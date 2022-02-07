package fr.formation.inti.service;

import fr.formation.inti.dao.IGenericDao;
import fr.formation.inti.entity.User;

public interface IUserService extends IGenericDao<User, Integer> {
	
	
	User findByLoginAndPassword(String login, String password) ;
	
	Integer ajouterUser(User user);

}
