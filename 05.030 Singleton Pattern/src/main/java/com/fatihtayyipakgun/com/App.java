package com.fatihtayyipakgun.com;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.xdevapi.DbDoc;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		var props = Profile.getProperties("db");
		
		var db = Database.instance();
		
		try {
			db.connect(props);
		} catch (SQLException e) {
			System.out.println("Cannot connect to database.");
			return;
		}
		
		System.out.println("Connected");
		
		UserDao userDao = new UserDaoImpl();
		
		//userDao.save(new User("Mars"));
		//userDao.save(new User("Mercury"));
		//userDao.save(new User("Neptune"));
		
		var users = userDao.getAll();
		
		users.forEach(System.out::println);
		
		var userOpt = userDao.findById(4);
		if (userOpt.isPresent()) {
			User user = userOpt.get();
			System.out.println("Retrieved: " + user);
			user.setName("Snoopy");
			userDao.update(user);
			
		} else {
			System.out.println("No user retrieved!");
		}
		
		userDao.delete(new User(5, null));
		
		try {
			db.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
