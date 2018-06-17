package blog.junit;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.sql.Connection;
import org.junit.Test;

import blog.dao.UserDao;
import blog.daoImpl.UserDaoImpl;
import blog.model.User;

public class UserTest {
	
	@Test
	public void testLogin() throws Exception{			
		String name="���ݿ���";
		String password="����";
		
		UserDao userDao = UserDaoImpl.getInstance();
		User user = userDao.login(name, password);
		if(user!=null){
			System.out.println(user.getUser_id());
			System.out.println(user.getUser_name());
			System.out.println(user.getUser_password());
		}	else{
			System.out.println("Login failed");
		}
		
	}
}
